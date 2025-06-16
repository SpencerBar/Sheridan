import { Component } from '@angular/core';
import { IonButton,IonHeader, IonToolbar, IonTitle, IonContent } from '@ionic/angular/standalone';
import { ExploreContainerComponent } from '../explore-container/explore-container.component';
import { Router,RouterModule } from '@angular/router';
@Component({
  selector: 'app-tab1',
  templateUrl: 'tab1.page.html',
  styleUrls: ['tab1.page.scss'],
  imports: [RouterModule,IonButton,IonHeader, IonToolbar, IonTitle, IonContent, ExploreContainerComponent],
})
export class Tab1Page {
  constructor(private router:Router) {}
  goPage1b(){
    let p1Data1 = 'HelloPage1'
    let p1Data2 = 'HelloPage1ByUrl';

    /*this.router.navigate(['/page1',p1Data1])
    .then(nav => { console.log(nav); },
    err => { console.log(err); }); */
    
    this.router.navigateByUrl(`/page1/${p1Data2}`)
    .then(nav => { console.log(nav); },
    err => { console.log(err); });

    }

  }

