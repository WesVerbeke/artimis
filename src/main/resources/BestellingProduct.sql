--DROP TABLE IF EXISTS BestellingProduct;

CREATE TABLE BestellingProduct(
bestellingproductid INT PRIMARY KEY,
productid INT NOT NULL,
bestellingid INT NOT NULL,
aantal INT NOT NULL,
einddatum DATE NULL
)