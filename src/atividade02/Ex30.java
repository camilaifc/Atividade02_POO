package atividade02;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Ex30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Informe os litros vendidos: ");
        double litros = sc.nextDouble();
        System.out.println("Informe o tipo de combustível (A-Álcool; G-Gasolina): ");
        char comb = sc.next().toUpperCase().charAt(0);
        
        double valor = 0;
        double total = 0;
        
        switch (comb) {
            case 'A':
                if(litros <= 20) {
                    valor = litros * 1.9 * 0.97;
                } else {
                    valor = litros * 1.9 * 0.95;
                }
                break;
            case 'G':
                if(litros <= 20) {
                    valor = litros * 2.5 * 0.96;
                } else {
                    valor = litros * 2.5 * 0.94;
                }
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
        
        System.out.printf("O valor a ser pago pelo cliente é: R$ %.2f",valor);
    }
}
