--DROP TABLE IF EXISTS BestellingStatus;

CREATE TABLE BestellingStatus(
bestellingStatusId INT PRIMARY KEY,
bestellingStatusBeschrijving NVARCHAR(250) NULL
)

INSERT INTO BestellingStatus
VALUES (1, 'WAITING FOR PAYMENT')
INSERT INTO BestellingStatus
VALUES (2, 'CANCELLED')
INSERT INTO BestellingStatus
VALUES (3, 'SHIPPED')
INSERT INTO BestellingStatus
VALUES (4, 'FINISHED')