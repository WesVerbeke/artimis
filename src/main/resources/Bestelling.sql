--DROP TABLE IF EXISTS Bestelling;

CREATE TABLE Bestelling(
bestellingId INT PRIMARY KEY,
referentie NVARCHAR(250) NOT NULL,
bestellingDatum DATE NOT NULL,
leveradres NVARCHAR(250) NOT NULL,
customer INT NOT NULL,
plaats INT NOT NULL,
bestellingstatus INT NOT NULL
);

