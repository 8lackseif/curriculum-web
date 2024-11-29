import { NgModule } from '@angular/core';
import { CommonModule, HashLocationStrategy, LocationStrategy, PathLocationStrategy } from '@angular/common';
import { RouterLink, RouterLinkActive, RouterModule } from '@angular/router';
import { LayoutComponent } from './layout/layout.component';
import { SidebarModule } from 'primeng/sidebar';
import { HeaderComponent } from './layout/header/header.component';
import { MenuComponent } from './layout/menu/menu.component';
import { ButtonModule } from 'primeng/button';
import { HomeComponent } from './views/home/home.component';
import { MenuModule } from 'primeng/menu';
import { ProjectsComponent } from './views/projects/projects.component';
import { ToolbarModule } from 'primeng/toolbar';
import { CardModule } from 'primeng/card';
import { SplitterModule } from 'primeng/splitter';
import { ApiService } from './service/api.service';
import { TabViewModule } from 'primeng/tabview';
import { RatingModule } from 'primeng/rating';
import { FormsModule } from '@angular/forms';
import { AccordionModule } from 'primeng/accordion';
import { ExperienceComponent } from './views/experience/experience.component';
import { TimelineModule } from 'primeng/timeline';

@NgModule({
    declarations: [LayoutComponent, HeaderComponent, MenuComponent, HomeComponent, ProjectsComponent, ExperienceComponent],
    exports: [LayoutComponent],
    imports: [
        RouterModule, RouterLink, RouterLinkActive, CommonModule, SidebarModule, ButtonModule, MenuModule, ToolbarModule, CardModule, SplitterModule,
        TabViewModule, RatingModule, FormsModule, AccordionModule, TimelineModule      
    ],
    providers: [
        { provide: LocationStrategy, useClass: PathLocationStrategy }, ApiService
    ]
})
export class AppModule {}