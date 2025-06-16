import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { IonContent, IonHeader, IonTitle, IonToolbar } from '@ionic/angular/standalone';
import { DataService } from 'src/app/data.service';
@Component({
  selector: 'app-page1',
  templateUrl: './page1.page.html',
  styleUrls: ['./page1.page.scss'],
  standalone: true,
  imports: [IonContent, IonHeader, IonTitle, IonToolbar, CommonModule, FormsModule]
})
export class Page1Page implements OnInit {
  myMsg!: any;
  constructor(private serv: DataService) { }

  ngOnInit() {
    this.serv.asObserver_page.subscribe(
      {
        next: (message) => { this.myMsg = message; },
        error: (err) => { console.log(`Error is ${err}.`); },
        complete: () => {
          console.log('Done');
        }
      })//end of subscribe
  }//end of ngoninit
}//end of class


