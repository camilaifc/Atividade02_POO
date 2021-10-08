package atividade02;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Ex28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                
        System.out.println("Informe o primeiro número: ");
        double n1 = sc.nextDouble();
        System.out.println("Informe o segundo número: ");
        double n2 = sc.nextDouble();
        
        System.out.println("Informe a operação que deseja realizar: ");
        System.out.println("1 - Soma (+)");
        System.out.println("2 - Subtração (-)");
        System.out.println("3 - Multiplicação (*)");
        System.out.println("4 - Divisão (/)");
        int acao = sc.nextInt();
        
        double resultado = 0;
        
        switch (acao) {
            case 1: 
                resultado = n1 + n2;
                break;
            case 2:
                resultado = n1 - n2;
                break;
            case 3:
                resultado = n1 * n2;
                break;
            case 4:
                if (n2 != 0){
                    resultado = n1/n2;                    
                }
                else {
                    System.out.println("É impossível a divisão por 0.");
                }
                break;
            default:
                System.out.println("Entrada inválida.");
                break;
        }
        
        if (resultado != 0) {
            System.out.println("Resultado = "+resultado+". "+Resultados(resultado));
        }
        else if (resultado == 0){
            System.out.println("Resultado = "+resultado+". O valor é neutro e inteiro.");
        }
    }
    
    public static String Resultados(double valor) {
        String result = "";
        
        if ((int) valor % 2 == 0){
            if (valor > 0) {
                if (Math.ceil(valor) == valor) {
                    result = "O resultado é par, positivo e inteiro.";
                }
                else {
                    result = "O resultado é par, positivo e decimal.";
                }
            }
            else {
                if (Math.ceil(valor) == valor) {
                    result = "O resultado é par, negativo e inteiro.";
                }
                else {
                    result = "O resultado é par, negativo e decimal.";
                }
            }
        }
        else {
            if (valor > 0) {
                if (Math.ceil(valor) == valor) {
                    result = "O resultado é ímpar, positivo e inteiro.";
                }
                else {
                    result = "O resultado é ímpar, positivo e decimal.";
                }
            }
            else {
                if (Math.ceil(valor) == valor) {
                    result = "O resultado é ímpar, negativo e inteiro.";
                }
                else {
                    result = "O resultado é ímpar, negativo e decimal.";
                }
            }
        }
        
        return result;
    }
}
