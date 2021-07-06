import {Component, OnInit} from '@angular/core';
import {Router} from '@angular/router';

@Component({
  selector: 'app-angazovanje-form',
  templateUrl: './angazovanje-form.component.html',
  styleUrls: ['./angazovanje-form.component.css']
})
export class AngazovanjeFormComponent implements OnInit {

  constructor(private router: Router) {
  }

  ngOnInit(): void {
  }

  getTitle(): string {

    if (this.router.url.includes('edit')) {
      return 'Izmeni angazovanje!';
    } else {
      return 'Dodaj angazovanje!';
    }
  }

}
