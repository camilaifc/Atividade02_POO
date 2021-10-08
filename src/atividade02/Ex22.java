package atividade02;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Ex22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira um número inteiro menor que 1000: ");
        int numero = sc.nextInt();
        int centenas = numero / 100;
        int dezenas = (numero % 100) / 10;
        int unidades = numero % 10;
        
        if (centenas != 0) {
            if(dezenas != 0 && unidades != 0) {
                System.out.println("Centenas: "+centenas+"; Dezenas: "+dezenas+"; Unidades: "+unidades);
            }
            else if(dezenas != 0 && unidades == 0) {
                System.out.println("Centenas: "+centenas+"; Dezenas: "+dezenas);
            }
            else if(dezenas == 0 && unidades != 0) {
                System.out.println("Centenas: "+centenas+"; Unidades: "+unidades);
            }
            else {
                System.out.println("Centenas: "+centenas);
            }
        }
        else {
            if(dezenas != 0 && unidades != 0) {
                System.out.println("Dezenas: "+dezenas+"; Unidades: "+unidades);
            }
            else if(dezenas != 0 && unidades == 0) {
                System.out.println("Dezenas: "+dezenas);
            }
            else if(dezenas == 0 && unidades != 0) {
                System.out.println("Unidades: "+unidades);
            }
            else {
                System.out.println("Não há centenas, dezenas ou unidades.");
            }
        }
    }
}
