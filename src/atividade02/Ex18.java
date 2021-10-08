package atividade02;

import java.util.Scanner;
/**
 *
 * @author Camila
 */
public class Ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o primeiro lado do triângulo: ");
        double a = sc.nextDouble();
        System.out.println("Informe o segundo lado do triângulo: ");
        double b = sc.nextDouble();
        System.out.println("Informe o terceiro lado do triângulo: ");
        double c = sc.nextDouble();
        
        if((a < (b + c)) || (b < (a + c)) || (c < (a + b))) {
            System.out.println("Os valores informados podem formar um triângulo.");
            if (a == b && b == c){
                System.out.println("O triângulo formado é equilátero.");
            }
            else if (a == b || a == c || b == c) {
                System.out.println("O triângulo formado é isósceles.");
            }
            else {
                System.out.println("O triângulo formado é escaleno.");
            }
        }
        else {
            System.out.println("Os valores informados não podem formar um triângulo.");
        }
    }
}
