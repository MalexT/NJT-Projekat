import {Component, OnInit} from '@angular/core';
import {Router} from '@angular/router';
import { Subscription } from 'rxjs';
import { IAngazovanja } from '../models/angazovanja';
import { AngazovanjaService } from '../servisi/angazovanja.service';

@Component({
  selector: 'app-angazovanje',
  templateUrl: './angazovanje.component.html',
  styleUrls: ['./angazovanje.component.css']
})
export class AngazovanjeComponent implements OnInit {

  public angazovanja: IAngazovanja[] = []
  constructor(private router: Router,private angazovanjeS:AngazovanjaService ){
    angazovanjeS.getAll().subscribe(angazovanje =>{
      this.angazovanja = angazovanje;
    })

  }

  ngOnInit(): void {
  }

  editAngazovanje() {
    console.log('Angazovanje Izmenjeno.');
    var angazovanje = 1;
    this.router.navigate(['angazovanjeAE', angazovanje, 'edit']);
    // {queryParams:{naizv:subject.naziv, opis: subject.opis}, brojESPB: subject.ESPB});
  }

  deleteAngazovanje(osobljeId:number,predmetId:number) {
    this.angazovanjeS.deleteAngazovanje(osobljeId,predmetId).subscribe(message =>{
      window.alert(message);
      this.angazovanjeS.getAll().subscribe(angazovanje =>{
        this.angazovanja = angazovanje;
      })

    })
  }
}
