	'use strict';

/* 
lista e explicação dos Datatypes:
https://codewithhugo.com/sequelize-data-types-a-practical-guide/
*/

module.exports = (sequelize, DataTypes) => {
    let Usuario = sequelize.define('Usuario',{
		id: {
			field: 'idFuncionario',
			type: DataTypes.INTEGER,
			primaryKey: true,
			autoIncrement: true
		},		
		nome: {
			field: 'nomeFuncionario',
			type: DataTypes.STRING,
			allowNull: false
		},
		sobrenome: {
			field: 'sobrenomeFuncionario',
			type: DataTypes.STRING,
			allowNull: false
		},
		login: {
			field: 'email',
			type: DataTypes.STRING,
			allowNull: false
		},
		senha: {
			field: 'senha',
			type: DataTypes.STRING,
			allowNull: false
		},
		cargo: {
			field: 'cargo',
			type: DataTypes.STRING,
			allowNull: false
		},
		permissao: {
			field: 'permissao',
			type: DataTypes.CHAR,
			allowNull: false,
		},
		fkEmpresa: {
			field: 'fkEmpresa',
			type: DataTypes.INTEGER,
			allowNull: false
		}

	}, 
	{
		tableName: 'tbfuncionario', 
		freezeTableName: true, 
		underscored: true,
		timestamps: false,
	});

    return Usuario;
};
