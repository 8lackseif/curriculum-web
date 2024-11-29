import { Component } from '@angular/core';
import { ApiService } from '../../service/api.service';
import { ProfessionalExperienceData } from '../../models/professional-experience.model';

@Component({
  selector: 'app-experience',
  templateUrl: './experience.component.html',
  styleUrl: './experience.component.css'
})
export class ExperienceComponent {

  professional_experiences: Array<ProfessionalExperienceData> = [];

  constructor(private api: ApiService) {}

  ngOnInit() {
    this.api.getProfessionalExperiences().subscribe(
      data => {
        this.professional_experiences = data;
      }
    );
  }

}
