package atividade02;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Digite um ano com quatro dígitos: ");
        int ano = sc.nextInt();

        if ((ano % 4) == 0) {
            System.out.println("O ano inserido é bissexto.");
        }
        else {
            System.out.println("O ano inserido não é bissexto.");
        }
    }
}
