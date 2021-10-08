package atividade02;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Ex33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char[] resposta = new char[10];
        
        for(int i = 0; i <= 9; i++) {
            System.out.printf("Informe a %dª resposta: %n",(i+1));
            resposta[i] = sc.next().toLowerCase().charAt(0);
        }
        
        int resultado = 0;
        
        for(int j = 0; j < resposta.length; j++) {
            if (j <= 1)
            {
                if (resposta[j] == 'a') {
                    System.out.printf("Q%d : %s : Correto%n",(j+1),resposta[j]);  
                    resultado += 1;
                } else {
                    System.out.printf("Q%d : %s : Errada, resposta correta (a)%n",(j+1),resposta[j]);
                }
            } else if (j <= 3) {
                if (resposta[j] == 'b') {
                    System.out.printf("Q%d : %s : Correto%n",(j+1),resposta[j]);  
                    resultado += 1;
                } else {
                    System.out.printf("Q%d : %s : Errada, resposta correta (b)%n",(j+1),resposta[j]);
                }
            } else if (j <= 5) {
                if (resposta[j] == 'c') {
                    System.out.printf("Q%d : %s : Correto%n",(j+1),resposta[j]);  
                    resultado += 1;
                } else {
                    System.out.printf("Q%d : %s : Errada, resposta correta (c)%n",(j+1),resposta[j]);
                }
            } else if (j <= 7) {
                if (resposta[j] == 'd') {
                    System.out.printf("Q%d : %s : Correto%n",(j+1),resposta[j]); 
                    resultado += 1;
                } else {
                    System.out.printf("Q%d : %s : Errada, resposta correta (d)%n",(j+1),resposta[j]);
                }
            } else {
                if (resposta[j] == 'e') {
                    System.out.printf("Q%d : %s : Correto%n",(j+1),resposta[j]);  
                    resultado += 1;
                } else {
                    System.out.printf("Q%d : %s : Errada, resposta correta (e)%n",(j+1),resposta[j]);
                }
            }
        }
        
        System.out.println("Pontuação final: "+resultado);
    }
}
