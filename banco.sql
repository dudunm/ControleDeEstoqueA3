CREATE TABLE categoria(
    idCategoria INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(58),
    tamanho VARCHAR(10),
    embalagem VARCHAR(10)
);

CREATE TABLE produtos(
    idProduto INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(58),
    precoUnitario DOUBLE,
    unidade VARCHAR(58),
    quantidadeEstoque INT,
    quantidadeMinima INT,
    quantidadeMaxima INT,
    idCategoria INT,
    FOREIGN KEY (idCategoria) REFERENCES categoria(idCategoria)
);

CREATE TABLE movimentacao(
    idMovimentacao INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    data DATETIME NOT NULL,
    tipo VARCHAR(10),
    quantidade INT NOT NULL,
    idProduto INT NOT NULL,
    FOREIGN KEY (idProduto) REFERENCES produtos(idProduto)
);

select * from categoria;        
