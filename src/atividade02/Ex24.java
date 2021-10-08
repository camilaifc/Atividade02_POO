package atividade02;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Ex24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira a primeira nota: ");
        double n1 = sc.nextDouble();
        System.out.println("Insira a segunda nota: ");
        double n2 = sc.nextDouble();
        System.out.println("Insira a terceira nota: ");
        double n3 = sc.nextDouble();
        
        double media = (n1 + n2 + n3)/3;
        
        if(media == 10) {
            System.out.println("Aprovado com distinção.");
        }
        else if(media >= 7) {
            System.out.printf("Aprovado. Média = %.1f",media);
        }
        else {
            System.out.printf("Reprovado. Média = %.1f",media);
        }
    }
}
