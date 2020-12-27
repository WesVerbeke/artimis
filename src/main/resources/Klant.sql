--DROP TABLE IF EXISTS Klant;

CREATE TABLE Klant(
klantId INT NOT NULL AUTO_INCREMENT,
voornaam NVARCHAR(250) NOT NULL,
achternaam NVARCHAR(250) NOT NULL,
geboortedatum DATE NOT NULL,
email NVARCHAR(250) NOT NULL,
telefoon NVARCHAR(250) NULL,
gebruikersnaam NVARCHAR(250) NOT NULL,
wachtwoord NVARCHAR(250) NOT NULL,
PRIMARY KEY (klantId)
);

INSERT INTO Klant (voornaam, achternaam, geboortedatum, email, telefoon, gebruikersnaam, wachtwoord)
VALUES ('Joske','Vermeulen', PARSEDATETIME('02-09-1971','dd-MM-yyyy'),'joskevermeulen@gmail.com','000/00 00 00','JoskeVermeulen','JV');