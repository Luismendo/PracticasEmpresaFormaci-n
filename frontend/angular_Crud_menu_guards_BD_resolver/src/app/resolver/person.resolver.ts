import { ActivatedRouteSnapshot, Resolve } from '@angular/router';
import { Injectable } from '@angular/core';
import { Persona, PersonaHttp } from '../personas/persona';
import { Observable, of } from 'rxjs';
import { PersonasService } from '../personas/personas.service';

@Injectable({
    providedIn: 'root'
})

export class PersonResolver implements Resolve<Observable<any>>{

    constructor(private _api_person: PersonasService){}

    resolve(route: ActivatedRouteSnapshot){

        return this._api_person.getHttp();
        //await this.ddelay(1000);     
    }
    
    ddelay(ms: number) {
        return new Promise( resolve => setTimeout(resolve, ms) );
    }
}