create database TowerTech;
use TowerTech;
create table tbEmpresa (
	idEmpresa int primary key auto_increment,
    nomeEmpresa varchar(30),
    cnpj char(14),
    telefoneFixo char(13),
    cep char(9),
    logradouro varchar(45),
    numeroEndereco char(5),
    cidadeEmpresa varchar(45),
    estadoEmpresa char(2));
    
create table tbFuncionario (
	idFuncionario int primary key auto_increment,
    nomeFuncionario varchar(20),
    sobrenomeFuncionario varchar(20),
    email varchar(65),
    senha varchar(20),
    cargo varchar(45),
    permissao char(1),
    fkEmpresa int,
    foreign key (fkEmpresa) references tbEmpresa(idEmpresa));

create table tbTorre (
	idTorre int primary key auto_increment,
    nomeTorre varchar(45),
    logradouroTorre varchar(60),
    numeroTorre char(5),
    cidadeTorre varchar(50),
    estadoTorre char(2),
    fkEmpresa int,
    foreign key (fkEMpresa) references tbEmpresa(idEmpresa));

create table tbComputadores (
	idComputadores int,
    fkTorre int,
    marca varchar(20),
    modelo varchar(30),
    numeroSerie varchar(45),
    processador varchar(15),
    capacidadeRam int,
    capacidadeDisco int,
    primary key (idComputadores,fkTorre)
);

create table tbComponentes (
	idComponentes int primary key auto_increment,
    nomeComponente varchar(45),
	metricaAssociada varchar(5)
);
    
create table tbComputadoresComponentes (
	fkComputador int,
    fkTorre int,
    fkComponentes int,
    dataIncioCaptura date,
    primary key (fkComputador,fkTorre,fkComponentes)
);
-- Tabela para brandão
create table tbLeituras (
	idLeituras int,
    fkComputadores int,
    fkTorre int,
    fkComponentes int,
    usuarioConectado varchar(30),
    dataHora datetime,
    internet varchar(13),
    valor decimal(5,2),
    primary key (idLeituras,fkComputadores,fkTorre,fkComponentes)
    );
-- Tabela para marise
create table tbCapturaDeDados (
	idCapturaDeDados int,
    fkComputador int,
    fkTorre int,
    usuarioMaq varchar(45),
    cpuValor decimal(5,2),
    ramValor decimal(5,2),
    discoValor decimal(5,2),
    internet varchar(13),
    dataHora datetime,
    primary key(idCapturaDeDados,fkComputador,fkTorre)
    );
    