import {Component, OnInit} from '@angular/core';
import {Router} from '@angular/router';

@Component({
  selector: 'app-angazovanje',
  templateUrl: './angazovanje.component.html',
  styleUrls: ['./angazovanje.component.css']
})
export class AngazovanjeComponent implements OnInit {

  constructor(private router: Router) {
  }

  ngOnInit(): void {
  }

  editAngazovanje() {
    console.log('Angazovanje Izmenjeno.');
    var angazovanje = 1;
    this.router.navigate(['angazovanjeAE', angazovanje, 'edit']);
    // {queryParams:{naizv:subject.naziv, opis: subject.opis}, brojESPB: subject.ESPB});
  }

  deleteAngazovanje() {
    console.log('Angazovanje obrisano.');
  }
}
