CREATE TABLE IF NOT EXISTS Categorie(
                          categorieId INT not null AUTO_INCREMENT,
                          categorieNaam NVARCHAR(250) NOT NULL,
                          PRIMARY KEY(categorieId)
);

insert into Categorie(categorieNaam)
values ('1 player');

insert into Categorie(categorieNaam)
values ('2 players');

insert into Categorie(categorieNaam)
values ('family');