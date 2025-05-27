import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-content',
  imports: [FormsModule],
  templateUrl: './content.component.html',
  styleUrl: './content.component.css'
})
export class ContentComponent {
  city:string='Brampton';
  myImage="/images/sample.png";
  clearCity(){
    this.city='';
  }

  mouse1(){
    this.city=("Oakville");
  }
  mouse2(){
    this.city=("Mississauga");
  }


}
