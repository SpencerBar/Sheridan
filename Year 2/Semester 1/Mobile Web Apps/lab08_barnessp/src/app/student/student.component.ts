import { Component, Input } from '@angular/core';
import { Student } from '../web.service';

@Component({
  selector: 'app-student',
  standalone: true,
  imports: [],
  templateUrl: './student.component.html',
  styleUrl: './student.component.css'
})
export class StudentComponent {
  @Input() student: Student = {firstName:"", lastName:"",email:""};
}
