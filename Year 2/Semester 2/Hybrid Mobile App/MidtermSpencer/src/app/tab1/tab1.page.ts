import { Component } from '@angular/core';
import { IonHeader, IonToolbar, IonTitle, IonContent, IonButton } from '@ionic/angular/standalone';
import { ExploreContainerComponent } from '../explore-container/explore-container.component';
import { Router, RouterModule } from '@angular/router';
import { AComponent } from '../a/a.component';
import { BComponent } from '../b/b.component';

@Component({
  selector: 'app-tab1',
  templateUrl: 'tab1.page.html',
  styleUrls: ['tab1.page.scss'],
  imports: [BComponent,AComponent,RouterModule, IonButton, IonHeader, IonToolbar, IonTitle, IonContent, ExploreContainerComponent],
})
export class Tab1Page {

  constructor(private router: Router) {}

  go() {
    const param = '123';
    this.router.navigate(['/page1', 123]);
  }

}
