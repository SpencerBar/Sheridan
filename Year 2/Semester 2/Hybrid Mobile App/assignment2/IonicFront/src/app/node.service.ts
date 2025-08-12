import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class NodeService {

  constructor(private http: HttpClient) { }
insert(inData:any): Observable<any> {
return this.http.post('http://127.0.0.1:8887/insert/',
{ inData });
}
retrieve(params:any): Observable<any> {
return this.http.get('http://127.0.0.1:8887/retrieve/',
{ params });
}

celsius(params:any): Observable<any>
{
return this.http.get('http://127.0.0.1:8888/celsius/',
{ params });
}
fahrenheit(params:any): Observable<any> {
return this.http.get('http://127.0.0.1:8888/fahrenheit/',
{ params });
}
}
