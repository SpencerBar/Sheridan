import { Component } from '@angular/core';
import { ExploreContainerComponent } from '../explore-container/explore-container.component';
import { FormsModule } from '@angular/forms';
import { IonicModule } from '@ionic/angular';
import { NodeService } from '../node.service';

@Component({
  selector: 'app-tab2',
  templateUrl: 'tab2.page.html',
  styleUrls: ['tab2.page.scss'],
  imports: [ExploreContainerComponent, FormsModule, IonicModule,]
})
export class Tab2Page {

  outMsg: any = {msg: '', degree: ''};
outMsg2: any = {msg: '', degree: ''};
cel: any; fah: any;
constructor(private node: NodeService) {}
getcelsius() {
const data = { degree: this.fah };
this.node.fahrenheit(data).subscribe({
next: (data:any) => { console.log(data);
this.outMsg = data; },
error: (e) => { console.error(e);
this.outMsg.msg = e.message; },
complete: () => console.info('Complete')
});
}
getfahrenheit() {
const data = { degree: this.cel };
this.node.celsius(data).subscribe({
next:(data:any) => { console.log(data);
this.outMsg2 = data; },
error:(e) => { console.error(e);
this.outMsg2.msg = e.message; },
complete:() => console.info('Complete')
});
}

}
