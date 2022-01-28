import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, CanActivate, RouterStateSnapshot, UrlTree } from '@angular/router';
import { Observable } from 'rxjs';
import { PersonasService } from './personas.service';

@Injectable({
  providedIn: 'root'
})
export class CheckViewGuard implements CanActivate {

  constructor(private persService: PersonasService){}

  canActivate(): boolean{
    return !this.persService.ischeck();
  }
  
}
