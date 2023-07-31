package br.com.interasys;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AreasAulaTest {


    @Test
    public void testarCalcularQuadrado (){
        //Configura
        double lado = 3;
        double resultadoEsperado = 9;

        //Executa
        double ResultadoAtual = AreasAula.calcularQuadrado(lado);

        // Valida
        Assert.assertEquals(ResultadoAtual, resultadoEsperado);

    }

    @Test
    public void testarCalcularRetangulo() {
        double largura = 5;
        double comprimento = 8;
        double resultadoEsperado = 40;
        double resultadoAtual = AreasAula.calcularRetangulo(largura, comprimento);
        Assert.assertEquals(resultadoAtual, resultadoEsperado);
    }

    @Test
    public void testarCalcularTriangulo() {
        double base = 6;
        double altura = 4;
        double resultadoEsperado = 12;
        double resultadoAtual = AreasAula.calcularTriangulo(base, altura);
        Assert.assertEquals(resultadoAtual, resultadoEsperado);
    }

    @Test
    public void testarCalcularCirculo() {
        double raio = 2;
        double resultadoEsperado = 12.566370614359172;
        double resultadoAtual = AreasAula.calcularCirculo(raio);
        Assert.assertEquals(resultadoAtual, resultadoEsperado);
    }
}









