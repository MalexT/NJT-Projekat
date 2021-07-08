import {NastavnoOsoblje} from './nastavnoOsoblje';
import {IOblikNastave} from './oblikNastave';

export interface IPredmet {
  id: number;
  naziv: string;
  opis: string;
  espb: number;
  aktivan: boolean; // Ovo treba dodati u BE
  obliciNastave: IOblikNastave[];
}
