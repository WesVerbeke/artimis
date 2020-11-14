--DROP TABLE IF EXISTS BestellingProduct;

CREATE TABLE BestellingProduct(
bestellingProductId INT PRIMARY KEY,
productId INT NOT NULL,
bestellingId INT NOT NULL,
aantal INT NOT NULL,
einddatum DATE NULL
)