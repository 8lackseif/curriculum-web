import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrl: './header.component.css'
})
export class HeaderComponent {
  @Output() changeVisibility = new EventEmitter<boolean>();

  visibility:boolean = false;

  

  changeSidebarVisibility() {
    this.visibility = !this.visibility;
    this.changeVisibility.emit(this.visibility);
  }

  fullScreen(){
    document.documentElement.requestFullscreen();
  }
}
