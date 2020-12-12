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

insert into Product (productId, productNaam, productBeschrijving, aantalSpelers, huurVerkoop, prijs, stock)
values (1,'Test','Dit is een fijn spel','2-6',15,50,5)
