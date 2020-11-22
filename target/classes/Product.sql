--DROP TABLE IF EXISTS Product;

CREATE TABLE Product(
productId INT PRIMARY KEY,
productNaam NVARCHAR(250) NOT NULL,
productBeschrijving NVARCHAR(250) NOT NULL,
aantalSpelers INT NOT NULL,
huurVerkoop NVARCHAR(250) NOT NULL,
prijs FLOAT,
stock INT
);

INSERT INTO Product
VALUES (1, 'Kolonisten van Catan', 'Het populaire handelsspel in een nieuw jasje! De spelers ruilen grondstoffen met elkaar om straten, dorpen en steden te kunnen bouwen.', '4', NULL, 39.99, 10)
INSERT INTO Product
VALUES (2, 'Weerwolven', 'Partyspel voor grote groepen. De burgers proberen de weerwolven te ontmaskeren! Wie is wie? De spanning stijgt als de weerwolven ''s nachts op jacht gaan…', '8', NULL, 9.99, 15)
INSERT INTO Product
VALUES (3, 'Secret Hitler', 'Zoals de naam van het spel al doet vermoeden weet niemand weet wie Hitler is. Het doel van de fascisten is om binnen een bepaald aantal beurten de macht te grijpen, de liberalen moeten erachter komen wie de Hitler is en zijn machtsgreep voorkomen.
 ', '5', NULL, 59.99, 5)
INSERT INTO Product
VALUES (4, 'Twilight Imperium (4th Edition)', 'A game of galactic conquest in which three to six players take on the role of one of seventeen factions vying for galactic domination through military might, political maneuvering, and economic bargaining. Every faction offers a completely different play experience.', '6', NULL, 119.99, 5)
INSERT INTO Product
VALUES (5, 'Scythe', 'Five countries vie for dominance in a war-torn, mech-filled, steampunk 1920s Europe.', '5', NULL, 99.99, 5)
