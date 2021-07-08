import {Component, EventEmitter, OnDestroy, OnInit, Output} from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import {Router} from '@angular/router';
import { Subscription } from 'rxjs';
import { IKorisnik } from '../models/korisnik';
import { KorisnikService } from '../servisi/korisnik.service';
import { LoginService } from '../servisi/login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit,OnDestroy{

  public loginForm: FormGroup
  subs: Subscription | null = null;
  @Output()
  output: EventEmitter<IKorisnik> =   new EventEmitter();
  constructor(private router: Router,private servis: LoginService,private korisnikS:KorisnikService) {
    this.loginForm = new FormGroup({
      username: new FormControl("",[Validators.required]),
      password: new FormControl("",[Validators.required])
    })
  }
  ngOnInit(): void {
  }
  ngOnDestroy(){
    if(this.subs)
      this.subs.unsubscribe()
  }

  go() {
    if(!this.loginForm.valid){
      window.alert("Forma nije validna")
      return;
    }
    this.subs = this.servis.login(this.loginForm.value.username,this.loginForm.value.password)
    .subscribe((response:IKorisnik | String) =>{
      if(response instanceof String || typeof response == 'string'){
        window.alert(response)
      }
      else{
        this.korisnikS.saveKorisnik(response);
        this.router.navigateByUrl('');
      }

    })

  }
}
