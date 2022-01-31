import { ActivatedRouteSnapshot, Resolve } from '@angular/router';
import { Injectable } from '@angular/core';
import { Persona } from '../personas-all-structures/persona';
import { Observable, of } from 'rxjs';
import { PersonasService } from '../personas-all-structures/personas.service';

@Injectable({
    providedIn: 'root'
})

export class PersonResolver implements Resolve<Persona[]>{
    arrPeronas: Persona[] = this._api_person.getPersonas();
    constructor(private _api_person: PersonasService){

    }

    async resolve(route: ActivatedRouteSnapshot){

        this._api_person.getPersonas$().subscribe(peronas => {

            this.arrPeronas = peronas;
        });


        //await this.ddelay(1000);
        
        return this.arrPeronas;

        
    }
    ddelay(ms: number) {
        return new Promise( resolve => setTimeout(resolve, ms) );
    }
}