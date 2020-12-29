--KLANT
CREATE TABLE IF NOT EXISTS KLANT(
    klantid INT NOT NULL AUTO_INCREMENT,
    voornaam NVARCHAR(50) NOT NULL,
    achternaam NVARCHAR(50) NOT NULL,
    geboortedatum DATE NOT NULL,
    email NVARCHAR(100) NOT NULL,
    telefoon NVARCHAR(15) NULL,
    gebruikersnaam NVARCHAR(100) NOT NULL,
    wachtwoord NVARCHAR(250) NOT NULL,
    PRIMARY KEY (klantid)
);

INSERT INTO KLANT (voornaam, achternaam, geboortedatum, email, telefoon, gebruikersnaam, wachtwoord)
VALUES ('Joske','Vermeulen', PARSEDATETIME('02-09-1981','dd-MM-yyyy'),'joskevermeulen@gmail.com','068/80 12 34','JoskeVermeulen','JV');

--CATEGORIE
CREATE TABLE IF NOT EXISTS CATEGORIE(
    categorieid INT not null AUTO_INCREMENT,
    categorienaam NVARCHAR(50) NOT NULL,
    PRIMARY KEY(categorieid)
);

insert into CATEGORIE(categorienaam)
values ('kinderen');

insert into CATEGORIE(categorienaam)
values ('volwassenen');

insert into CATEGORIE(categorienaam)
values ('familie');

insert into CATEGORIE(categorienaam)
values ('gadgets');

--PRODUCT
CREATE TABLE IF NOT EXISTS PRODUCT(
    productid INT NOT NULL AUTO_INCREMENT,
    productnaam NVARCHAR(100) NOT NULL,
    productbeschrijving NVARCHAR(250) NOT NULL,
    aantalspelers INT NOT NULL,
    huurverkoop BIT NOT NULL,
    prijs FLOAT,
    stock INT
);

--monopoly om te verhuren (huurverkoop 0)
INSERT INTO PRODUCT(productnaam, productbeschrijving, aantalspelers, huurverkoop, prijs, stock)
VALUES ('Monopoly', 'Het klassieke bordspel voor de ganse familie. Kan gespeeld worden met 2 tot 8 spelers. Geschikt voor kinderen vanaf 8 jaar. Je kan dit spel kopen en uithuren.', 8, 0, 4.99, 20);

--monopoly om te verkopen (huurverkoop 1) -> ik stel deze waardes voor bij de bool (BIT) huurverkoop
INSERT INTO PRODUCT(productnaam, productbeschrijving, aantalspelers, huurverkoop, prijs, stock)
VALUES ('Monopoly', 'Het klassieke bordspel voor de ganse familie. Kan gespeeld worden met 2 tot 8 spelers. Geschikt voor kinderen vanaf 8 jaar. Je kan dit spel kopen en uithuren.', 8, 1, 24.99, 200);

--schaakspel om te verkopen (huurverkoop 1)
INSERT INTO PRODUCT(productnaam, productbeschrijving, aantalspelers, huurverkoop, prijs, stock)
VALUES ('Schaak', 'Het klassieke strategische bordspel. Stukken en bord inbegrepen. Enkel beschikbaar voor verkoop.', 2, 1, 39.27, 150);

--PRODUCT_CATEGORIE
CREATE TABLE IF NOT EXISTS PRODUCT_CATEGORIE
(
    productcategorieid INT NOT NULL AUTO_INCREMENT,
    Product_productid          INT NOT NULL,
    Categorie_categorieid       INT NOT NULL,
    primary key (productcategorieid)
);

--ProductCategoriën koppelen met de juiste producten en categoriën
    --one-to many vanuit de tussentabel, ik weet momenteel nog niet of ik dan ook de many-to-one moet uitschrijven!!! zijn momenteel niet opgevuld!!!
    --we gaan dit ofwel moeten uitschrijven voor alle many-to-ones, ofwel die many-to-ones eruit gooien, maar Joeri zei dat dat juist was dus.
    --ik vind de tussentabellen daarvoor persoonlijk maar vreemd.

