import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

import { Observable } from 'rxjs';
import { BasicData } from '../models/basic-data.model';
import { SkillData } from '../models/skill.model';
import { LanguageData } from '../models/language.model';
import { RecognitionData } from '../models/recognition.model';
import { EducationData } from '../models/education.model';
import { SocialMediaData } from '../models/social-media.model';

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  api_url = 'http://localhost:8080';

  constructor(private http: HttpClient) { }

  getBasicData(): Observable<BasicData> {
    const headers = new HttpHeaders({
      'Content-Type': 'application/json',
    });

    return this.http.post<BasicData>(this.api_url + '/user/get', { name: "Bin", surname: "Chen" }, { headers });
  }

  getSkills(): Observable<Array<SkillData>> {
    return this.http.get<Array<SkillData>>(this.api_url + '/skill/get/1',);
  }

  getLanguages(): Observable<Array<LanguageData>> {
    return this.http.get<Array<LanguageData>>(this.api_url + '/language/get/1');
  }

  getRecognitions(): Observable<Array<RecognitionData>> {
    return this.http.get<Array<RecognitionData>>(this.api_url + '/recognition/get/1');
  }

  getEducations(): Observable<Array<EducationData>> {
    return this.http.get<Array<EducationData>>(this.api_url + '/education/get/1');
  }

  getSocialMedias(): Observable<Array<SocialMediaData>> {
    return this.http.get<Array<SocialMediaData>>(this.api_url + '/social_media/get/1');
  }
}
