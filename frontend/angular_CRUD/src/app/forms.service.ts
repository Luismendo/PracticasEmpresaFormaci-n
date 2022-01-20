import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, of} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class FormsService {

  constructor(private http: HttpClient) { }

  info: any;

  sendInfo(send: any){
    this.info = null;
    this.info = send;
  }

  getInfo(){
    console.log(this.info)
    return this.info;
  }
}
