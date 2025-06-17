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
    categoria varchar(50),
    idCategoria int,
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

--Selecionar e testar as tabelas
select * from categoria;
select * from produtos;      
select * from movimentacao;

--Dropar as tabelas em caso de erro
drop table categoria;
drop table produtos;
drop table movimentacao;
