package atividade02;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escolha um número: ");
        System.out.println("1 - 1988;");
        System.out.println("2 - 1999;");
        System.out.println("3 - 1992;");
        System.out.println("4 - 2001;");
        System.out.println("5 - 1996;");
        int numero = sc.nextInt();
        
        switch (numero) {
            case 1:
                System.out.println("O ano escolhido é bissexto.");
                break;
            case 2:
                System.out.println("O ano escolhido não é bissexto.");
                break;
            case 3:
                System.out.println("O ano escolhido é bissexto.");
                break;
            case 4:
                System.out.println("O ano escolhido não é bissexto.");
                break;
            case 5:
                System.out.println("O ano escolhido é bissexto.");
                break;
            default:
                System.out.println("Valor inválido.");
        }
    }
}
