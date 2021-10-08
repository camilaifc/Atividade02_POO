package atividade02;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota: ");
        double n1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double n2 = sc.nextDouble();
        
        double parcial = (n1 + n2)/2;
        
        if (parcial > 9) {
            System.out.println("A");
        } 
        else if(parcial > 7.5) {
            System.out.println("B");
        }
        else if(parcial > 6) {
            System.out.println("C");
        }
        else if(parcial > 4) {
            System.out.println("D");
        }
        else {
            System.out.println("E");
        }
    }
}
