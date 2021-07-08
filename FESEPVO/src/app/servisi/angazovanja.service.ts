import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { IAngazovanja } from '../models/angazovanja';

@Injectable({
  providedIn: 'root'
})
export class AngazovanjaService {

  constructor(private http:HttpClient) { }

  public getAll(): Observable<IAngazovanja[]> {
    return this.http.get<IAngazovanja[]>('http://localhost:8080/angazovanje');
  }

  public deleteAngazovanje(nastavno_osoblje_id:number,predmet_id:number){
    return this.http.post('http://localhost:8080/angazovanje/delete',{nastavno_osoblje_id,predmet_id},{responseType: 'text'});
  }


}
