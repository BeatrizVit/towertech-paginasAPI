function chamargraficos() {
    console.log("executei chamargraficos")
    obterDadosGraficoPrimeiraVez()

}



// neste JSON tem que ser 'labels', 'datasets' etc, 
// porque é o padrão do Chart.js



// altere aqui as configurações do gráfico
// (tamanhos, cores, textos, etc)
function configurarGrafico() {
    console.log("executei configurarGrafico")
    var configuracoes = {
        responsive: true,
        maintainAspectRatio: false,
        animation: { duration: 500 },
        hoverMode: 'index',
        stacked: false,
        title: {
            display: true,
            text: ''
        },
        scales: {
            yAxes: [{
                type: 'linear', // only linear but allow scale type registration. This allows extensions to exist solely for log scale for instance
                display: true,
                position: 'left',
                id: 'y-temperatura',
            }, {
                type: 'linear', // only linear but allow scale type registration. This allows extensions to exist solely for log scale for instance
                display: false,
                position: 'right',
                id: 'y-umidade',

                // grid line settings
                gridLines: {
                    drawOnChartArea: false, // only want the grid lines for one axis to show up
                },
            }],
        }
    };

    return configuracoes;
}

// altere aqui como os dados serão exibidos
// e como são recuperados do BackEnd
function obterDadosGraficoPrimeiraVez(fkComputador, fkTorre) {
    console.log("executei obterDadosGraficoPrimeiraVez")
   

    if (proximaAtualizacao != undefined) {
        clearTimeout(proximaAtualizacao);
    }   

    fetch(`/leituras/ultimas/${fkComputador}/${fkTorre}`, { cache: 'no-store' }).then(function (response) {
        if (response.ok) {
            response.json().then(function (resposta) {
                console.log(`Dados recebidos: ${JSON.stringify(resposta)}`);
                resposta.reverse();

                
                var dados = {
                    labels: [],
                    datasets: [
                        {
                            yAxisID: 'y-temperatura',
                            label: 'CPU',
                            borderColor: 'rgba(255,0,0,1)',
                            backgroundColor: ['rgba(255,0,0,1)', 'rgba(255,0,0,255)'],
                            fill: false,
                            data: []
                        }
                    ]
                };
                var dadosDisco = {
                    labels: [],
                    datasets: [
                        {
                            yAxisID: 'y-temperatura',
                            label: 'DISCO',
                            borderColor: 'rgba(255,0,0,1)',
                            backgroundColor: 'rgba(255,0,0,1)',
                            fill: false,
                            data: []
                        }
                    ]
                };
                var dadosRam = {
                    labels: [],
                    datasets: [
                        {
                            yAxisID: 'y-temperatura',
                            label: 'RAM',
                            borderColor: 'rgba(255,0,0,1)',
                            backgroundColor: 'rgba(255,0,0,1)',
                            fill: false,
                            data: []
                        }
                    ]
                };
                for (i = 0; i < resposta.length; i++) {
                    var registro = resposta[i];
                    dados.labels.push(registro.momento_grafico);
                    dadosDisco.labels.push(registro.momento_grafico);
                    dadosRam.labels.push(registro.momento_grafico);
                    dados.datasets[0].data.push(registro.cpuPorcentual);
                    dadosDisco.datasets[0].data.push(registro.discoPorcentual);
                    dadosRam.datasets[0].data.push(registro.ramPorcentual);
                    id_internet.innerHTML = registro.internet;
                    id_usuario.innerHTML = registro.usuarioMaq;
                    
                    

                }
                id_computador.innerHTML = fkComputador;
                console.log(JSON.stringify(dados));
               
                plotarGrafico(fkComputador, fkTorre, dados, dadosDisco, dadosRam);
            });
        } else {
            console.error('Nenhum dado encontrado ou erro na API');
        }
    })
        .catch(function (error) {
            console.error(`Erro na obtenção dos dados p/ gráfico: ${error.message}`);
        });

}



