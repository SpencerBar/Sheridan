import { Component } from '@angular/core';
import { Student } from '../student';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-header',
  imports: [CommonModule],
  templateUrl: './header.component.html',
  styleUrl: './header.component.css'
})
export class HeaderComponent {
sname:string = "Spencer";
currStudent :Student = {sid:2345,sname:"Spencer",scampus:"Oakville",slogin:"Barnessp"}
}
