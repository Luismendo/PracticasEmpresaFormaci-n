import { Injectable } from '@angular/core';
import { Personas } from './mock-persona';
import { Persona } from './persona'

import { Observable, of, Subject} from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class PersonasService {

  private personas: Persona[] = Personas;
  private personas$: Subject<Persona[]>;
  private pre_perso: Persona | undefined;

  private checkObserv: Subject<boolean>;

  constructor() {
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

  getPersonas$(): Observable<Persona[]>{
    return this.personas$.asObservable();
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

  
}
