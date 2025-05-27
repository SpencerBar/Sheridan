import { Component } from '@angular/core';
import { IonButton, IonHeader, IonToolbar, IonTitle, IonContent } from '@ionic/angular/standalone';
import { ExploreContainerComponent } from '../explore-container/explore-container.component';
import { Router, RouterModule } from '@angular/router';


@Component({
  selector: 'app-tab2',
  templateUrl: 'tab2.page.html',
  styleUrls: ['tab2.page.scss'],
  imports: [IonHeader, IonToolbar, IonTitle, IonContent, ExploreContainerComponent,RouterModule,IonButton]
})
export class Tab2Page {

  constructor(private router: Router) {}
goPage2() {
this.router.navigate(['/page2'])
.then(nav => {
console.log(nav); },
err => { console.log(err); });
}



}
