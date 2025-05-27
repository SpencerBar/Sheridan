import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { IonContent, IonHeader, IonTitle, IonToolbar, IonButton } from '@ionic/angular/standalone';
import { C1Component } from 'src/app/c1/c1.component';
import { RouterModule } from '@angular/router';


@Component({
  selector: 'app-page1',
  templateUrl: './page1.page.html',
  styleUrls: ['./page1.page.scss'],
  standalone: true,
  imports: [IonContent, IonHeader, IonTitle, IonToolbar, IonButton,RouterModule, CommonModule, FormsModule, C1Component]
})
export class Page1Page implements OnInit {

  constructor() { }

  ngOnInit() {
  }

}
