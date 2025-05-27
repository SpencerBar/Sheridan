import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { IonContent, IonHeader, IonTitle, IonToolbar } from '@ionic/angular/standalone';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-page1',
  templateUrl: './page1.page.html',
  styleUrls: ['./page1.page.scss'],
  standalone: true,
  imports: [IonContent, IonHeader, IonTitle, IonToolbar, CommonModule, FormsModule]
})
export class Page1Page implements OnInit {

  constructor(private activeroute: ActivatedRoute) {}

  ngOnInit(){
    let data = this.activeroute.snapshot.data;
    console.log('Static Data', data);
    
    let data2 = this.activeroute.snapshot.paramMap;
    console.log('Route param - snapshot:', data2);
  }

}
