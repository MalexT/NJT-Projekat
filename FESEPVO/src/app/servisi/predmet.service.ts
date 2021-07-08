import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { IPredmet } from '../models/predmet';

@Injectable({
  providedIn: 'root'
})
export class PredmetService {

  constructor(private http: HttpClient) { }

  public getAll(): Observable<IPredmet[]> {
    return this.http.get<IPredmet[]>('http://localhost:8080/predmet');
  }
}
