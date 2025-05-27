import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { IonContent, IonHeader, IonTitle, IonToolbar } from '@ionic/angular/standalone';
import { C1Component } from 'src/app/c1/c1.component';
import { IonItem, IonLabel, IonInput } from '@ionic/angular';
import { C2Component } from 'src/app/c2/c2.component';
interface Man { fName: string; lName: string; nName: string; }


@Component({
  selector: 'app-page1',
  templateUrl: './page1.page.html',
  styleUrls: ['./page1.page.scss'],
  standalone: true,
  imports: [IonContent, IonHeader, IonTitle, IonToolbar, CommonModule, FormsModule,C1Component, C2Component]
})
export class Page1Page implements OnInit {
  myInfo:Man={fName:"Spencer", lName:"Barnes", nName:"SB"};
  constructor() { }

  ngOnInit() {
  }

}
