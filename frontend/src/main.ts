import { bootstrapApplication } from '@angular/platform-browser';
import { AppComponent } from './app/app.component';
import { provideRouter } from '@angular/router';
import { routes } from './app/app-routing.module';
import { importProvidersFrom } from '@angular/core';
import { BrowserAnimationsModule, provideAnimations } from '@angular/platform-browser/animations';
import { provideHttpClient, withFetch } from '@angular/common/http';

bootstrapApplication(AppComponent, { providers: [provideRouter(routes), importProvidersFrom([BrowserAnimationsModule]), provideAnimations(), provideHttpClient(withFetch())] })
  .catch((err) => console.error(err));
