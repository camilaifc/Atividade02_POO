package atividade02;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe seu salário atual: ");
        double atual = sc.nextDouble();
        
        double aumento = 0;
        
        System.out.printf("Salário antes do reajuste: R$ %.2f.%n",atual);
        
        if(atual <= 280) {
            System.out.println("Percentual de aumento aplicado: 20%.");
            aumento = atual*0.2;
        } 
        else if (atual > 280 && atual <= 700) {
            System.out.println("Percentual de aumento aplicado: 15%.");
            aumento = atual*0.15;
        }
        else if (atual > 700 && atual < 1500) {
            System.out.println("Percentual de aumento aplicado: 10%.");
            aumento = atual*0.1;
        }
        else {
            System.out.println("Percentual de aumento aplicado: 5%.");
            aumento = atual*0.05;
        }
        
        System.out.printf("Valor do aumento: R$ %.2f.%n",aumento);
        System.out.printf("Salário após aumento: R$ %.2f.%n",(aumento+atual));
        
    }
}
