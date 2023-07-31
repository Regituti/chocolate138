package br.com.interasys;

import chatGPT.Calculadora;

public class Main {
    public static void main(String[] args) {
        System.out.println("olá mundo!");
        chamarEncomenda();
        Calculadora.somarInteiros(5,7);
        Calculadora.subtrairInteiros(7,5);
        Calculadora.multiplicarInteiros(2,3);
        Calculadora.dividirInteiros(8,2);
    }
    public static void chamarEncomenda() {
        int barras = 30;

        Encomenda.calcularBarrasDeChocolatesPorCaixa(barras);
    }
}

