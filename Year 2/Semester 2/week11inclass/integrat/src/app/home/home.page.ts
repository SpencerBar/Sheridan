import { Component } from '@angular/core';
import { IonHeader, IonToolbar, IonTitle, IonContent, IonButton, IonLabel, IonInput, IonItem,   } from '@ionic/angular/standalone';
import { ExpressMongo } from '../express-mongo';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
  imports: [IonHeader, IonToolbar, IonTitle, IonContent,IonButton,IonLabel,IonInput,IonItem, FormsModule],
})

export class HomePage {
  outMsg: any; cId: any; wDay: any; prof: any;
  outRec: any = [];
  constructor(private mongo: ExpressMongo) { }
  insert() {
    const data = { cid: this.cId, wday: this.wDay,
    prof: this.prof };
    this.mongo.insert(data).subscribe({
      next: (data:any) => { console.log(data);
      this.outMsg = data.message;
      this.outRec = []; },
      error: (e) => { console.error(e);
      this.outMsg = e.message; },
      complete: () => console.info('Complete') 
    });
  }

  retrieve() {
    const params = { cid: this.cId };
    this.mongo.retrieve(params).subscribe({
    next: (data:any) => { console.log(data);
    this.outRec = data;
    this.outMsg = this.outRec.length + 'retrieved'; },
    error: (e) => { console.error(e);
    this.outMsg = e.message; },
    complete: () => console.info('Complete')
    });
  }

  update() {
    const params = { cid: this.cId, wday: this.wDay,
    prof: this.prof };
    this.mongo.update(params).subscribe({
      next: (data:any) => { console.log(data);
      this.outMsg = data.message;
      this.outRec = []; },
      error: (e) => { console.error(e);
      this.outMsg = e.message; },
      complete: () => console.info('Complete')
    });
  }
  delete() {
    const params = { cid: this.cId };
    this.mongo.delete(params).subscribe({
      next: (data:any) => { console.log(data);
      this.outMsg = data.message;
      this.outRec = []; },
      error: (e) => { console.error(e);
      this.outMsg = e.message; },
      complete: () => console.info('Complete')
    });
  }
}

