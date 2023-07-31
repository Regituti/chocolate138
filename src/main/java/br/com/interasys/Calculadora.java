package chatGPT;

public class Calculadora {
    public static int somarInteiros(int num1, int num2){
        int soma = num1 + num2;
        System.out.println("soma de " + num1 + " + " + num2 + " = " + soma);
        return soma;

    }

    public static int subtrairInteiros(int num1, int num2){
        int resultado = num1 -num2;
        System.out.println("subtração de " + num1 + "-" + num2 + " = " + resultado);
        return resultado;
    }

    public static int multiplicarInteiros(int num1, int num2){
        int resultado = num1 * num2;
        System.out.println("multiplicação de " + num1 + " * " + num2 + " = " + resultado);
        return resultado;
    }

    public static int dividirInteiros(int num1, int num2){
        int resultado = num1 / num2;
        System.out.println("divisão de " + num1 + " / " + num2 + " = " + resultado);
        return resultado;

    }
}

