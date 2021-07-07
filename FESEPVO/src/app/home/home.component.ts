import {Component, Input, OnInit} from '@angular/core';
import {Subscription} from 'rxjs';
import {IKorisnik} from '../models/korisnik';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  @Input()
  korisnik: IKorisnik | null = null;

  constructor() {
  }

  time = new Date();
  intervalId: any;
  subscription: Subscription | undefined;

  ngOnInit() {
    // Using Basic Interval
    this.intervalId = setInterval(() => {
      this.time = new Date();
    }, 1000);
  }

  ngOnDestroy() {
    clearInterval(this.intervalId);
    if (this.subscription) {
      this.subscription.unsubscribe();
    }
  }
}
