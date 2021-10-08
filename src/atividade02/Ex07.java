package atividade02;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numero = new int[3];
        
        for(int i = 0; i < 3; i++) {
            System.out.printf("Digite o %dº número inteiro: %n",(i+1));
            numero[i] = sc.nextInt();
        }
        
        if (numero[0] > numero[1]) {
            if(numero[2] > numero[0]) {
                System.out.printf("Ordem decrescente: %d %d %d",numero[2],numero[0],numero[1]);
            }
            else if(numero[1] > numero[2]) {
                System.out.printf("Ordem decrescente: %d %d %d",numero[0],numero[1],numero[2]);
            }
            else {
                System.out.printf("Ordem decrescente: %d %d %d",numero[0],numero[2],numero[1]);
            }
        }
        else{
            if(numero[1] > numero[0]) {
                if(numero[2] > numero[1]) {
                    System.out.printf("Ordem decrescente: %d %d %d",numero[2],numero[1],numero[0]);
                }
                else if(numero[0] > numero[2]) {
                    System.out.printf("Ordem decrescente: %d %d %d",numero[1],numero[0],numero[2]);
                }
                else {
                    System.out.printf("Ordem decrescente: %d %d %d",numero[1],numero[2],numero[0]);
                }
            }
        }
    }
}
