package atividade02;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite uma letra: ");
        char letra = sc.next().toLowerCase().charAt(0);
        
        switch (letra) {
            case 'a':
                System.out.println("A letra digitada é uma vogal.");
                break;
            case 'e':
                System.out.println("A letra digitada é uma vogal.");
                break;
            case 'i':
                System.out.println("A letra digitada é uma vogal.");
                break;
            case 'o':
                System.out.println("A letra digitada é uma vogal.");
                break;
            case 'u':
                System.out.println("A letra digitada é uma vogal.");
                break;
            default:
                System.out.println("A letra digitada não é uma vogal.");
        }
    }
}
