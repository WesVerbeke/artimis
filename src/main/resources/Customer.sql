Create table if not exists Customer(
    klantId INT PRIMARY KEY,
    voornaam NVARCHAR(250) NOT NULL,
    achternaam NVARCHAR(250) NOT NULL,
    geboortedatum DATE NOT NULL,
    email NVARCHAR(250) NOT NULL,
    telefoon NVARCHAR(250) NULL,
    gebruikersnaam NVARCHAR(250) NOT NULL,
    wachtwoord NVARCHAR(250) NOT NULL
);


insert into Customer (klantId, voornaam, achternaam, geboortedatum, email, telefoon, gebruikersnaam, wachtwoord)
values (1,'Wesley','Verbeke','10-09-1981','test@wesverbeke.com','+32477691785','Wes','testWes');
