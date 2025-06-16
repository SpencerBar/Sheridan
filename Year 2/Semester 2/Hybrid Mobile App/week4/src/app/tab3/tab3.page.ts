import { Component } from '@angular/core';
import { IonButton,IonHeader, IonToolbar, IonTitle, IonContent } from '@ionic/angular/standalone';
import { ExploreContainerComponent } from '../explore-container/explore-container.component';
import { Router,RouterModule } from '@angular/router';
@Component({
  selector: 'app-tab3',
  templateUrl: 'tab3.page.html',
  styleUrls: ['tab3.page.scss'],
  imports: [RouterModule,IonButton,IonHeader, IonToolbar, IonTitle, IonContent, ExploreContainerComponent],
})
export class Tab3Page {
  constructor(private router:Router) {}
  goPage2(){
     let qData=
        {queryParams:{title:'QueryParams',from:'Fromtab3'}};
    let qData2='title=QueryParams&from=Fromtab3&method=ByUrl';
        
    this.router.navigate(["/page2"],qData)
    .then(nav => { console.log(nav); },
      err => { console.log(err); }); 

      /*this.router.navigateByUrl(`/page2?${qData2}`)
      .then(nav => { console.log(nav); },
      err => { console.log(err); });*/

    }//end of gopage2
  
}//end of class
