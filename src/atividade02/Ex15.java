package atividade02;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o preço de custo do produto: ");
        double preco = sc.nextDouble();
        System.out.println("Informe o código de origem: ");
        int codigo = sc.nextInt();
        
        switch (codigo) {
            case 1:
                System.out.printf("Código de origem: 1 - Sul; Preço de custo: R$ %.2f",preco);
                break;
            case 2:
                System.out.printf("Código de origem: 2 - Norte; Preço de custo: R$ %.2f",preco);
                break;
            case 3:
                System.out.printf("Código de origem: 3 - Leste; Preço de custo: R$ %.2f",preco);
                break;
            case 4:
                System.out.printf("Código de origem: 4 - Oeste; Preço de custo: R$ %.2f",preco);
                break;
            case 5: case 6:
                System.out.printf("Código de origem: 5 ou 6 - Nordeste; Preço de custo: R$ %.2f",preco);
                break;
            case 7: case 8:
                System.out.printf("Código de origem: 7 ou 8 - Centro-Oeste; Preço de custo: R$ %.2f",preco);
                break;
            default:
                System.out.printf("Origem: Importado; Preço de custo: R$ %.2f",preco);
                break;
        }
    }
}
