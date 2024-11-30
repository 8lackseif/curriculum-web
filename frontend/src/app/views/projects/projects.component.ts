import { Component } from '@angular/core';
import { ApiService } from '../../service/api.service';
import { ProjectData } from '../../models/projects.model';

@Component({
  selector: 'app-projects',
  templateUrl: './projects.component.html',
  styleUrl: './projects.component.css'
})
export class ProjectsComponent {

  projects: Array<ProjectData> = [];

  constructor(private api: ApiService) { }

  ngOnInit() {
    this.api.getProjects().subscribe(
      data => {
        this.projects = data;
      }
    );
  }
}
