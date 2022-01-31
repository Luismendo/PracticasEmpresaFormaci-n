import { Injectable } from '@angular/core';
import { Personas } from './mock-persona';


import { Persona } from './persona'
import { catchError, Observable, of, Subject, tap, throwError} from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import {User} from './persona';


@Injectable({
  providedIn: 'root'
})
export class PersonasService{

  private personas: Persona[] = Personas;
  private personas$: Subject<Persona[]>;
  private pre_perso: Persona | undefined;

  private checkObserv: Subject<boolean>;
/**
  apiurl = 'api/users';
  headers = new HttpHeaders().set('Content-Type', 'application/json').set('Accept', 'application/json');
  httpOptions = {
    headers: this.headers
  };
 */
  constructor(private http: HttpClient) {
    console.log("A" + this.personas)
    this.personas = Personas;
    this.personas$ = new Subject();

    this.checkObserv = new Subject();

  }

  addPersona(newPersona: Persona){
    newPersona.position = this.personas[this.personas.length-1].position+1;
    this.personas.push(newPersona);
    this.personas$.next(this.personas);
  }

  deletePersona(id: number){
    console.log("Mandas:"+id);
    id = this.personas.findIndex(x => x.position == id);
    console.log("Cambias:"+id);
    this.personas.splice(id,1);
    this.personas$.next(this.personas);
  }

  editPersona(newPersona: Persona){
    this.personas[newPersona.position] = newPersona;
    this.personas$.next(this.personas);
    this.pre_perso = undefined;
  }

  PreEditPersona(newPersona: Persona){
    this.pre_perso = newPersona;
  }

  getPreEditPersona(){
    return this.pre_perso;
  }

  //AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
  getPersonas$(): Observable<Persona[]>{
    return this.personas$.asObservable();
    /**    return this.http.get<User[]>(this.apiurl).pipe(
      tap(data => console.log(data)),
      catchError(this.handleError)
    ); */

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
