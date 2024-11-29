import { Component } from '@angular/core';
import { ApiService } from '../../service/api.service';
import { getLinkPreview, getPreviewFromContent } from "link-preview-js";
import { ProjectData } from '../../models/projects.model';
import { FirstType, PreviewData } from '../../models/preview.model';

@Component({
  selector: 'app-projects',
  templateUrl: './projects.component.html',
  styleUrl: './projects.component.css'
})
export class ProjectsComponent {

  projects: Array<ProjectData> = [];
  projects_preview: Array<FirstType | null> = [];

  constructor(private api: ApiService) { }

  ngOnInit() {
    this.api.getProjects().subscribe(
      data => {
        this.projects = data;

        const previewsProjects = data.map(project =>
          getLinkPreview(project.projectLink).then(preview => {
            if (this.isVariant1(preview)) {
              console.log(preview);
              return preview;
            } else {
              console.error('Preview no es del tipo esperado:', preview);
              return null;
            }
          })
          .catch(error => {
            console.error('Error al obtener el preview:', error);
            return null;
          })
        );

        Promise.all(previewsProjects).then(previews => {
          this.projects_preview = previews.filter(preview => preview !== null);
        });

      }
    );
  }

  isVariant1(data: PreviewData): data is FirstType {
    return 'description' in data && Array.isArray(data.images);
  }
}
