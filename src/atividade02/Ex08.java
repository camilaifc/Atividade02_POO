package atividade02;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota: ");
        double n1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double n2 = sc.nextDouble();
        
        double parcial = (n1 + n2)/2;
        
        if (parcial >= 7) {
            System.out.println("Aprovado.");
        } 
        else {
            System.out.println("Reprovado.");
        }
    }
}
