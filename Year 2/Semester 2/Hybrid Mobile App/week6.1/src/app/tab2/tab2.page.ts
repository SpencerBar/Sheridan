import { Component } from '@angular/core';
import { IonCard, IonHeader, IonToolbar, IonTitle, IonContent, IonFooter, IonButton, IonBackButton, IonButtons, IonMenuButton, IonCardHeader, IonCardSubtitle, IonCardTitle, IonCardContent, IonRow, IonCol, IonLabel, IonCheckbox, IonItem, IonListHeader, IonList, IonRadio, IonRadioGroup, IonInput, IonSearchbar, IonSelectOption } from '@ionic/angular/standalone';
import { ExploreContainerComponent } from '../explore-container/explore-container.component';
import { ReactiveFormsModule, FormsModule, NgForm, FormGroup, FormBuilder, Validators } from '@angular/forms';
import { AlertController } from '@ionic/angular';


@Component({
  selector: 'app-tab2',
  templateUrl: 'tab2.page.html',
  styleUrls: ['tab2.page.scss'],
  imports: [IonSearchbar, IonInput, IonRadioGroup, IonRadio, IonList, IonListHeader, IonItem, IonCheckbox, IonLabel, IonCol, IonRow, IonHeader, IonToolbar, IonTitle, IonContent, ExploreContainerComponent, IonButton, IonBackButton, IonMenuButton, ReactiveFormsModule, IonSelectOption, FormsModule]
})
export class Tab2Page {

  constructor(private alertControl: AlertController,
    private formBuilder: FormBuilder) { }

  id: any; lName: any; fName: any; radio: any; check!: any[];
  ionicForm!: FormGroup;
  items = ['Audi', 'BMW', 'Honda'];
  allItems = this.items;
  item: any;
  breakfast = [{ value: 'egg', desc: 'Egg' },
  { value: 'toast', desc: 'Toast' },
  { value: 'bacon', desc: 'Bacon' },
  { value: 'sausage', desc: 'Sausages' },
  { value: 'pancake', desc: 'Pan Cake' }];

  ngOnInit() {
    this.check = [
      { label: "JavaScript", checked: false, value: "javascript" },
      { label: "Java", checked: false, value: 'java' },
      { label: "Python", checked: false, value: 'python' },
      { label: "PHP", checked: true, value: 'php' },
      { label: "HTML", checked: false, value: 'html' }
    ];
    this.ionicForm = this.formBuilder.group({
      id: [123, [Validators.minLength(2),
      Validators.pattern(/^[0-9]+$/),
      Validators.minLength(2)]],
      fName: ['Andy', [Validators.required, Validators.minLength(2)]],
      lName: ['Pak', [Validators.required, Validators.minLength(2)]],
      radio: ['', [Validators.required]],
      checkbox: this.formBuilder.array([])
    })
  }

  onCheckboxChange(e: any, i: number) {
    this.check[i].checked = e.target.checked;
  }
  async confirm() {
    if (!this.ionicForm.valid)
      console.log('Please provide all the required values!')
    else {
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
              this.goCheck();
            }
          }
        ]
      });
      await alert.present();
    }
  }

  goCheck() {
    this.ionicForm.value.checkbox = [];
    this.check.forEach(x => {
      if (x.checked) {
        this.ionicForm.value.checkbox.push(x.value)
      }
    })
    console.log(this.ionicForm.value)
  }

  search(ev: any) {
    const val = ev.target.value;
    if (val && val.trim() !== '') {
      this.items = this.allItems.filter((item) => {
        return (item.toLowerCase().indexOf(val.toLowerCase()) > -1);
      });
    } else { this.items = this.allItems; }
  }

  onClick(item: any) {
    console.log(item + ' selected');
  }

  upDate(sel: any) {
  console.log(sel.target.value);
  }


}
