import {Component} from '@angular/core';
import {IKorisnik} from './models/korisnik';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  public korisnik: IKorisnik | null = null;
  title = 'FESEPVO';

  constructor() {
  }

  ulogovanKorisnik(korisnik: IKorisnik) {
    this.korisnik = korisnik;
    console.log(this.korisnik);
  }
}
