import { Component } from '@angular/core';
import { IonCard, IonHeader, IonToolbar, IonTitle, IonContent, IonFooter, IonButton, IonBackButton, IonButtons, IonMenuButton, IonCardContent, IonCardHeader, IonCardSubtitle, IonCardTitle, IonList, IonListHeader, IonItem, IonLabel, IonRow, IonGrid, IonCol, IonImg, IonThumbnail, IonInput, IonRadioGroup, IonRadio, IonCheckbox } from '@ionic/angular/standalone';
import { ExploreContainerComponent } from '../explore-container/explore-container.component';
import { ActionSheetController, AlertController } from '@ionic/angular';
import { FormsModule, NgForm, ReactiveFormsModule, FormGroup, FormBuilder, Validators } from '@angular/forms';


@Component({
  selector: 'app-tab1',
  templateUrl: 'tab1.page.html',
  styleUrls: ['tab1.page.scss'],
  imports: [IonCheckbox, IonRadio, IonRadioGroup, IonInput, IonImg, IonCol, IonGrid, IonRow, IonLabel, IonItem, IonListHeader, IonList, IonBackButton, IonButton, IonFooter, IonHeader, IonToolbar, IonTitle, IonContent, IonCard, IonMenuButton, IonCardHeader, IonCardSubtitle, IonCardTitle, IonCardContent, FormsModule, ReactiveFormsModule, IonThumbnail ],
})
export class Tab1Page {
  constructor(public actionSheetController: ActionSheetController, public alertControl: AlertController, private formBuilder: FormBuilder) { }
  
  myPics = [{src: "assets/1.png", text: '1'}, {src: "assets/2.jpg", text: '2'}]
  pgArray = ['JavaScript', 'Python', 'Java', 'Go', 'Elixir',
    'Ruby', 'Kotlin'];
  id: any; lName: any; fName: any; radio: any;
  check = [
    { label: "JavaScript", checked: true },
    { label: "Java", checked: false },
    { label: "Python", checked: false },
    { label: "PHP", checked: false },
    { label: "HTML", checked: true }
  ];

  
  async presentActionSheet() {
    const actionSheet = await this.actionSheetController.create({
      header: 'My Menu',
      buttons: [{
        text: 'Delete', icon: 'trash',
        role: 'destructive',
        handler: () => { console.log('Delete'); }
      },
      {
        text: 'Share', icon: 'share',
        handler: () => { console.log('Share'); }
      },
      {
        text: 'Cancel', icon: 'close', role: 'cancel',
        handler: () => { console.log('Cancel'); }
      }
      ]
    });
    await actionSheet.present();
  }

  async alertAction() {
    const alert = await this.alertControl.create({
      header: 'Alert',
      subHeader: '',
      message: 'This is an Alert Message',
      buttons: [
        {
          text: 'Cancel',
          handler: () => { console.log('Confirm cancel!'); }
        },
        {
          text: 'OK',
          handler: () => { console.log('Confirm OK!'); }
        }, { text: 'New', handler: () => { console.log('New Button') } }]
    });
    await alert.present();
  }

  async confirm(form: NgForm) {
    const alert = await this.alertControl.create({
      header: 'New Student Account',
      subHeader: '',
      message: 'Please confirm account creation.',
      buttons: [
        {
          text: 'Cancel',
          handler: () => { console.log('Confirm cancel!'); }
        },
        {
          text: 'OK',
          handler: () => {
            console.log('Confirm OK!');
            this.goCheck(form);
          }
        }
      ]
    });
    await alert.present();
  }

  onCheckboxChange(e: any, i: number) {
    this.check[i].checked = e.target.checked;
  }
  goCheck(form: NgForm) {
    form.value.checkbox = [];
    this.check.forEach(x => {
      if (x.checked) {
        form.value.checkbox.push(x.label)
      }
    })
    console.log(form.value)
  }



}
