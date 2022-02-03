import { Injectable } from '@angular/core';

import { PersonaHttp, tempSend } from './persona'
import { catchError, Observable, of, Subject, tap, throwError} from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class PersonasService{

  private pre_perso: PersonaHttp | undefined;
  private tempSend: tempSend  = {id:0,name:"",usuario:"",surname:"",company_email:"",personal_email:"",
                city:"",
                active:false,
                created_date:"",
                imagen_url:"",
                termination_date:"",password:""};
  private checkObserv: Subject<boolean>;

  constructor(private http: HttpClient) {
    this.checkObserv = new Subject();

  }

  addPersona(newPersona: PersonaHttp){
    const path = 'http://localhost:8080/';
    
    console.log(newPersona);
    return this.http.post(path, newPersona);
  }

  deletePersona(id: number){
    console.log(id)
    const path = 'http://localhost:8080/id/'+id;
    return this.http.delete(path);

  }

  editPersona(newPersona: PersonaHttp){
    console.log(newPersona)
    
    this.tempSend.id = newPersona.position;
    this.tempSend.name= newPersona.name
    this.tempSend.password= newPersona.password
    this.tempSend.usuario= newPersona.usuario
    this.tempSend.surname= newPersona.surname
    this.tempSend.company_email= newPersona.company_email
    this.tempSend.personal_email= newPersona.personal_email
    this.tempSend.city= newPersona.city
    this.tempSend.active= newPersona.active
    this.tempSend.created_date= newPersona.created_date
    this.tempSend.imagen_url= newPersona.imagen_url
    this.tempSend.termination_date= newPersona.termination_date
    console.log(this.tempSend)
    const path = 'http://localhost:8080/';
    return this.http.put(path,this.tempSend);
  }

  PreEditPersona(newPersona: PersonaHttp){
    this.pre_perso = newPersona;
  }

  getPreEditPersona(){
    return this.pre_perso;
  }

  //AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
  /** 
  getPersonas$(): Observable<Persona[]>{
    return this.personas$.asObservable();
  }

    getPersonas(): Persona[]{
    return this.personas;
  }
  */

  getHttp(): Observable<PersonaHttp[]>{
    const path = 'http://localhost:8080/';
    return this.http.get<PersonaHttp[]>(path);
  }

  




  private check: boolean = false;

  ischeack(cheack: boolean){
    this.checkObserv.next(cheack);
    this.check = cheack;
  }

  ischeck(): boolean{
    return this.check;
  }

  private handleError(error: any) {
    console.error(error);
    return throwError(error);
  }
  
}
