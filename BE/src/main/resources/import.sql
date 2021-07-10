INSERT INTO univerzitet (ID,naziv) VALUES (1, 'Beogradski univerzitet');
INSERT INTO univerzitet (ID,naziv)  VALUES (2, 'Univerzitet u Nišu');
INSERT INTO univerzitet (ID,naziv) VALUES (3, 'Univerzitet u Kragujevcu');

INSERT INTO fakultet (ID, univerzitet_id,naziv,adresa) VALUES (1, 1, 'Fakultet organizacionih nauka', 'Jove Ilica 147');
INSERT INTO fakultet (ID, univerzitet_id,naziv,adresa) VALUES (2, 1, 'Matematicki fakultet','Studentski trg 4');
INSERT INTO fakultet (ID, univerzitet_id,naziv,adresa) VALUES (3, 1, 'Fakultet Politickih nauka','Jove Ilica 148');

INSERT INTO nivo_studija (ID,naziv) VALUES (1, 'Osnovne akademske studije');
INSERT INTO nivo_studija (ID,naziv) VALUES (2, 'Master akademske studije');
INSERT INTO nivo_studija (ID,naziv) VALUES (3, 'Doktorske akademske studije');

INSERT INTO studijski_program (ID,nivo_studija_id, fakultet_id, naziv, modul, `status` ) VALUES (1, 1, 1, 'ISIT',FALSE,'Published');
INSERT INTO studijski_program (ID,nivo_studija_id, fakultet_id, naziv, modul, `status`) VALUES (2, 1, 1, 'Menadzment',TRUE,'Not published');

INSERT INTO modul (ID,studijski_program_id,Semestar,Naziv) VALUES (1, 1, 1, 'ISIT');
INSERT INTO modul (ID,studijski_program_id,Semestar,Naziv) VALUES (2, 2, 5, 'Kvalitet');
INSERT INTO modul (ID,studijski_program_id,Semestar,Naziv) VALUES (3, 2, 5, 'Operacioni Menadzment');

INSERT INTO oblik_nastave (ID,Naziv) VALUES (1, 'Predavanja');
INSERT INTO oblik_nastave (ID,Naziv) VALUES (2, 'Auditorne vezbe');
INSERT INTO oblik_nastave (ID,Naziv) VALUES (3, 'Prakticne vezbe');
INSERT INTO oblik_nastave (ID,Naziv) VALUES (4, 'Seminarski rad');
INSERT INTO oblik_nastave (ID,Naziv) VALUES (5, 'Istrazivacki rad');
INSERT INTO oblik_nastave (ID,Naziv) VALUES (6, 'Konsultacije');

INSERT INTO zvanje (ID,Naziv) VALUES (1, 'Redovni profesor');
INSERT INTO zvanje (ID,Naziv) VALUES (2, 'Vandredni profesor');
INSERT INTO zvanje (ID,Naziv) VALUES (3, 'Asistent');
INSERT INTO zvanje (ID,Naziv) VALUES (4, 'Demonstrator');

INSERT INTO korisnicki_nalog (ID,rola_id,nastavno_osoblje_id,username,password) VALUES (1, 1, 1, 'admin','admin');
INSERT INTO korisnicki_nalog (ID,rola_id,nastavno_osoblje_id,username,password) VALUES (2, 2, 2, 'user','user');
INSERT INTO korisnicki_nalog (ID,rola_id,nastavno_osoblje_id,username,password) VALUES (3, 2, 3, 'user1','user1');

INSERT INTO rola (ID,Naziv) VALUES (1, 'Administrator');
INSERT INTO rola (ID,Naziv) VALUES (2, 'Korisnik');

INSERT INTO nastavno_osoblje (ID,zvanje_id,ime,prezime,jmbg) VALUES (1, 1, 'Pera','Peric','1601999721815');
INSERT INTO nastavno_osoblje (ID,zvanje_id,ime,prezime,jmbg) VALUES (2, 2, 'Zika','Zikic','1601999721816');
INSERT INTO nastavno_osoblje (ID,zvanje_id,ime,prezime,jmbg) VALUES (3, 3, 'Milos','Milic','1601999721817');

INSERT INTO predmet (ID, naziv, ESPB, Opis,aktivan) VALUES (1,'Programiranje 1', 4, 'Koncepti programiranja u C programskom jeziku...',true);
INSERT INTO predmet (ID, naziv, ESPB, Opis,aktivan) VALUES (2,'Programiranje 2', 6, 'Koncepti programiranja u Java programskom jeziku...',true);
INSERT INTO predmet (ID, naziv, ESPB, Opis,aktivan) VALUES (3,'NJT', 6, 'Napredne Java tehnologije (Spring, Maven, Hibernate...)',true);

INSERT INTO angazovanje(oblik_nastave_id, predmet_id, nastavno_osoblje_id) VALUES (1,1,1);
INSERT INTO angazovanje (oblik_nastave_id, predmet_id, nastavno_osoblje_id) VALUES (2,1,2);
INSERT INTO angazovanje (oblik_nastave_id, predmet_id, nastavno_osoblje_id) VALUES (3,1,3);
INSERT INTO angazovanje (oblik_nastave_id, predmet_id, nastavno_osoblje_id) VALUES (1,2,1);
INSERT INTO angazovanje (oblik_nastave_id, predmet_id, nastavno_osoblje_id) VALUES (2,2,2);
INSERT INTO angazovanje (oblik_nastave_id, predmet_id, nastavno_osoblje_id) VALUES (3,2,3);

INSERT INTO predmet_modul (predmet_id, modul_id, semestar) VALUES (1,1,8);
INSERT INTO predmet_modul (predmet_id, modul_id, semestar) VALUES (1,2,8);
INSERT INTO predmet_modul (predmet_id, modul_id, semestar) VALUES (1,3,8);
INSERT INTO predmet_modul (predmet_id, modul_id, semestar) VALUES (2,1,8);
INSERT INTO predmet_modul (predmet_id, modul_id, semestar) VALUES (2,2,8);
INSERT INTO predmet_modul (predmet_id, modul_id, semestar) VALUES (2,3,8);
INSERT INTO predmet_modul (predmet_id, modul_id, semestar) VALUES (3,1,8);


INSERT INTO predmet_oblik_nastave (predmet_id, oblik_nastave_id) VALUES (1,1);
INSERT INTO predmet_oblik_nastave (predmet_id, oblik_nastave_id) VALUES (1,2);
INSERT INTO predmet_oblik_nastave (predmet_id, oblik_nastave_id) VALUES (1,3);
INSERT INTO predmet_oblik_nastave (predmet_id, oblik_nastave_id) VALUES (2,1);
INSERT INTO predmet_oblik_nastave (predmet_id, oblik_nastave_id) VALUES (2,2);
INSERT INTO predmet_oblik_nastave (predmet_id, oblik_nastave_id) VALUES (2,3);