--Monopoly huur voor zowel familie als kinderen
INSERT INTO PRODUCT_CATEGORIE(Product_productid, Categorie_categorieid)
VALUES (1, 3);

INSERT INTO PRODUCT_CATEGORIE(Product_productid, Categorie_categorieid)
VALUES (1, 1);

--Monopoly verkoop voor zowel familie als kinderen
INSERT INTO PRODUCT_CATEGORIE(Product_productid, Categorie_categorieid)
VALUES (2, 3);

INSERT INTO PRODUCT_CATEGORIE(Product_productid, Categorie_categorieid)
VALUES (2, 1);

--Schaak voor zowel kinderen als volwassenen
INSERT INTO PRODUCT_CATEGORIE(Product_productid, Categorie_categorieid)
VALUES (3, 1);

INSERT INTO PRODUCT_CATEGORIE(Product_productid, Categorie_categorieid)
VALUES (3, 2);

--PLAATS
CREATE TABLE IF NOT EXISTS PLAATS
(
    plaatsid INT NOT NULL AUTO_INCREMENT,
    postcode          NVARCHAR(10),
    gemeente       NVARCHAR(100),
    primary key (plaatsid)
);

--gemeente van Joske Vermeulen toevoegen
INSERT INTO PLAATS(postcode, gemeente)
VALUES (2900, 'Schoten');

--BESTELLINGSTATUS (de underscore hier is aangemaakt door de camelcase naam van de entity, is GEEN tussentabel)
CREATE TABLE IF NOT EXISTS BESTELLING_STATUS
(
    bestellingstatusid INT NOT NULL AUTO_INCREMENT,
    bestellingstatusbeschrijving NVARCHAR(50),
    primary key (bestellingstatusid)
);

--statussen invoeren
INSERT INTO BESTELLING_STATUS(bestellingstatusbeschrijving)
VALUES ('betaald');

INSERT INTO BESTELLING_STATUS(bestellingstatusbeschrijving)
VALUES ('onbetaald');

--BESTELLING
CREATE TABLE IF NOT EXISTS BESTELLING(
    bestellingid INT NOT NULL AUTO_INCREMENT,
    Klant_klantid INT NOT NULL,
    referentie NVARCHAR(50) NOT NULL,
    bestellingdatum DATE NOT NULL,
    leveradres NVARCHAR(100) NOT NULL,
    Plaats_plaatsid INT NOT NULL,
    Bestelling_Status_bestellingstatusid INT NOT NULL,
    primary key (bestellingid)
);

--Joske Vermeulen heeft een bestelling geplaatst maar nog niet betaald (weet niet juist wat we met referentie gaan doen, heb er nu maar iets ingestoken)
INSERT INTO BESTELLING(klant_klantid, referentie, bestellingdatum, leveradres, plaats_plaatsid, bestelling_status_bestellingstatusid)
VALUES(1, '00001', PARSEDATETIME('29-12-2020','dd-MM-yyyy'), 'Trammezandlei 122', 1, 2);

--BESTELLING_PRODUCT
CREATE TABLE IF NOT EXISTS BESTELLING_PRODUCT(
    bestellingproductid INT NOT NULL AUTO_INCREMENT,
    Bestelling_bestellingid INT NOT NULL,
    Product_productid INT NOT NULL,
    aantal INT NOT NULL,
    einddatum DATE NULL,
    primary key (bestellingproductid)
);

--Joske Vermeulen heeft met die bestelling 1 monopoly gehuurd
INSERT INTO BESTELLING_PRODUCT(bestelling_bestellingid, product_productid, aantal, einddatum)
VALUES(1, 1, 1, PARSEDATETIME('12-01-2020','dd-MM-yyyy'));