import { HttpErrorResponse, HttpEvent, HttpHandler, HttpInterceptor, HttpRequest } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, throwError } from 'rxjs';
import { GlobalErrorHandlerService } from './global-error-handler.service';
import { catchError } from 'rxjs/operators';
@Injectable({
  providedIn: 'root'
})
export class ErrorInterceptorService implements HttpInterceptor{

  constructor(private errorHand: GlobalErrorHandlerService) { }
  intercept(req: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {
    console.log('Method not implemented.');
    return next.handle(req)
      .pipe(
          catchError((error: HttpErrorResponse) => {
            this.errorHand.handleError(error);
            return throwError(error.error);
          })
      );
  }
}
