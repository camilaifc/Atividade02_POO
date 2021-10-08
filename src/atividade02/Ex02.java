package atividade02;

import java.util.Scanner;
/**
 *
 * @author Camila
 */
public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Digite um número inteiro: ");
        int numero = sc.nextInt();

        if (numero == 0) {
            System.out.println("O número digitado foi zero.");
        }
        else if (numero > 0) {
            System.out.println("O número digitado é positivo.");
        }
        else {
            System.out.println("O número digitado é negativo.");
        }
    }
}
