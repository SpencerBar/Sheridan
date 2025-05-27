import { Injectable } from '@angular/core';
import { PInterface } from './pinterface';
import { PDATA } from 'src/assets/data/pdata';
@Injectable({
  providedIn: 'root'
})
export class GetdataService {
  loadData():PInterface{
    return PDATA;
  }

// Store an item
setData(key:string, value:any) {
localStorage.setItem(key, value);
}

// Retrieve an item
data: any;
getData(key:string) {
this.data = localStorage.getItem(key);
return this.data;
}

// Remove an item
removeData(key:string) {
localStorage.removeItem(key);
}

  constructor() { }
}
