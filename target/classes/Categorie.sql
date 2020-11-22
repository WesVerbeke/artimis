--DROP TABLE IF EXISTS Categorie;

CREATE TABLE Categorie(
categorieId INT PRIMARY KEY,
categorieNaam NVARCHAR(250) NOT NULL
)

INSERT INTO Categorie
VALUES (1, 'Family')
INSERT INTO Categorie
VALUES (2, 'Party')
INSERT INTO Categorie
VALUES (3, 'Dexterity')
INSERT INTO Categorie
VALUES (4, 'Strategy')
INSERT INTO Categorie
VALUES (5, 'TCG')