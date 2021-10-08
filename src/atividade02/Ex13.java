package atividade02;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe quantas horas você trabalhou no mês: ");
        double horas = sc.nextDouble();
        System.out.println("Informe o valor pago por hora: ");
        double valor = sc.nextDouble();
        
        double bruto = horas * valor;
        double ir = 0;
        
        System.out.printf("Salário bruto: %.2f * %.2f: R$ %.2f%n",horas,valor,bruto);
        
        if(bruto <= 900) {
            ir = 0;
            System.out.println("(-)IR (isento): R$ 0");
        }
        else if (bruto <= 1500) {
            ir = bruto*0.05;
            System.out.printf("(-)IR (5%%): R$ %.2f%n",ir);
        }
        else if (bruto <= 2500) {
            ir = bruto*0.1;
            System.out.printf("(-)IR (10%%): R$ %.2f%n",ir);
        }
        else {
            ir = bruto*0.2;
            System.out.printf("(-)IR (20%%): R$ %.2f%n",ir);
        }
        
        double inss = bruto*0.1;
        System.out.printf("(-)INSS (10%%): R$ %.2f%n",inss);
        double sindicato = bruto*0.03;
        System.out.printf("(-)Sindicato (3%%): R$ %.2f%n",sindicato);
        double fgts = bruto*0.11;
        System.out.printf("FGTS (11%%): R$ %.2f%n",fgts);
        
        double totald = ir + inss + sindicato;
        System.out.printf("Total de descontos: R$ %.2f%n",totald);
        
        double liquido = bruto - totald;
        System.out.printf("Salário líquido: R$ %.2f%n",liquido);
    }
}
