import { HttpErrorResponse } from '@angular/common/http';
import { ErrorHandler, Injectable, Injector } from '@angular/core';
import { Router } from '@angular/router';

@Injectable()
export class GlobalErrorHandlerService implements ErrorHandler{

  constructor(private injector: Injector) { }

  handleError(error: any): void {
    throw new Error('Method not implemented.');
    }
}
