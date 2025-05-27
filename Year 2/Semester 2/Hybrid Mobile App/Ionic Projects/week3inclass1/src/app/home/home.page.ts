import { Component } from '@angular/core';
import { IonHeader, IonToolbar, IonTitle, IonContent,IonButton } from '@ionic/angular/standalone';
import { RouterModule,Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
  imports: [IonHeader, IonToolbar, IonTitle, IonContent,IonButton, RouterModule],
})
export class HomePage {
  constructor(private router: Router) {}


  goPage1() {
  this.router.navigate(['/page1'])
  .then(nav => {
  console.log(nav); },
  err => { console.log(err); }); 
  }
}
