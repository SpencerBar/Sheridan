import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { IonContent, IonHeader, IonTitle, IonToolbar } from '@ionic/angular/standalone';
import { C1Component } from 'src/app/c1/c1.component';
import { PInterface } from 'src/app/pinterface';
import { GetdataService } from 'src/app/getdata.service';

@Component({
  selector: 'app-page2',
  templateUrl: './page2.page.html',
  styleUrls: ['./page2.page.scss'],
  standalone: true,
  imports: [IonContent, IonHeader, IonTitle, IonToolbar, CommonModule, FormsModule, C1Component]
})
export class Page2Page implements OnInit {
  myData!:PInterface

  constructor(private ldData:GetdataService) { }
  loadMyData():void{
    this.myData = this.ldData.loadData();
  }
  ngOnInit() {
    this.loadMyData();
  }

}
