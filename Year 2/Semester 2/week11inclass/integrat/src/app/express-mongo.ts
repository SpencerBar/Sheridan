import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ExpressMongo {
  
  constructor(private http: HttpClient) {}

  insert(data: any) {
    return this.http.post('http://127.0.0.1:8887/insert',{data});
  }
  retrieve(params:any){
    return this.http.get('http://127.0.0.1:8887/retrieve', {params});
  }
  update(params:any) {
    return this.http.put('http://127.0.0.1:8887/update', {data: params});
  }
  delete(params:any) {
    return this.http.delete('http://127.0.0.1:8887/delete', {params});
  }
}
