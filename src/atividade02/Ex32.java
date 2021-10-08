package atividade02;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Ex32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Informe o tipo de carne: ");
        System.out.println("1-Filé duplo");
        System.out.println("2-Alcatra");
        System.out.println("3-Picanha");
        int carne = sc.nextInt();
        System.out.println("Informe quantos kgs serão comprados: ");
        double kgs = sc.nextDouble();
        
        double preco = 0;
        
        switch(carne) {
            case 1:
                if(kgs <= 5) {
                    preco = kgs * 4.9;
                } else {
                    preco = kgs * 5.8;
                }
                break;
            case 2:
                if (kgs <= 5) {
                    preco = kgs * 5.9;
                } else {
                    preco = kgs * 6.8;
                }
                break;
            case 3:
                if (kgs <= 5) {
                    preco = kgs * 6.9;
                } else {
                    preco = kgs * 7.8;
                }
                break;
            default:
                System.out.println("Valor inválido.");
                break;
        }
        
        System.out.println("O cliente irá pagar com cartão Tabajara? (S/N)");
        char pagamento = sc.next().toUpperCase().charAt(0);
        
        double desconto = 0;
        
        System.out.println("Tipo de carne: "+carne(carne));
        System.out.printf("Preço total: R$ %.2f%n",preco);
        
        if (pagamento == 'S') {
            System.out.println("A compra será paga com cartão Tabajara.");
            desconto = preco * 0.05;
            System.out.printf("Valor do desconto: R$ %.2f%n",desconto);
        } else if (pagamento == 'N') {
            System.out.println("A compra não será paga com cartão Tabajara.");
            System.out.printf("Valor do desconto: R$ %.2f%n",desconto);
        } else {
            System.out.println("Entrada inválida. Não será aplicado desconto.");
            System.out.printf("Valor do desconto: R$ %.2f%n",desconto);
        }
        
        preco -= desconto;
        
        System.out.printf("Valor a pagar: R$ %.2f%n",preco);
    }
    
    public static String carne(int c) {
        String Carne = "";
        
        switch (c) {
            case 1:
                Carne = "Filé duplo";
                break;
            case 2:
                Carne = "Alcatra";
                break;
            case 3: 
                Carne = "Picanha";
                break;
            default:
                Carne = "Carne não encontrada.";
                break;
        }
        return Carne;
    }
}
