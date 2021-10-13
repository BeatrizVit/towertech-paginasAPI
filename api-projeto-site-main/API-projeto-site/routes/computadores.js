var express = require('express');
var router = express.Router();
var sequelize = require('../models').sequelize;
var Computador = require('../models').Computador; 

let sessoes = [];

/* Recuperar usuário por login e senha */
router.post('/autenticar', function(req, res, next) {
	console.log('Recuperando usuário por login e senha');

	var marcaMaq = req.body.marca; // depois de .body, use o nome (name) do campo em seu formulário de login
	var numSerie = req.body.numeroSerie; // depois de .body, use o nome (name) do campo em seu formulário de login	
	
	let instrucaoSql = `select * from tbComputadores`; 
	console.log(instrucaoSql);

	

	sequelize.query(instrucaoSql, {
		model: Computador 
	}).then(resultado => {
		console.log(`Encontrados: ${resultado.length}`);
		idComp = resultado.length;

	}).catch(erro => {
		console.error(erro);
		res.status(500).send(erro.message);
  	});
});

/* Cadastrar maquina */
router.post('/cadastrarComputador', function(req, res, next) {
	console.log('Cadastrando um novo computador');
	
	sequelize.query(instrucaoSql, {
		model: Maquina 
	}).then(resultado => {
		console.log(`Encontrados: ${resultado.length}`);
		idComp = resultado.length;

	}).catch(erro => {
		console.error(erro);
		res.status(500).send(erro.message);
  	});
	  
	Maquina.create({
		id: req.body.idComputador,
		marca: req.body.marca,
		modelo: req.body.modelo,
		numeroSerie: req.body.nmr_serie,	
		processador: req.body.cpu,
		capacidadeRam: req.body.mem_ram,
        capacidadeDisco: req.body.disco,
		fkTorre: 1,
        

	}).then(resultado => {
		console.log(`Registro criado: ${resultado}`)
        res.send(resultado);
    }).catch(erro => {
		console.error(erro);
		res.status(500).send(erro.message);
  	});
});


/* Verificação de usuário */
/*router.get('/sessao/:login', function(req, res, next) {
	let login = req.params.login;
	console.log(`Verificando se o usuário ${login} tem sessão`);
	
	let tem_sessao = false;
	for (let u=0; u<sessoes.length; u++) {
		if (sessoes[u] == login) {
			tem_sessao = true;
			break;
		}
	}

	if (tem_sessao) {
		let mensagem = `Usuário ${login} possui sessão ativa!`;
		console.log(mensagem);
		res.send(mensagem);
	} else {
		res.sendStatus(403);
	}
	
});*/


/* Logoff de usuário */
router.get('/sair/:login', function(req, res, next) {
	let login = req.params.login;
	console.log(`Finalizando a sessão do usuário ${login}`);
	let nova_sessoes = []
	for (let u=0; u<sessoes.length; u++) {
		if (sessoes[u] != login) {
			nova_sessoes.push(sessoes[u]);
		}
	}
	sessoes = nova_sessoes;
	res.send(`Sessão do usuário ${login} finalizada com sucesso!`);
});


/* Recuperar o valor dos computadores cadastrados por torre */
router.get('/idCompuatador/:torre', function(req, res, next) {
	console.log('Recuperando todos os computadores');

	var torre = req.params.torre;

	let instrucaoSql = `select count(*) as "ids" from tbcomputadores where fkTorre = ${torre};`;
	console.log(instrucaoSql);

	sequelize.query(instrucaoSql, {
		model: Computador

	}).then(resultado => {
		console.log(`Encontrados: ${resultado}`);
		res.json(resultado);

	}).catch(erro => {
		console.error(erro);
		res.status(500).send(erro.message);
  	});
});

module.exports = router;
