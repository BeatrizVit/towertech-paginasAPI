'use strict';

/* 
lista e explicação dos Datatypes:
https://codewithhugo.com/sequelize-data-types-a-practical-guide/
*/

module.exports = (sequelize, DataTypes) => {
    let Chamado = sequelize.define('Chamado',{

		idChamado: {
			field: 'idChamado',
			type: DataTypes.INTEGER,
			primaryKey: true,
			autoIncrement: false
		},	
		localizacao: {
			field: 'localizacaoChamado',
			type: DataTypes.STRING,
			primaryKey: true,
			autoIncrement: false
		},
		DataAbertura: {
			field: 'dataAbertura',
			type: DataTypes.STRING,
			allowNull: false
		},
		dataConclusao: {
			field: 'dataConclusao',
			type: DataTypes.STRING,
			allowNull: false
		},
		status: {
			field: 'statusChamado',
			type: DataTypes.STRING,
			allowNull: false
		},
		fkTorre: {
			field: 'fkTorre',
			type: DataTypes.INTEGER,
			allowNull: false
		},
		fkComputador: {
			field: 'fkComputador',
			type: DataTypes.INTEGER,
			allowNull: false
		}
		
	}, 
	{
		tableName: 'tbChamados', 
		freezeTableName: true, 
		underscored: true,
		timestamps: false,
	});

    return Chamado;
};
