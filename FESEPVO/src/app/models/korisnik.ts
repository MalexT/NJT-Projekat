import { NastavnoOsoblje } from "./nastavnoOsoblje";
import { IRola } from "./rola";

export interface IKorisnik {
    id: Number,
    username:String,
    rola:IRola,
    nastavnoOsoblje:NastavnoOsoblje
}