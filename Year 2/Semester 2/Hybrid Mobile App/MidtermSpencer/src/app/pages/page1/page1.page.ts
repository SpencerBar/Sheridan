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
  message:any;
  result: any;
  optionalParam!: string | null;
  
 constructor(private route: ActivatedRoute) {
  
 }

  ngOnInit() {
  // Snapshot param example
  const id = this.route.snapshot.paramMap.get('id');
  this.message = id ? `Optional ID received: ${id}` : 'No ID provided in route param';

  this.route.paramMap.subscribe(data=> {
  data.keys.forEach(key => {
  console.log(`${key}: ${data.get(key)}`);
});
})
  this.result = this.route.snapshot.paramMap;
  this.optionalParam = this.result.get('Optional');
}}




