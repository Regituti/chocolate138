// 1 - Pacote
package br.com.interasys;
// 2 - Importação de Bibliotecas


// 3 - Classe
public class Encomenda {
    // 3.1 Atributos

    // 3.2 Funções e Métodos
    public static int calcularBarrasDeChocolatesPorCaixa(int barras){
        byte quantidadePorCaixa = 12;
        int caixas = barras / quantidadePorCaixa;
        int unidades = barras % quantidadePorCaixa;
        System.out.println("QUantidade de Caixas: "+ caixas);
        System.out.println("unidades: "+ unidades);
        return caixas;

    } // fim do calcularBarrasDeChocolatesPorCaixa
} // fim da classe Encomenda
