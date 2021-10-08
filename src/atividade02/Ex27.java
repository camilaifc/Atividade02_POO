package atividade02;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Ex27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        double numero = sc.nextDouble();
        
        if (Math.ceil(numero) == numero ) {
            System.out.println("O número é inteiro.");
        }
        else {
            System.out.println("O número é decimal.");
        }
    }
}
