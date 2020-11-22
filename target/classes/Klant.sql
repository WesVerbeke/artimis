--DROP TABLE IF EXISTS Klant;

CREATE TABLE Klant(
klantId INT PRIMARY KEY,
voornaam NVARCHAR(250) NOT NULL,
achternaam NVARCHAR(250) NOT NULL,
geboortedatum DATE NOT NULL,
email NVARCHAR(250) NOT NULL,
telefoon NVARCHAR(250) NULL,
gebruikersnaam NVARCHAR(250) NOT NULL,
wachtwoord NVARCHAR(250) NOT NULL
);

INSERT INTO Klant
VALUES (1, 'Jos', 'Smos', '01-01-1991', 'jos.smos@smosmail.com', '+32(0)478 32 04 78', 'jos.smos', 'messysand88')
INSERT INTO Klant
VALUES (2, 'Peter', 'Pannekoek', '02-02-1992', 'peter.pannekoek@pannekoekmail.com', '+32(0)467 32 04 67', 'peter.pannekoek', 'tinymoose34')
INSERT INTO Klant
VALUES (3, 'Ollie', 'Oliebol', '03-03-1993', 'ollie.oliebol@olliemail.com', '+32(0)456 32 04 56', 'ollie.oliebol', 'mushycloud51')
INSERT INTO Klant
VALUES (4, 'Barry', 'Batsbak', '04-04-1994', 'barry.batsbak@batsmail.com', '+32(0)445 32 04 45', 'barry.batsbak', 'thinJ@guar45')
INSERT INTO Klant
VALUES (5, 'Karel', 'Knol', '05-05-1995', 'karel.knol@knolmail.com', '+32(0)445 32 04 45', 'karel.knol', 'gr3enBone47')