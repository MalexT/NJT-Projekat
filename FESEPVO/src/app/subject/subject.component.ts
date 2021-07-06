import {Component, OnInit} from '@angular/core';
import {Router} from '@angular/router';

@Component({
  selector: 'app-subject',
  templateUrl: './subject.component.html',
  styleUrls: ['./subject.component.css']
})
export class SubjectComponent implements OnInit {
  isChecked: any;


  constructor(private router: Router) {
  }

  ngOnInit(): void {
  }


  editSubject() {
    var subject = 1;
    this.router.navigate(['subjectAE', subject, 'edit']);
    // {queryParams:{naizv:subject.naziv, opis: subject.opis}, brojESPB: subject.ESPB});
  }
}
