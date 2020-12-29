--DROP TABLE IF EXISTS Product;

CREATE TABLE Product(
productid INT PRIMARY KEY,
productnaam NVARCHAR(250) NOT NULL,
productbeschrijving NVARCHAR(250) NOT NULL,
aantalspelers INT NOT NULL,
huurverkoop NVARCHAR(250) NOT NULL,
prijs FLOAT,
stock INT
);