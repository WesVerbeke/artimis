--UITGEVER
CREATE TABLE IF NOT EXISTS UITGEVER(
    uitgeverid INT NOT NULL AUTO_INCREMENT,
    uitgevernaam NVARCHAR(200) NOT NULL,
    PRIMARY KEY (uitgeverid)
);

//uitgever Monopoly
INSERT INTO UITGEVER(uitgevernaam)
VALUES ( 'Parker Brothers' );

//uitgever Schaakset
INSERT INTO UITGEVER(uitgevernaam)
VALUES ( 'Pucon' );

//uitgever Catan en De Weerwolven van Wakkerdam (toevoegen in demo)
INSERT INTO UITGEVER(uitgevernaam)
VALUES ( '999 Games' );

//uitgever Stratego
INSERT INTO UITGEVER(uitgevernaam)
VALUES ( 'Jumbo' );

//uitgever Risk
INSERT INTO UITGEVER(uitgevernaam)
VALUES ( 'Hasbro Gaming' );

--TAAL
CREATE TABLE IF NOT EXISTS TAAL(
    taalid INT NOT NULL AUTO_INCREMENT,
    taalnaam NVARCHAR(200) NOT NULL,
    PRIMARY KEY (taalid)
);

//talen invoeren
INSERT INTO TAAL(taalnaam)
VALUES ('Nederlands');

INSERT INTO TAAL(taalnaam)
VALUES ('Frans');

INSERT INTO TAAL(taalnaam)
VALUES ('Duits');

INSERT INTO TAAL(taalnaam)
VALUES ('Engels');

INSERT INTO TAAL(taalnaam)
VALUES ('Alle talen');

--PLAATS
CREATE TABLE IF NOT EXISTS PLAATS
(
    plaatsid INT NOT NULL AUTO_INCREMENT,
    postcode NVARCHAR(10),
    gemeente NVARCHAR(100),
    PRIMARY KEY (plaatsid)
);

--gemeente van Joske Vermeulen toevoegen
INSERT INTO PLAATS(postcode, gemeente)
VALUES ('2900', 'Schoten');

--Scherpenheuvel-Zichem
INSERT INTO PLAATS(postcode, gemeente)
VALUES ('3271', 'Scherpenheuvel-Zichem');

--Scherpenheuvel-Zichem
INSERT INTO PLAATS(postcode, gemeente)
VALUES ('3272', 'Scherpenheuvel-Zichem');

--Geel
INSERT INTO PLAATS(postcode, gemeente)
VALUES ( '2440', 'Geel' );

--Turnhout
INSERT INTO PLAATS(postcode, gemeente)
VALUES ( '2300', 'Turnhout' );

--Aarschot
INSERT INTO PLAATS(postcode, gemeente)
VALUES ( '3200', 'Aarschot' );

--Aarschot
INSERT INTO PLAATS(postcode, gemeente)
VALUES ( '3201', 'Aarschot' );

--Aarschot
INSERT INTO PLAATS(postcode, gemeente)
VALUES ( '3202', 'Aarschot' );

--Diest
INSERT INTO PLAATS(postcode, gemeente)
VALUES ('3290', 'Diest');

INSERT INTO PLAATS(postcode, gemeente)
VALUES ('3293', 'Diest');

INSERT INTO PLAATS(postcode, gemeente)
VALUES ('3294', 'Diest');

--BESTELLINGSTATUS (de underscore hier is aangemaakt door de camelcase naam van de entity, is GEEN tussentabel)
CREATE TABLE IF NOT EXISTS BESTELLING_STATUS
(
    bestellingstatusid INT NOT NULL AUTO_INCREMENT,
    bestellingstatusbeschrijving NVARCHAR(50),
    primary key (bestellingstatusid)
);

--statussen invoeren
INSERT INTO BESTELLING_STATUS(bestellingstatusbeschrijving)
VALUES ('onbetaald');

INSERT INTO BESTELLING_STATUS(bestellingstatusbeschrijving)
VALUES ('betaald');

--KLANT
CREATE TABLE IF NOT EXISTS KLANT(
    klantid INT NOT NULL AUTO_INCREMENT,
    voornaam NVARCHAR(50) NOT NULL,
    achternaam NVARCHAR(50) NOT NULL,
    geboortedatum DATE NOT NULL,
    adres NVARCHAR(200) NOT NULL,
    Plaats_plaatsid INT NOT NULL,
    email NVARCHAR(100) NOT NULL,
    gebruikersnaam NVARCHAR(100) NOT NULL,
    wachtwoord NVARCHAR(250) NOT NULL,
    beheerder BIT NOT NULL,
    PRIMARY KEY (klantid)
);

