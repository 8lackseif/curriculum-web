import { Component, OnInit } from '@angular/core';
import { MenuItem } from 'primeng/api';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrl: './menu.component.css'
})
export class MenuComponent implements OnInit {
  items: MenuItem[] | undefined;

    ngOnInit() {
        this.items = [
            { label: 'home', icon: 'pi pi-building-columns', route:'/home' },
            { label: 'projects', icon: 'pi pi-hammer', route: '/projects' },
            { label: 'experience', icon: 'pi pi-building', route: '/experience'}
        ];
    }
}
