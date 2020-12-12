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

