package atividade02;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o valor de A: ");
        int a = sc.nextInt();
        double x1 = 0;
        double x2 = 0;
        
        if (a != 0) {
            System.out.println("Informe o valor de B: ");
            int b = sc.nextInt();
            System.out.println("Informe o valor de C: ");
            int c = sc.nextInt();
            
            int delta = (int) Math.pow(b,2) - 4*(a*c);
            
            if (delta < 0) {
                System.out.println("A equação não possui raízes reais.");
            }
            else if (delta == 0) {
                x1 = (-b + Math.sqrt(delta))/(2*a);
                System.out.printf("A equação possui apenas uma raíz real: %.2f",x1);
            }
            else {
                x1 = (-b + Math.sqrt(delta))/(2*a);
                x2 = (-b - Math.sqrt(delta))/(2*a);
                System.out.printf("A equação possui duas raízes reais: %.2f e %.2f",x1,x2);
            }
        }
    }
}
