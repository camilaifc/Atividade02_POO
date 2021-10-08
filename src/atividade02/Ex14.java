package atividade02;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número de 1 a 7: ");
        int numero = sc.nextInt();
        
        switch (numero) {
            case 1:
               System.out.println("1 - Domingo."); 
               break;
            case 2:
               System.out.println("2 - Segunda."); 
               break;
            case 3:
               System.out.println("3 - Terça.");
               break;
            case 4:
               System.out.println("4 - Quarta");
               break;
            case 5:
               System.out.println("5 - Quinta.");
               break;
            case 6:
               System.out.println("6 - Sexta.");
               break;
            case 7:
               System.out.println("7 - Sábado.");
               break;
            default:
               System.out.println("Valor inválido.");
        }
    }
}
