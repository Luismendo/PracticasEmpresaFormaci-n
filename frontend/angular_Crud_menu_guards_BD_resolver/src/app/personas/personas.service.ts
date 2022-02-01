import { Injectable } from '@angular/core';
import { Personas } from './mock-persona';


import { Persona, PersonaHttp } from './persona'
import { catchError, Observable, of, Subject, tap, throwError} from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import {User} from './persona';


@Injectable({
  providedIn: 'root'
})
export class PersonasService{

  private personas: Persona[] = Personas;
  private personas$: Subject<Persona[]>;
  private pre_perso: PersonaHttp | undefined;

  private checkObserv: Subject<boolean>;

  constructor(private http: HttpClient) {
    console.log("A" + this.personas)
    this.personas = Personas;
    this.personas$ = new Subject();

    this.checkObserv = new Subject();

  }

  addPersona(newPersona: PersonaHttp){
    const path = 'http://localhost:8080/';
    //newPersona.position = this.personas[this.personas.length-1].position+1;
    console.log(newPersona);
    return this.http.post(path, newPersona);

    
    //this.personas.push(newPersona);
    //this.personas$.next(this.personas);
  }

  deletePersona(id: number){
    console.log(id)
    const path = 'http://localhost:8080/id/'+id;
    return this.http.delete(path);

  }

  editPersona(newPersona: PersonaHttp){
    const path = 'http://localhost:8080/';
    this.http.put(path,newPersona);
    /** 
    this.personas[newPersona.position] = newPersona;
    this.personas$.next(this.personas);
    this.pre_perso = undefined;*/


  }

  PreEditPersona(newPersona: PersonaHttp){
    this.pre_perso = newPersona;
  }

  getPreEditPersona(){
    return this.pre_perso;
  }

  //AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
  getPersonas$(): Observable<Persona[]>{
    return this.personas$.asObservable();
  }

  getHttp(): Observable<PersonaHttp[]>{
    const path = 'http://localhost:8080/';
    return this.http.get<PersonaHttp[]>(path);
  }

  

  getPersonas(): Persona[]{
    return this.personas;
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
