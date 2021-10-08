package atividade02;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Ex23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int soma = 0;
        int[] idade = new int[3];
        
        for(int i = 0; i < 3; i++){
            System.out.printf("Informe a idade do %dº aluno: ",(i+1));
            idade[i] = sc.nextInt();
            soma += idade[i];
        }
        
        int media = soma / 3;
        
        if (media < 25) {
            System.out.println("Turma jovem.");
        }
        else if (media <= 40) {
            System.out.println("Turma adulta.");
        }
        else {
            System.out.println("Turma idosa.");
        }
    }
}
