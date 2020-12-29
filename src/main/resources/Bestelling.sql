--DROP TABLE IF EXISTS Bestelling;

CREATE TABLE Bestelling(
bestellingid INT PRIMARY KEY,
referentie NVARCHAR(250) NOT NULL,
bestellingdatum DATE NOT NULL,
leveradres NVARCHAR(250) NOT NULL,
klant INT NOT NULL,
plaats INT NOT NULL,
bestellingstatus INT NOT NULL
);