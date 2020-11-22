--DROP TABLE IF EXISTS Bestelling;

CREATE TABLE Bestelling(
bestellingId INT PRIMARY KEY,
referentie NVARCHAR(250) NOT NULL,
bestellingDatum DATE NOT NULL,
leveradres NVARCHAR(250) NOT NULL,
klant INT NOT NULL,
plaats INT NOT NULL,
bestellingstatus INT NOT NULL
);

INSERT INTO Bestelling
VALUES (bestellingId, 'd3ae64984828', '10-11-2020', 'Pieter de Nefstraat 23', 1, 2, 4)
INSERT INTO Bestelling
VALUES (bestellingId, '85e16a351362', '11-11-2020', 'Lokerenstraat 150', 2, 2, 1)
INSERT INTO Bestelling
VALUES (bestellingId, 'f8c44c1f1ec9', '12-11-2020', 'Driesenstraat 53', 2, 2, 3)
INSERT INTO Bestelling
VALUES (bestellingId, '1d3275ca24a9', '13-11-2020', 'Grote Markt 1', 2, 2, 3)
INSERT INTO Bestelling
VALUES (bestellingId, '1e7e95b1c249', '13-11-2020', 'Rubenstraat 78', 2, 2, 2)