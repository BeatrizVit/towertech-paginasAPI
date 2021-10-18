package com.mycompany.projeto.java.rodrigo.garcez;

import java.util.concurrent.ThreadLocalRandom;

public class Metodos {

    Integer menorNumeroCPU = 10000;
    Integer maiorNumeroCPU = -10000;
    Integer menorNumeroDISCO = 10000;
    Integer maiorNumeroDISCO = -10000;
    Integer menorNumeroRAM = 10000;
    Integer maiorNumeroRAM = -10000;
    Integer listaDadosCPU = 0;
    Integer contadorCPU = 0;
    Integer listaDadosDISCO = 0;
    Integer contadorDISCO = 0;
    Integer listaDadosRAM = 0;
    Integer contadorRAM = 0;

    /*CPU*/
    Integer randomCPU() {
        return ThreadLocalRandom.current().nextInt(0, 101);
    } //Retorna um numero inteiro de 0 a 100

    Integer minCPU(Integer randomCPU) {
        if (randomCPU < menorNumeroCPU) {
            menorNumeroCPU = randomCPU;
        }
        return menorNumeroCPU;
    }// Verifica se o numero gerado é menor que o "menor numero", e guarda nela
    // mesma

    Integer maxCPU(Integer randomCPU) {
        if (randomCPU > maiorNumeroCPU) {
            maiorNumeroCPU = randomCPU;
        }
        return maiorNumeroCPU;
    }// Verifica se o numero gerado é maior que o "maior numero", e guarda nela
    // mesma

    Integer avgCPU(Integer randomCPU) {
        listaDadosCPU = listaDadosCPU + randomCPU;
        contadorCPU++;
        Integer avgCPU = listaDadosCPU / contadorCPU;
        return avgCPU;
    }// Soma o numero gerado com o que ja contem na "lista" e realiza a média 
    // retornando a média para a outra class

    
    
    
    
    /*DISCO*/
    Integer randomDISCO() {
        return ThreadLocalRandom.current().nextInt(0, 101);
    }

    Integer minDISCO(Integer randomDISCO) {
        if (randomDISCO < menorNumeroDISCO) {
            menorNumeroDISCO = randomDISCO;
        }
        return menorNumeroDISCO;
    }

    Integer maxDISCO(Integer randomDISCO) {
        if (randomDISCO > maiorNumeroDISCO) {
            maiorNumeroDISCO = randomDISCO;
        }
        return maiorNumeroDISCO;
    }

    Integer avgDISCO(Integer randomDISCO) {
        listaDadosDISCO = listaDadosDISCO + randomDISCO;
        contadorDISCO++;
        Integer avgDISCO = listaDadosDISCO / contadorDISCO;
        return avgDISCO;
    }

    /*RAM*/
    Integer randomRAM() {
        return ThreadLocalRandom.current().nextInt(0, 101);
    }

    Integer minRAM(Integer randomRAM) {
        if (randomRAM < menorNumeroRAM) {
            menorNumeroRAM = randomRAM;
        }
        return menorNumeroRAM;
    }

    Integer maxRAM(Integer randomRAM) {
        if (randomRAM > maiorNumeroRAM) {
            maiorNumeroRAM = randomRAM;
        }
        return maiorNumeroRAM;
    }

    Integer avgRAM(Integer randomRAM) {
        listaDadosRAM = listaDadosRAM + randomRAM;
        contadorRAM++;
        Integer avgRAM = listaDadosRAM / contadorRAM;
        return avgRAM;
    }
}
