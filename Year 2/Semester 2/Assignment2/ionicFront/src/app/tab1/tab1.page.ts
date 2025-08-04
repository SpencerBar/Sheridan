import { Component } from '@angular/core';
import { IonHeader,  IonToolbar,  IonTitle,  IonContent,  IonButton,  IonLabel,  IonItem,  IonInput} from '@ionic/angular/standalone';
import { ExploreContainerComponent } from '../explore-container/explore-container.component';
import { NodeService } from '../node.service';
import { FormsModule } from '@angular/forms';
import { HttpClient } from '@angular/common/http';

import { RouterLink } from '@angular/router';
import { CommonModule } from '@angular/common';



@Component({
  selector: 'app-tab1',
  templateUrl: 'tab1.page.html',
  styleUrls: ['tab1.page.scss'],
  standalone: true,
  imports: [
    IonHeader,IonToolbar, IonTitle, IonContent, IonButton, IonItem, IonLabel, IonInput, ExploreContainerComponent,FormsModule]
})
export class Tab1Page {
  outMsg: any = { msg: '' };
  cId: any;
  wDay: any;
  prof: any;

  constructor(private node: NodeService) {}

  insert() {
    const data = { cid: this.cId, wday: this.wDay, prof: this.prof };
    this.node.insert(data).subscribe({
      next: (v: any) => {
        console.log(v);
        this.outMsg = v;
      },
      error: (e) => {
        console.error(e);
        this.outMsg.msg = e.message;
      },
      complete: () => console.info('Complete')
    });
  }

  retrieve() {
    const data = { cid: this.cId, wday: this.wDay, prof: this.prof };
    this.node.retrieve(data).subscribe({
      next: (v: any) => {
        console.log(v);
        this.outMsg = v;
      },
      error: (e) => {
        console.error(e);
        this.outMsg.msg = e.message;
      },
      complete: () => console.info('Complete')
    });
  }
}
