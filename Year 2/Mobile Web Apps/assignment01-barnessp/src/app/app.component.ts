import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { toFraction } from './fractions';
import { toDecimal } from './decimals';
import { CommonModule } from '@angular/common'
import {TableComponent} from "./table/table.component";


//Constant FACT for inch to cm conversion
const FACT = 2.54;
@Component({
  selector: 'app-root',
  standalone: true,
  imports: [FormsModule, RouterOutlet,TableComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})

export class AppComponent {
  //properties
  title = 'assignment01-barnessp';
  inch = "1";
  cm:number = 2.54;
  fractionUsed: boolean = false;
  selectedBase:number = 16;
  simplify:boolean = false;
  conversionSteps: string = "1 in * 2.54 = 2.54 cm";
  row="";
  tablerows: string[] = [];

   addRow()
   {
    this.tablerows.push(this.row)
   }

  getRange(n: number): number[] {
    return Array.from({ length: n }, (_, i) => i + 1);
  }

  buildTable() {
    this.tablerows = [];
    for (let i of this.getRange(this.selectedBase)) {
      let fraction = `${i}/${this.selectedBase}`;
      let decimal = i / this.selectedBase;
      let metric = decimal * 2.54;;
      this.row = ""
    }}


  constructor(){
    this.convertInchToCm();
    console.log("===== toDecimal() =====");
    console.log(toDecimal("1"));
    console.log(toDecimal("1.2"));
    console.log(toDecimal("1/2"));
    console.log(toDecimal("1/16"));
    console.log(toDecimal("3/2"));
    console.log(toDecimal("1 2/3"));
    console.log("===== toFraction() =====");
    console.log(toFraction(1,16,false));
    console.log(toFraction(0.1,16,false));
    console.log(toFraction(1.2,16,false));
    console.log(toFraction(1.5,16,false));
    console.log(toFraction(1.96,16,false));
    console.log(toFraction(1.97,16,false));
    }


  convertInchToCm(){
    this.conversionSteps = this.inch + " in * 2.54 = " ;
    // 1. convert fraction inch to decimal inch
      let inch = toDecimal(this.inch);
      
    //2. unit conversion inch to cm
      this.cm = inch * FACT;
      if (this.inch == inch.toString()){
        this.conversionSteps +=  this.cm.toString() + " cm";
      }
      else{
        this.conversionSteps += inch.toString() +" in = " + this.cm.toString() + " cm";
      }
    }
 convertCmToInch(){
  if (this.fractionUsed) {
    this.conversionSteps = this.cm.toString() + " cm / 2.54 = " +(this.cm/2.54).toString() + " in = ";
    this.inch = toFraction(this.cm/FACT, this.selectedBase,this.simplify);
    this.conversionSteps += this.inch + " in";

  } 
  else {
    this.conversionSteps = this.cm.toString() + " cm / 2.54 = ";
    this.inch = (this.cm / FACT).toString();
    this.conversionSteps +=  this.inch + " in";
    
  }



  
}

}
