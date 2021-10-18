let chamado1Aberto = false
let chamado2Aberto = false

function abrirChamado1() {
    if (chamado1Aberto) {
        chamado1Aberto = false
        chamadoAberto1.style.display = "none"
        setaBaixo1.style.display = "block"
        setaCima1.style.display = "none"
    } else {
        chamado1Aberto = true
        chamadoAberto1.style.display = "block"
        // chamado1.style.margin-bottom = "0%"
        setaBaixo1.style.display = "none"
        setaCima1.style.display = "block"
    }
}

function abrirChamado2() {
    if (chamado2Aberto) {
        chamado2Aberto = false
        chamadoAberto2.style.display = "none"
        setaBaixo2.style.display = "block"
        setaCima2.style.display = "none"
    } else {
        chamado2Aberto = true
        chamadoAberto2.style.display = "block"
        setaBaixo2.style.display = "none"
        setaCima2.style.display = "block"
    }
}

    nomeMaq = idNomeMaq.value = fkComputador.json;
    nomeTorre.value = 
    // dados = [];
    // dadosMonitorados.value = dados;

    function abrirAlerta() {
         fetch(/dashboard/dadosMonitoramento, { cache: 'no-store' }).then(function (response) { 
             if (response.ok) {
                 response.json().then(function (resposta) {
                    console.log(`Dados recebidos: ${JSON.stringify(resposta)}`);
                    resposta.reverse();
                    
                    if(cpuPorcentagem.json >= 8000 || ramPorcentagem.json >= 8000 || discoPorcentagem.json >= 8000) {
                         function addNewComponent(componentName) {
                            document.getElementById(".alertas_critico").innerHTML +=
                                '<div class="alerta_vermelho">' +
                                    '<h3>Máquina <span id="idNomeMaq">X</span></h3>' + 
                                    '<div class="descricao_alerta">' +
                                        '<div>' +
                                            '<h4>Localização</h4>' +
                                            '<p id="nomeTorre" name="nomeTorre">Torre Viracopos</p>' +
                                        '</div>' +
                                        '<div>' +
                                            '<h4>Monitorando</h4>' +
                                            '<p id="dadosMonitorados" name="dadosMonitorados">CPU, RAM, Disco, Internet, Usuário</p>' +
                                        '</div>'
                                    '</div>'
                                '</div>' +
                                `${componentName}`;
            
                            alerta_vermelho.style.border = "1px solid #FF0000";    
            
                            if(nomeMaq.length[0] > 1) {
                                alerta_vermelho.style.border = "1px solid #FF0000";
                            }
            
                         } 
            
                    } else if(cpuPorcentagem.json >= 6000 && cpuPorcentagem <= 8000 || ramPorcentagem.json >= 6000 && ramPorcentagem <= 8000 || discoPorcentagem.json >= 6000 && discoPorcentagem <= 8000) {
                         function addNewComponent(componentName) {
                            document.getElementById(".alertas_atencao").innerHTML +=
                                '<div class="alerta_vermelho">' +
                                    '<h3>Máquina <span id="idNomeMaq">X</span></h3>' + 
                                    '<div class="descricao_alerta">' +
                                        '<div>' +
                                            '<h4>Localização</h4>' +
                                            '<p name="nomeTorre">Torre Viracopos</p>' +
                                        '</div>' +
                                        '<div>' +
                                            '<h4>Monitorando</h4>' +
                                            '<p id="dadosMonitorados" name="dadosMonitorados">CPU, RAM, Disco, Internet, Usuário</p>' +
                                        '</div>'
                                    '</div>'
                                '</div>' +
                                `${componentName}`;
            
                            alerta_vermelho.style.border = "1px solid #FFA903;";    
            
                            if(nomeMaq.length[0] > 1) {
                                alerta_vermelho.style.border = "1px solid #FFA903;";
                            }
            
                        }
                    
                    }
                    
                 });

             } else {
                 console.error('Nenhum dado encontrado ou erro na API');
             }
         })
             .catch(function (error) {
                console.error(`Erro na obtenção dos dados: ${error.message}`);
             });
    }
    

    //trocar soma dos valores de porcentagem do select 
    //sum(cpuPorcentagem), sum(ramPorcentagem), sum(discoPorcentagem) desc limit 10; 

    
