if(funcao('select = (porcentagem >=80 * 5)')) {
	//if Maq.porcentagemCpu => 80 || Maq.porcentagemRam => 80 || Maq.porcentagemDisco => 80{
		function addNewComponent(componentName) {
			document.getElementById("view_lista_componentes").innerHTML +=
				"<div class="alerta alerta_vermelho">
				<h3>Máquina X</h3>
				<div class="descricao_alerta">
				  <div>
					<h4>Localização</h4>
					<p class="nomeTorre" name="nomeTorre">Torre Viracopos</p>
				  </div>
				  <div>
					<h4>Monitorando</h4>
					<p>CPU, RAM, Disco, Internet, Usuário</p>
				  </div>
				</div>
			  </div>" +
				`${componentName}` +
				"</button>";
			
			setColor.divAlertaMaq
    //}
	
	} else if(divAlertaMaq == existir) {
		setColor.divAlertaMaq = red;
}	


// *************//////////////
//divAlertaMaq = idMaq, fkTorre;

/*function addNewComponent(componentName) {
        document.getElementById("view_lista_componentes").innerHTML +=
            "<button class='sessao-componentes__btn-torre navbar-btn-font'>" +
            `${componentName}` +
            "</button>";
    }*/

//se tempo de discretização for 10 ? 