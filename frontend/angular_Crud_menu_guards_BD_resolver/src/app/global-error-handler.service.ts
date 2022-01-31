import { HttpErrorResponse } from '@angular/common/http';
import { ErrorHandler, Injectable, Injector } from '@angular/core';
import { Router } from '@angular/router';

@Injectable()
export class GlobalErrorHandlerService implements ErrorHandler{

  constructor(private injector: Injector) { }

  handleError(error: any): void {
    const router = this.injector.get(Router);
    console.log(`Request URL: ${router.url}`);

    if(error instanceof HttpErrorResponse){
      console.error('Backen Error: ', error.status);
      console.error('Response body: ', error.message);
    }else{
      console.error('An error occurred', error.message);
    }

    router.navigate(['error']);
  }
}
