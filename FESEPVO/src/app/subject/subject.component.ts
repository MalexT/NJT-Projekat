import {Component, OnDestroy, OnInit} from '@angular/core';
import {Router} from '@angular/router';
import { Subscription } from 'rxjs';
import { IPredmet } from '../models/predmet';
import { PredmetService } from '../servisi/predmet.service';

@Component({
  selector: 'app-subject',
  templateUrl: './subject.component.html',
  styleUrls: ['./subject.component.css']
})
export class SubjectComponent implements OnInit,OnDestroy {
  isChecked: any;

  predmeti: IPredmet[] =[]
  subs: Subscription | null= null;

  constructor(private router: Router,private predmetServis: PredmetService) {
    this.subs = predmetServis.getAll().subscribe(predmeti =>{
      this.predmeti = predmeti;
      console.log(this.predmeti)
    })
  }

  ngOnInit(): void {
  }
  ngOnDestroy(){
    if(this.subs)
      this.subs.unsubscribe()
  }


  editSubject() {
    var subject = 1;
    this.router.navigate(['subjectAE', subject, 'edit']);
    // {queryParams:{naizv:subject.naziv, opis: subject.opis}, brojESPB: subject.ESPB});
  }
}
