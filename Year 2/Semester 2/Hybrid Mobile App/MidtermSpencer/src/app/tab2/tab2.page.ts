import { Component } from '@angular/core';
import { IonHeader, IonToolbar, IonTitle, IonContent, IonButton } from '@ionic/angular/standalone';
import { ExploreContainerComponent } from '../explore-container/explore-container.component';
import { Router, RouterModule} from '@angular/router';

@Component({
  selector: 'app-tab2',
  templateUrl: 'tab2.page.html',
  styleUrls: ['tab2.page.scss'],
  imports: [RouterModule,IonButton, IonHeader, IonToolbar, IonTitle, IonContent, ExploreContainerComponent]
})
export class Tab2Page {
 
  constructor(private router: Router) {}

  OptionalGo(){
  let param = "Data";
  this.router.navigateByUrl(`/page1/${param}`)
    .then(nav => { console.log(nav); },
    err => { console.log(err); });
}

goToPage1() {
  this.router.navigate(['/page1', { Optional: 'Data' }]);
}
}


