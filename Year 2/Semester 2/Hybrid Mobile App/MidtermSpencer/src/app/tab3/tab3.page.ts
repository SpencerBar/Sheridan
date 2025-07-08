import { Component } from '@angular/core';
import { IonHeader, IonToolbar, IonTitle, IonContent } from '@ionic/angular/standalone';
import { ExploreContainerComponent } from '../explore-container/explore-container.component';
import { Router, RouterModule } from '@angular/router';
@Component({
  selector: 'app-tab3',
  templateUrl: 'tab3.page.html',
  styleUrls: ['tab3.page.scss'],
  imports: [RouterModule,IonHeader, IonToolbar, IonTitle, IonContent, ExploreContainerComponent],
})
export class Tab3Page {
  

constructor(private router: Router) {}

goToPage2WithState() {
  this.router.navigateByUrl('/page2', {
    state: { username: 'Spencer', score: 88 }
  });
}
goToPage3WithQuery() {
this.router.navigate(['/page3'],{queryParams:{Lname:'Barnes'}});
let queryparam = 'Lname=Barnes';
this.router.navigateByUrl(`/page1?${queryparam}`);
}
}
