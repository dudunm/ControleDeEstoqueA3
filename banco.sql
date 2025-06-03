CREATE TABLE categoria(
    idCategoria INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(58),
    tamanho VARCHAR(10),
    embalagem VARCHAR(10),
    PRIMARY KEY (idCategoria)
);

CREATE TABLE produtos(
    idProduto INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(58),
    precoUnitario DOUBLE,
    unidade VARCHAR(58),
    quantidadeEstoque INT,
    quantidadeMinima INT,
    quantidadeMaxima INT,
    idCategoria INT,
    PRIMARY KEY (idProduto),
    FOREIGN KEY (idCategoria) REFERENCES categoria(idCategoria)
);

select * from categoria;