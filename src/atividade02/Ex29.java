package atividade02;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Ex29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        String[] q = new String[5];
        
        System.out.println("Telefonou para a vítima? ");
        q[0] = sc.next().toLowerCase();
        System.out.println("Esteve no local do crime? ");
        q[1] = sc.next().toLowerCase();
        System.out.println("Mora perto da vítima? ");
        q[2] = sc.next().toLowerCase();
        System.out.println("Devia para a vítima? ");
        q[3] = sc.next().toLowerCase();
        System.out.println("Já trabalhou com a vítima? ");
        q[4] = sc.next().toLowerCase();
        
        int count = 0;
        
        for(int i = 0; i < 5; i++){
            if("sim".equals(q[i])) {
                count += 1;
            }
        }
        
        if(count < 2) {
            System.out.println("Inocente.");
        }
        else if(count == 2) {
            System.out.println("Suspeita.");
        }
        else if(count <= 4) {
            System.out.println("Cúmplice.");
        } else {
            System.out.println("Culpado.");
        }
    }
}
