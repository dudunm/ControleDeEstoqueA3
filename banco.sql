create database estoque;

use estoque;

create table categoria(
	idCategoria int not null,
    nome varchar(50),
    primary key (nome)
);

create table produtos(
	idProduto int not null auto_increment,
    nome varchar(50),
    categoria varchar(50),
    quantidade int,
    precoUnitario double,
    primary key (idProduto),
    foreign key (categoria) references categoria(nome) 
);

create table clientes(
	idCliente int not null auto_increment,
    nome varchar(50),
    cpf varchar(14),
    primary key (idCliente)
);

ALTER TABLE clientes add email varchar(50);

ALTER TABLE produtos add quantidadeEstoque int;
ALTER TABLE produtos add quantidadeMinima int;
ALTER TABLE produtos add quantidadeMaxima int;
ALTER TABLE produtos add unidade varchar(50);

alter table categoria add tamanho varchar(10);
alter table categoria add embalagem varchar(10);