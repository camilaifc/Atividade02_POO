package atividade02;

import java.util.Scanner;
/**
 *
 * @author Camila
 */
public class Ex01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Digite um número inteiro: ");
        int n1 = sc.nextInt();
        System.out.println("Digite outro número inteiro: ");
        int n2 = sc.nextInt();
        
        if (n1 > n2 ) {
            System.out.println("Maior número: "+n1);
        } else {
            System.out.println("Maior número: "+n2);
        }
        
    }
    
}
