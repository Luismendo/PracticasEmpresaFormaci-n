import { ActivatedRouteSnapshot, Resolve } from '@angular/router';
import { Injectable } from '@angular/core';
import { Persona } from '../persona';
import { Observable, of } from 'rxjs';
import { PersonasService } from '../personas.service';

@Injectable({
    providedIn: 'root'
})

export class PersonResolver implements Resolve<Observable<any>>{

    constructor(private _api_person: PersonasService){

    }

    resolve(route: ActivatedRouteSnapshot){
        return of(this._api_person.getPerson$())
        //return this._api_person.getPerson$();
    }
}