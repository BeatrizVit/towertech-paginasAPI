CREATE DATABASE TowerTech;

USE TowerTech;

CREATE TABLE tbEmpresas (
	idEmpresa 		INT PRIMARY KEY AUTO_INCREMENT,
    nomeEmpresa 	VARCHAR(30) NOT NULL,
    cnpj 			CHAR(14) 	NOT NULL,
    telefoneFixo 	CHAR(13)	NOT NULL,
    cep 			CHAR(9) 	NOT NULL,
    logradouro 		VARCHAR(45) NOT NULL,
    numeroEndereco 	INT 		NOT NULL,
    cidadeEmpresa 	VARCHAR(45) NOT NULL,
    estadoEmpresa 	CHAR(2) 	NOT NULL
);
    
CREATE TABLE tbFuncionarios (
	idFuncionario 			INT,
    fkEmpresa 				INT,
    PRIMARY KEY (idFuncionario, fkEmpresa),
    nomeFuncionario 		VARCHAR(20) NOT NULL,
    sobrenomeFuncionario 	VARCHAR(20) NOT NULL,
    email 					VARCHAR(65) NOT NULL UNIQUE,
    senha 					VARCHAR(20) NOT NULL,
    cargo 					VARCHAR(45) NOT NULL,
    permissao 				CHAR(1) 	NOT NULL CHECK(permissao = "A" OR permissao = "G") 
);

CREATE TABLE tbTorres (
	idTorre 		INT PRIMARY KEY AUTO_INCREMENT,
    nomeTorre 		VARCHAR(45) NOT NULL,
    logradouroTorre VARCHAR(60) NOT NULL,
    numeroTorre 	INT 		NOT NULL,
    cidadeTorre 	VARCHAR(50) NOT NULL,
    estadoTorre 	CHAR(2) 	NOT NULL,
    fkEmpresa 		INT 		NOT NULL,
    FOREIGN KEY (fkEmpresa) REFERENCES tbEmpresas(idEmpresa)
);

CREATE TABLE tbComputadores (
	idComputador 	INT,
    fkTorre 		INT,
    PRIMARY KEY (idComputador, fkTorre),
    marca 			VARCHAR(20) NOT NULL,
    modelo 			VARCHAR(30) NOT NULL,
    numeroSerie 	VARCHAR(45) NOT NULL,
    processador 	VARCHAR(15) NOT NULL,
    capacidadeRam 	INT 		NOT NULL,
    capacidadeDisco INT 		NOT NULL
);

-- Tabela para Marise
CREATE TABLE tbCapturaDeDados (
	idCapturaDeDado 	INT,
    fkComputador 		INT,
    fkTorre 			INT,
	PRIMARY KEY (idCapturaDeDado, fkComputador, fkTorre),
    usuarioMaq 			VARCHAR(45),
    cpuPorcentual		DECIMAL(5,2),
    ramPorcentual		DECIMAL(5,2),
    discoPorcentual		DECIMAL(5,2),
    internet 			VARCHAR(13),
    dataHora 			DATETIME
);

-- Tabela para Brandão    
CREATE TABLE tbComponentes (
	idComponente		INT PRIMARY KEY AUTO_INCREMENT,
    nomeComponente 		VARCHAR(45) NOT NULL,
	metricaAssociada 	VARCHAR(5) 	NOT NULL
);
    
CREATE TABLE tbComputadoresComponentes (
	fkComputador 		INT,
    fkTorre 			INT,
    fkComponente 		INT,
    PRIMARY KEY (fkComputador, fkTorre, fkComponente),
    dataInicioCaptura 	DATE NOT NULL
);

CREATE TABLE tbDados (
	idDado 				INT,
    fkComputador 		INT,
    fkTorre 			INT,
    fkComponente 		INT,
	PRIMARY KEY (idDado, fkComputador, fkTorre, fkComponente),
    usuarioConectado 	VARCHAR(30),
    valor 				DECIMAL(5,2) 	NOT NULL,
	dataHora 			DATETIME 		NOT NULL
);
    
    
