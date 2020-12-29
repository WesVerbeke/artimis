CREATE TABLE IF NOT EXISTS Categorie(
                          categorieid INT not null AUTO_INCREMENT,
                          categorienaam NVARCHAR(250) NOT NULL,
                          PRIMARY KEY(categorieid)
);

insert into Categorie(categorienaam)
values ('1 player');

insert into Categorie(categorienaam)
values ('2 players');

insert into Categorie(categorienaam)
values ('family');