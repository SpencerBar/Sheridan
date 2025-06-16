import { Component } from '@angular/core';
import { IonInput,IonButton,IonHeader, IonToolbar, IonTitle, IonContent } from '@ionic/angular/standalone';
import { ExploreContainerComponent } from '../explore-container/explore-container.component';
import { RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { DataService } from '../data.service';
@Component({
  selector: 'app-tab2',
  templateUrl: 'tab2.page.html',
  styleUrls: ['tab2.page.scss'],
  imports: [IonInput,FormsModule,RouterModule,IonButton,IonHeader, IonToolbar, IonTitle, IonContent, ExploreContainerComponent]
})
export class Tab2Page {
  myMsg!:any;
  constructor(private serv:DataService) {}
  setData(){
    
     this.serv.tab2(this.myMsg);
  }

}