//Beheerder aanmaken
INSERT INTO KLANT(voornaam, achternaam, geboortedatum, adres, Plaats_plaatsid, email, gebruikersnaam, wachtwoord, beheerder)
VALUES ('Dries','Vandoorne', PARSEDATETIME('22-01-1989','dd-MM-yyyy'), 'Westelsebaan 63', 2, 'r0607003@student.thomasmore.be','DriesVandoorne','DV', 1);

//Klant aanmaken
INSERT INTO KLANT(voornaam, achternaam, geboortedatum, adres, Plaats_plaatsid, email, gebruikersnaam, wachtwoord, beheerder)
VALUES ('Joske','Vermeulen', PARSEDATETIME('02-09-1981','dd-MM-yyyy'), 'Trammezandlei 122', 1, 'joskevermeulen@gmail.com','JoskeVermeulen','JV', 0);

--PRODUCT
CREATE TABLE IF NOT EXISTS PRODUCT(
    productid INT NOT NULL AUTO_INCREMENT,
    productnaam NVARCHAR(100) NOT NULL,
    productbeschrijving NVARCHAR(250) NOT NULL,
    afbeelding NVARCHAR(300) NOT NULL,
    aantalspelers INT NOT NULL,
    minimumleeftijd INT NOT NULL,
    Taal_taalid INT NOT NULL,
    Uitgever_uitgeverid INT NOT NULL,
    prijs FLOAT NOT NULL,
    prijshuur FLOAT NOT NULL,
    stockverkoop INT,
    stockhuur INT,
    PRIMARY KEY (productid)
);

--monopoly
INSERT INTO PRODUCT(productnaam, productbeschrijving, afbeelding, aantalspelers, minimumleeftijd, Taal_taalid, Uitgever_uitgeverid, prijs, prijshuur, stockverkoop, stockhuur)
VALUES('Monopoly', 'Het klassieke bordspel voor de ganse familie. Kan gespeeld worden met 2 tot 6 spelers.', 'https://i.imgur.com/rZe0nYl.jpg', 6, 8, 1, 1, 33.25, 4.99, 150, 15);

--schaakspel
INSERT INTO PRODUCT(productnaam, productbeschrijving, afbeelding, aantalspelers, minimumleeftijd, Taal_taalid, Uitgever_uitgeverid, prijs, prijshuur, stockverkoop, stockhuur)
VALUES ( 'Schaakspel', 'Het klassieke strategische bordspel. Stukken en bord inbegrepen.', 'https://i.imgur.com/cuANgNG.jpg', 2, 3, 5, 2, 53.19, 7.5, 100, 10 );

--catan
INSERT INTO PRODUCT(productnaam, productbeschrijving, afbeelding, aantalspelers, minimumleeftijd, Taal_taalid, Uitgever_uitgeverid, prijs, prijshuur, stockverkoop, stockhuur)
VALUES ( 'Catan', 'Het Catan basisspel is de nieuwste editie van het bekende handelsspel. Het spel bevat nu miniaturen en ook het artwork is volledig aangepast. Voor 3 tot 4 spelers.', 'https://i.imgur.com/ewNTbMX.jpg', 4, 10, 1, 3, 35.99, 4.99, 50, 5);

--stratego
INSERT INTO PRODUCT(productnaam, productbeschrijving, afbeelding, aantalspelers, minimumleeftijd, Taal_taalid, Uitgever_uitgeverid, prijs, prijshuur, stockverkoop, stockhuur)
VALUES ( 'Stratego', 'Val aan en verover de vlag! Ontmantel de bommen en laat je maarschalk zegevieren!', 'https://i.imgur.com/TqiL1NL.jpg', 2, 8, 5, 4, 21.99, 3.99, 300, 30);

--risk
INSERT INTO PRODUCT(productnaam, productbeschrijving, afbeelding, aantalspelers, minimumleeftijd, Taal_taalid, Uitgever_uitgeverid, prijs, prijshuur, stockverkoop, stockhuur)
VALUES ( 'Risk', 'Grote spelklassieker! Probeer je missie in goede banen te leiden of de wereld te veroveren! Met 360 3D-figuurtjes en 3 spelwijzen. Voor 2 tot 4 spelers.', 'https://i.imgur.com/Q9D2OzD.jpg', 4, 10, 4, 5, 59.08, 7.5, 250, 25);



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