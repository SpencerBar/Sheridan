import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { IonContent, IonHeader, IonTitle, IonToolbar } from '@ionic/angular/standalone';
import { Router } from '@angular/router';

@Component({
  selector: 'app-page2',
  templateUrl: './page2.page.html',
  styleUrls: ['./page2.page.scss'],
  standalone: true,
  imports: [IonContent, IonHeader, IonTitle, IonToolbar, CommonModule, FormsModule]
})
export class Page2Page implements OnInit {
  stateData:any;
  constructor(private router: Router) {}

  ngOnInit() {
    // Access state from navigation extras
    this.stateData = this.router.getCurrentNavigation()?.extras.state;
    console.log('Received state:', this.stateData);
  }

}
