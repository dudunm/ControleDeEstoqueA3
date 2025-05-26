create database estoque;

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

