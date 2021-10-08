package atividade02;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número: ");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int n2 = sc.nextInt();
        System.out.println("Digite o terceiro número: ");
        int n3 = sc.nextInt();
        
        if(n1 > n2) {
            if(n3 > n1) {
                System.out.printf("Maior número: %d; Menor número: %d",n3,n2);
            }
            else if(n2 > n3) {
                System.out.printf("Maior número: %d; Menor número: %d",n1,n3);
            }
            else {
                System.out.printf("Maior número: %d; Menor número: %d",n1,n2);
            }
        }
        else {
            if(n2 > n1) {
                if(n3 > n2) {
                    System.out.printf("Maior número: %d; Menor número: %d",n3,n1);
                }
                else if(n3 > n1) {
                    System.out.printf("Maior número: %d; Menor número: %d",n2,n1);
                }
                else {
                    System.out.printf("Maior número: %d; Menor número: %d",n2,n3);

                }
            }
        }
    }
}
