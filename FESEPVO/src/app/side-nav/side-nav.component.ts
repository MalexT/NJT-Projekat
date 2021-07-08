import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { KorisnikService } from '../servisi/korisnik.service';

@Component({
  selector: 'app-side-nav',
  templateUrl: './side-nav.component.html',
  styleUrls: ['./side-nav.component.css']
})
export class SideNavComponent implements OnInit {

  constructor(private korisnikS:KorisnikService,private router: Router) { }

  ngOnInit(): void {
  }

  public odjava(){
    this.korisnikS.saveKorisnik(null);
    console.log(this.korisnikS.getKorisnik())
    this.router.navigateByUrl('/');
    
  }

}
