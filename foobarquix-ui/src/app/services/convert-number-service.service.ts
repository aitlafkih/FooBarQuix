import { Injectable } from '@angular/core';

import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { catchError, retry } from 'rxjs/operators';
import { environment } from '../../environments/environment';
import { Result } from '../model/result';

@Injectable({
  providedIn: 'root'
})
export class ConvertNumberServiceService {

  protected baseUrl =environment.apiPath ;
  constructor(
    private http: HttpClient
  ) { }

  public convertNumber(inputValue: Number): Observable<Result> {
    const url = `${this.baseUrl}/foo-bar-quix/${inputValue}`; 
    return this.http.get<Result>(url);
  }
}
