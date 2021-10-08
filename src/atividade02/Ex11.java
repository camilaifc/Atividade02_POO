package atividade02;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Ex11 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Opcoes();
        char response = sc.next().toUpperCase().charAt(0);
       
        switch (response) {
            case 'M':
                System.out.println("Bom dia!");
                break;
            case 'V':
                System.out.println("Boa tarde!");
                break;
            case 'N':
                System.out.println("Boa noite!");
                break;
            default:
                System.out.println("Entrada inválida.");
       }
   }
   public static void Opcoes() {
       System.out.println("Informe em que turno você estuda: ");
       System.out.println("M - Matutino;");
       System.out.println("V - Vespertino;");
       System.out.println("N - Noturno.");
   }
}
