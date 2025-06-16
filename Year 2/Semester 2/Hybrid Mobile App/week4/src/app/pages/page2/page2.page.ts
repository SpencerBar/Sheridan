import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { IonContent, IonHeader, IonTitle, IonToolbar } from '@ionic/angular/standalone';
import { ActivatedRoute } from '@angular/router';
@Component({
  selector: 'app-page2',
  templateUrl: './page2.page.html',
  styleUrls: ['./page2.page.scss'],
  standalone: true,
  imports: [IonContent, IonHeader, IonTitle, IonToolbar, CommonModule, FormsModule]
})
export class Page2Page implements OnInit {

  constructor(private activeRoute:ActivatedRoute) { }

  ngOnInit() {
    let data= this.activeRoute.snapshot.queryParamMap;
    data.keys.forEach(key => {
    console.log(`${key}: ${data.get(key)}`);
 })

  }

}
