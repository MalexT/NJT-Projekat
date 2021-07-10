import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { IPredmet } from '../models/predmet';
import { Subscription } from 'rxjs';
import { PredmetService } from '../servisi/predmet.service';
import { IOblikNastave } from '../models/oblikNastave';

@Component({
  selector: 'app-subject-form',
  templateUrl: './subject-form.component.html',
  styleUrls: ['./subject-form.component.css']
})
export class SubjectFormComponent implements OnInit {


  public subjectForm: FormGroup
  predmet: IPredmet | null = null
  obliciNastave: IOblikNastave[] = []
  subs: Subscription | null = null;


  constructor(private router: Router, private route: ActivatedRoute, private predmetServis: PredmetService) {
    this.subjectForm = new FormGroup({
      naziv: new FormControl("", [Validators.required]),
      opis: new FormControl("", [Validators.required]),
      espb: new FormControl("", [Validators.required, Validators.max(27), Validators.min(2)]),
      //Da li da imamo i FormControl za checkbox?
    })
  }

  ngOnInit(): void {

    if (this.router.url.includes('edit')) {
      this.subs = this.predmetServis.getById(this.route.snapshot.params.id).subscribe(predmet => {
        this.predmet = predmet;
        this.obliciNastave = predmet.obliciNastave;

        this.subjectForm.setValue({
          naziv: this.predmet.naziv,
          opis: this.predmet?.opis,
          espb: this.predmet.espb
        });
      })
    }
}

go() {
  if (!this.subjectForm.valid) {
    window.alert("Forma nije validna")
    return;
  }

  console.log(this.subjectForm.value.obliciNastave)

  if (this.predmet) {
    for (let i = 1; i <= this.predmet.obliciNastave.length; i++) {
      if ((<HTMLInputElement>document.getElementById(i.toString())).checked) {
        console.log('Cekiran je');
        //Ovako nekako mozemo da uzmemo koji su checkbox-ovi cekirani.
      }
    }
  }

  if (this.router.url.includes('edit')) {
    // this.predmetServis.edit();
    console.log('Izmena angazovanja.');
  } else {
    // this.predmetServis.save();
    console.log('Angazovanje sacuvano.');
  }

}

getTitle(): string {

  if (this.router.url.includes('edit')) {
    return 'Izmeni predmet!';
  } else {
    return 'Dodaj predmet!';
  }
}

}
