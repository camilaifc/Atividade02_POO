package atividade02;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro: ");
        int numero = sc.nextInt();
        
        if ((numero % 2) == 0) {
            System.out.printf("Número %d para ímpar: %d.",numero,(numero+1));
        } else {
            System.out.printf("Número %d para par: %d.",numero,(numero+1));
        }
    }
}
