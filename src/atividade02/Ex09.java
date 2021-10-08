package atividade02;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite sua altura: ");
        double altura = sc.nextDouble();
        System.out.println("Digite seu peso: ");
        double peso = sc.nextDouble();
        System.out.println("Informe seu sexo (F ou M): ");
        char sexo = sc.next().toUpperCase().charAt(0);
        
        System.out.printf("Altura: %.2f; Peso: %.2f; Sexo: %c.%n",altura,peso,sexo);
        
        switch (sexo) {
            case 'F':
                double mulher = (62.1*altura) - 44.7;
                System.out.printf("Peso ideal: %.2f.%n",mulher);
                if(peso < mulher) {
                    System.out.println("Você está abaixo do peso ideal.");
                }
                else if(peso == mulher) {
                    System.out.println("Você está no peso ideal.");
                }
                else {
                    System.out.println("Você está acima do peso ideal");
                }   
                break;
            case 'M':
                double homem = (72.7*altura) - 58;
                System.out.printf("Peso ideal: %.2f.%n", homem);
                if (peso > homem) {
                    System.out.println("Você está acima do peso ideal");
                }
                else if (peso == homem) {
                    System.out.println("Você está no peso ideal.");
                }
                else {
                    System.out.println("Você está abaixo do peso ideal.");
                }
                break;
            default:
                System.out.println("O sexo informado não é válido.");
                break;
        }
    }
}
