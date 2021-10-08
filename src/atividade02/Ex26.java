package atividade02;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Ex26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro: ");
        int numero = sc.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println("O número inserido é par.");
        }
        else {
            System.out.println("O número inserido é ímpar.");
        }
    }
}
