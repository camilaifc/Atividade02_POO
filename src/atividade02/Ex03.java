package atividade02;

import java.util.Scanner;
/**
 *
 * @author Camila
 */
public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite 'F' ou 'M': ");
        char response = sc.next().toUpperCase().charAt(0);
        
        switch (response) {
            case 'F':
                System.out.println("F - Feminino");
                break;
            case 'M':
                System.out.println("M - Masculino");
                break;
            default:
                System.out.println("A letra digitada não é válida.");
                break;
        }
    }
}
