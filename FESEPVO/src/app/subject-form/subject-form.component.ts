import {Component, OnInit} from '@angular/core';
import {Router} from '@angular/router';

@Component({
  selector: 'app-subject-form',
  templateUrl: './subject-form.component.html',
  styleUrls: ['./subject-form.component.css']
})
export class SubjectFormComponent implements OnInit {

  constructor(private router: Router) {
  }

  ngOnInit(): void {
  }

  checkValue() {
    console.log('Value changed');
  }

  getTitle(): string {

    if (this.router.url.includes('edit')) {
      return 'Izmeni predmet!';
    } else {
      return 'Dodaj predmet!';
    }
  }

}
