--DROP TABLE IF EXISTS BestellingProduct;

CREATE TABLE BestellingProduct(
bestellingProductId INT PRIMARY KEY,
productId INT NOT NULL,
bestellingId INT NOT NULL,
aantal INT NOT NULL,
einddatum DATE NULL
)

INSERT INTO BestellingProduct
VALUES (1, 1, 1, 1, NULL)
INSERT INTO BestellingProduct
VALUES (2, 2, 1, 1, NULL)
INSERT INTO BestellingProduct
VALUES (3, 2, 2, 1, NULL)
INSERT INTO BestellingProduct
VALUES (4, 4, 3, 1, NULL)
INSERT INTO BestellingProduct
VALUES (5, 5, 4, 1, NULL)