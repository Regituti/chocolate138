      // 1 -PACOTE
package br.com.interasys;
     // 2 -BIBLIOTECA
import juntos.Calculadora2;
import org.testng.Assert;
import org.testng.annotations.Test;
     // 3- CLASSE
public class Calculadora2Test {
    // 3.1 -ATRIBUTOS

    // 3.2- MÉTODOS E FUNÇÕES
    @Test
    public void testesomar (){
       // CONFIGURA -arrange
        double num1 = 5;
        double num2 = 7;

        double resultadoEsperado = 12;

       // EXECUTA - act
        double resultadoAtual = Calculadora2.somar(num1,num2);

       // VALIDA - assert
        Assert.assertEquals(resultadoAtual , resultadoEsperado);
    }
}
