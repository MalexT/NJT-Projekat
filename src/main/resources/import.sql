INSERT INTO Univerzitet (ID,naziv) VALUES (1, 'Beogradski univerzitet');
INSERT INTO Univerzitet (ID,naziv)  VALUES (1, 'Univerzitet u Nišu');
INSERT INTO Univerzitet (ID,naziv) VALUES (1, 'Univerzitet u Kragujevcu');

INSERT INTO Fakultet (ID, univerzitet_id,naziv) VALUES (1, 1, 'Fakultet organizacionih nauka', 'Jove Ilica 147');
INSERT INTO Fakultet (ID, univerzitet_id,naziv) VALUES (2, 1, 'Matematicki fakultet','Studentski trg 4');
INSERT INTO Fakultet (ID, univerzitet_id,naziv) VALUES (3, 1, 'Fakultet Politickih nauka','Jove Ilica 148');

INSERT INTO Nivo_Studija (ID,naziv) VALUES (1, 'Osnovne akademske studije');
INSERT INTO Nivo_Studija (ID,naziv) VALUES (2, 'Master akademske studije');
INSERT INTO Nivo_Studija (ID,naziv) VALUES (3, 'Doktorske akademske studije');

INSERT INTO Studijski_Program (ID,nivo_studija_id, fakultet_id, naziv, modul, `status` ) VALUES (1, 1, 1, 'ISIT',FALSE,'Published');
INSERT INTO Studijski_Program (ID,nivo_studija_id, fakultet_id, naziv, modul, `status`) VALUES (2, 1, 1, 'Menadzment',TRUE,'Not published');

INSERT INTO Modul (ID,studijski_program_id,Semestar,Naziv) VALUES (1, 1, 1, 'ISIT');
INSERT INTO Modul (ID,studijski_program_id,Semestar,Naziv) VALUES (2, 2, 5, 'Kvalitet');
INSERT INTO Modul (ID,studijski_program_id,Semestar,Naziv) VALUES (3, 2, 5, 'Operacioni Menadzment');

INSERT INTO Oblik_Nastave (ID,Naziv) VALUES (1, 'Predavanja');
INSERT INTO Oblik_Nastave (ID,Naziv) VALUES (2, 'Auditorne vezbe');
INSERT INTO Oblik_Nastave (ID,Naziv) VALUES (3, 'Prakticne vezbe');
INSERT INTO Oblik_Nastave (ID,Naziv) VALUES (4, 'Seminarski rad');
INSERT INTO Oblik_Nastave (ID,Naziv) VALUES (5, 'Istrazivacki rad');
INSERT INTO Oblik_Nastave (ID,Naziv) VALUES (6, 'Konsultacije');

INSERT INTO Zvanje (ID,Naziv) VALUES (1, 'Redovni profesor');
INSERT INTO Zvanje (ID,Naziv) VALUES (2, 'Vandredni profesor');
INSERT INTO Zvanje (ID,Naziv) VALUES (3, 'Asistent');
INSERT INTO Zvanje (ID,Naziv) VALUES (4, 'Demonstrator');

INSERT INTO korisnicki_nalog (ID,rola_id,nastavno_osoblje_id,Naziv) VALUES (1, 1, 1, 'admin','admin');
INSERT INTO korisnicki_nalog (ID,rola_id,nastavno_osoblje_id,Naziv) VALUES (2, 2, 2, 'user','user');
INSERT INTO korisnicki_nalog (ID,rola_id,nastavno_osoblje_id,Naziv) VALUES (3, 2, 3, 'user1','user1');

INSERT INTO Rola (ID,Naziv) VALUES (1, 'Administrator');
INSERT INTO Rola (ID,Naziv) VALUES (2, 'Korisnik');

INSERT INTO nastavno_osoblje (ID,zvanje_id,ime,prezime,jmbg) VALUES (1, 1, 'Pera','Peric','1601999721815');
INSERT INTO nastavno_osoblje (ID,zvanje_id,ime,prezime,jmbg) VALUES (2, 2, 'Zika','Zikic','1601999721816');
INSERT INTO nastavno_osoblje (ID,zvanje_id,ime,prezime,jmbg) VALUES (3, 3, 'Pera','Peric','1601999721817');

INSERT INTO predmet (ID, naziv, ESPB, Opis) VALUES (1,'Programiranje 1', 4, 'Koncepti programiranja u C programskom jeziku...');
INSERT INTO predmet (ID, naziv, ESPB, Opis) VALUES (2,'Programiranje 2', 6, 'Koncepti programiranja u Java programskom jeziku...');
INSERT INTO predmet (ID, naziv, ESPB, Opis) VALUES (3,'NJT', 6, 'Napredne Java tehnologije (Spring, Maven, Hibernate...)');

INSERT INTO predmet_nastavno_osoblje (ID, oblik_nastave_id, predmet_id, nastavno_osolje_id) VALUES (1,1,1,1);
INSERT INTO predmet_nastavno_osoblje (ID, oblik_nastave_id, predmet_id, nastavno_osolje_id) VALUES (2,2,1,2);
INSERT INTO predmet_nastavno_osoblje (ID, oblik_nastave_id, predmet_id, nastavno_osolje_id) VALUES (3,3,1,3);
INSERT INTO predmet_nastavno_osoblje (ID, oblik_nastave_id, predmet_id, nastavno_osolje_id) VALUES (4,1,2,1);
INSERT INTO predmet_nastavno_osoblje (ID, oblik_nastave_id, predmet_id, nastavno_osolje_id) VALUES (5,2,2,2);
INSERT INTO predmet_nastavno_osoblje (ID, oblik_nastave_id, predmet_id, nastavno_osolje_id) VALUES (6,3,2,3);

INSERT INTO predmet_modul (ID, predmet_id, modul_id, semestar) VALUES (1,1,1,8);
INSERT INTO predmet_modul (ID, predmet_id, modul_id, semestar) VALUES (2,1,1,8);
INSERT INTO predmet_modul (ID, predmet_id, modul_id, semestar) VALUES (3,1,1,8);
INSERT INTO predmet_modul (ID, predmet_id, modul_id, semestar) VALUES (4,1,1,8);
INSERT INTO predmet_modul (ID, predmet_id, modul_id, semestar) VALUES (5,1,1,8);
INSERT INTO predmet_modul (ID, predmet_id, modul_id, semestar) VALUES (6,1,1,8);
INSERT INTO predmet_modul (ID, predmet_id, modul_id, semestar) VALUES (7,1,1,8);


INSERT INTO predmet_oblik_nastave (ID, predmet_id, oblik_nastave_id) VALUES (1,1,1);
INSERT INTO predmet_oblik_nastave (ID, predmet_id, oblik_nastave_id) VALUES (2,1,2);
INSERT INTO predmet_oblik_nastave (ID, predmet_id, oblik_nastave_id) VALUES (3,1,3);
INSERT INTO predmet_oblik_nastave (ID, predmet_id, oblik_nastave_id) VALUES (4,2,1);
INSERT INTO predmet_oblik_nastave (ID, predmet_id, oblik_nastave_id) VALUES (5,2,2);
INSERT INTO predmet_oblik_nastave (ID, predmet_id, oblik_nastave_id) VALUES (5,2,3);


