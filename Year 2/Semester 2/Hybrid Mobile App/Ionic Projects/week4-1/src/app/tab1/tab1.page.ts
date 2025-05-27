import { Component } from '@angular/core';
import { IonHeader, IonToolbar, IonTitle, IonContent, IonButton } from '@ionic/angular/standalone';
import { ExploreContainerComponent } from '../explore-container/explore-container.component';
import { Router, RouterModule } from '@angular/router';


@Component({
  selector: 'app-tab1',
  templateUrl: 'tab1.page.html',
  styleUrls: ['tab1.page.scss'],
  imports: [IonButton, IonHeader, IonToolbar, IonTitle, IonContent, ExploreContainerComponent, IonButton,RouterModule],
})
export class Tab1Page {
  
constructor (private router: Router) {}
goPage1b(){
  let p1Data1 = 'Hello Page 1', p1Data2 = 'Hello Page 1 ByUrl';

  this.router.navigateByUrl('/page1/${p1Data2}')
  .then(nav => {console.log(nav)},
  err => { console.log(err);});
}
 
}