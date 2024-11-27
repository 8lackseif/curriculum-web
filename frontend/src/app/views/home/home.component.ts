import { Component } from '@angular/core';
import { BasicData } from '../../models/basic-data.model';
import { ApiService } from '../../service/api.service';
import { SkillData } from '../../models/skill.model';
import { Level } from '../../models/level.enum';
import { LanguageData } from '../../models/language.model';
import { RecognitionData } from '../../models/recognition.model';
import { EducationData } from '../../models/education.model';
import { SocialMediaData } from '../../models/social-media.model';
import { getLinkPreview, getPreviewFromContent } from "link-preview-js";
import { FirstType, PreviewData } from '../../models/preview.model';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})

export class HomeComponent {

  basicData: BasicData = {
    id: 0,
    summary: '',
    name: '',
    surname: '',
    email: '',
    phoneNumber: ''
  };

  skills: Array<SkillData> = [];
  languages: Array<LanguageData> = [];
  recognitions: Array<RecognitionData> = [];
  educations: Array<EducationData> = [];

  social_medias: Array<SocialMediaData> = [];
  social_medias_previews: Array<FirstType | null> = [];

  basic = 2;
  intermediate = 4;
  advanced = 6;

  level = Level;

  constructor(private api: ApiService) { }

  ngOnInit() {
    //get user basic data
    this.api.getBasicData().subscribe(
      data => {
        this.basicData = data;
      }
    );

    //get user skills
    this.api.getSkills().subscribe(
      data => {
        this.skills = data;
      }
    );

    //get user languages
    this.api.getLanguages().subscribe(
      data => {
        this.languages = data;
      }
    );

    //get user recognitions
    this.api.getRecognitions().subscribe(
      data => {
        this.recognitions = data;
      }
    );

    //get user education
    this.api.getEducations().subscribe(
      data => {
        this.educations = data;
      }
    );

    //get user social media
    this.api.getSocialMedias().subscribe(
      data => {
        this.social_medias = data;

        const previewsPromises = data.map(sc =>
          getLinkPreview(sc.link).then(preview => {
            if (this.isVariant1(preview)) {
              return preview;
            } else {
              console.error('Preview no es del tipo esperado:', preview);
              return null;
            }
          })
        );
        Promise.all(previewsPromises).then(previews => {
          this.social_medias_previews = previews.filter(p => p !== null) as FirstType[];
        });
      }
    );

  }

  isVariant1(data: PreviewData): data is FirstType {
    return 'description' in data && Array.isArray(data.images);
  }


}