// só mexer se quiser alterar o tempo de atualização
// ou se souber o que está fazendo!
function atualizarGrafico(fkComputador, fkTorre, dados, dadosDisco, dadosRam) {
    console.log("executei atualizarGrafico")
    fetch(`/leituras/tempo-real/:${fkComputador}/:${fkTorre}`, { cache: 'no-store' }).then(function (response) {
        
        if (response.ok) {
            response.json().then(function (novoRegistro) {

                console.log(`Dados recebidos2: ${JSON.stringify(novoRegistro)}`);
                console.log(`Dados atuais do gráfico: ${dados}`);
                console.log(novoRegistro.cpuPorcentual)

                // tirando e colocando valores no gráfico
                dados.labels.shift(); // apagar o primeiro
                dados.labels.push(novoRegistro.momento_grafico); // incluir um novo momento
                dados.datasets[0].data.shift();  // apagar o primeiro de temperatura                
                dados.datasets[0].data.push(novoRegistro.cpuPorcentual); // incluir uma nova leitura de temperatura

                dadosDisco.labels.shift(); // apagar o primeiro
                dadosDisco.labels.push(novoRegistro.momento_grafico); // incluir um novo momento
                dadosDisco.datasets[0].data.shift();  // apagar o primeiro de temperatura                
                dadosDisco.datasets[0].data.push(novoRegistro.discoPorcentual); // incluir uma nova leitura de temperatura

                dadosRam.labels.shift(); // apagar o primeiro
                dadosRam.labels.push(novoRegistro.momento_grafico); // incluir um novo momento
                dadosRam.datasets[0].data.shift();  // apagar o primeiro de temperatura                
                dadosRam.datasets[0].data.push(novoRegistro.ramPorcentual); // incluir uma nova leitura de temperatura

               
                id_cpu.innerHTML = `${novoRegistro.cpuPorcentual}%`
                id_disco.innerHTML = `${novoRegistro.discoPorcentual}%`
                id_ram.innerHTML = `${novoRegistro.ramPorcentual}%`

                dados.datasets[0].backgroundColor = funcaoCorLinhas(dados, novoRegistro);
                dados.datasets[0].borderColor = funcaoCorLinhas(dados, novoRegistro);
                

                

                window.grafico_linha.update();
                window.grafico_linha_Disco.update();
                window.grafico_linha_Ram.update();


                proximaAtualizacao = setTimeout(() => atualizarGrafico(dados, dadosDisco, dadosRam), 5000);
            });
        } else {
            console.error('Nenhum dado encontrado ou erro na API');
            proximaAtualizacao = setTimeout(() => atualizarGrafico(dados, dadosDisco, dadosRam), 5000);
        }
    })
        .catch(function (error) {
            console.error(`Erro na obtenção dos dados p/ gráfico: ${error.message}`);
        });

}

// só altere aqui se souber o que está fazendo!
function plotarGrafico(fkComputador, fkTorre, dados, dadosDisco, dadosRam) {
    console.log("executei plotarGrafico")
    console.log('iniciando plotagem do gráfico...');

    var ctx = canvas_grafico.getContext('2d');
    var ctxDisco = canvas_grafico1.getContext('2d');
    var ctxRam = canvas_grafico2.getContext('2d');
   
    
    window.grafico_linha = Chart.Line(ctx, {
        data: dados,
        options: configurarGrafico()
    });
 
    window.grafico_linha_Disco = Chart.Line(ctxDisco, {
        data: dadosDisco,
        options: configurarGrafico()
    });
    window.grafico_linha_Ram = Chart.Line(ctxRam, {
        data: dadosRam,
        options: configurarGrafico()
    });


    setTimeout(() => atualizarGrafico(fkComputador, fkTorre, dados, dadosDisco, dadosRam), 2000);
}

function funcaoCorLinhas(dados, novoRegistro) {
    if (novoRegistro.cpuPorcentual == null) {
        var valor = 20
    }
    else {
        valor = novoRegistro.cpuPorcentual;
    }
    if (valor > 0 && valor < 35) {
        return "green"
    }
    else if (valor > 35 && valor < 75) {
        return "yellow"        
    }

    else if (valor > 75 ) {
        return "red"
    }



    return "green"
}


function qtdTorre(fkEmpresa) {
    fetch(`/usuarios/qtdTorres/${fkEmpresa}`, { cache: 'no-store' }).then(function (response) {
        
        if (response.ok) {                
            response.json().then(function (resposta) {
                console.log(`Dados recebidos: ${JSON.stringify(resposta)}`);
                console.log(resposta);  
                for (var i = 0; i < resposta.length; i++) {
                  document.querySelector('.scrollLocalizacao').innerHTML += `
                            <div class="torres">
                                <div class="a1">
                                    <h3>${resposta[i].nomeTorre}</h3>
                                </div> 
                            </div>` 
                }               
            });
        } else {
            console.error('Nenhum dado encontrado ou erro na API');
        }
    })
        .catch(function (error) {
            console.error(`Erro na obtenção dos dados: ${error.message}`);
        });

    return false;
}

function get_fk_empresa() {
    var fkEmpresa = sessionStorage.getItem('fk_empresa_meuapp')
    return fkEmpresa  
}






   