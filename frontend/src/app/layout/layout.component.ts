import { Component } from '@angular/core';

@Component({
  selector: 'app-layout',
  templateUrl: './layout.component.html',
  styleUrl: './layout.component.css'
})
export class LayoutComponent {
  sidebarVisible = false;

  showSidebar(visibility: boolean) {
    this.sidebarVisible = visibility;
  }
}
