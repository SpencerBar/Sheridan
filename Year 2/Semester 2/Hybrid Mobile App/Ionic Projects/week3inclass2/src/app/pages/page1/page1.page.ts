import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { IonBackButton, IonButton, IonContent, IonHeader, IonTitle, IonToolbar } from '@ionic/angular/standalone';




@Component({
  selector: 'app-page1',
  templateUrl: './page1.page.html',
  styleUrls: ['./page1.page.scss'],
  standalone: true,
  imports: [IonButton,IonContent, IonHeader, IonTitle, IonToolbar, CommonModule, FormsModule,IonBackButton]
})
export class Page1Page implements OnInit {

  constructor() { }

  ngOnInit() {
  }

}
