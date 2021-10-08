package atividade02;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Ex31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe a quantidade de morango comprados (kgs): ");
        double morango = sc.nextDouble();
        System.out.println("Informe a quantidade de maçã comprada (kgs): ");
        double maca = sc.nextDouble();
        
        double valorMorango = 0;
        double valorMaca = 0;
        
        if (morango <= 5) {
            valorMorango = morango * 2.5;
        } else {
            valorMorango = morango * 2.2;
        }
        
        if (maca <= 5) {
            valorMaca = maca * 1.8;
        } else {
            valorMaca = maca * 1.5;
        }
        
        double kgs = morango + maca;
        double total = valorMaca + valorMorango;
        
        if(kgs > 8 || total > 25) {
            total *= 0.9;
        }
        
        System.out.printf("O valor a ser pago será: R$ %.2f",total);
    }
}
