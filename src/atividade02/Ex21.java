package atividade02;

import static java.lang.Integer.parseInt;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Ex21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe uma data no formato dd-mm-aaaa");
        String entrada = sc.next();
        
        entrada = entrada.replace("-", "");
        
        if(entrada.length() == 8){
            try {
                String anoStr = entrada.substring(4,8);
                if (anoStr.length() == 4) {
                    int ano = parseInt(entrada.substring(4,8));
                    try {
                        String mesStr = entrada.substring(2,4);
                        if(mesStr.length() == 2) {
                            int mes = parseInt(entrada.substring(2,4));
                            try {
                                String diaStr = entrada.substring(0,2);
                                if(diaStr.length() == 2) {
                                    int dia = parseInt(entrada.substring(0,2));
                                    if (mes >= 1 && mes <= 12) {
                                        if (mes == 2 && (ano % 4 == 0)) {
                                            if(dia >= 1 && dia <= 29) {
                                                System.out.println("A data informada é válida.");
                                            }
                                            else {
                                                System.out.println("A data informada é inválida.");
                                            }
                                        }
                                        else if(mes == 2 && (ano % 4 != 0)) {
                                            if (dia >= 1 && dia <= 28) {
                                                System.out.println("A data informada é válida.");
                                            }
                                            else {
                                                System.out.println("A data informada é inválida.");
                                            }
                                        }
                                        else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                                            if (dia >= 1 && dia <= 30) {
                                                System.out.println("A data informada é válida.");
                                            }
                                            else {
                                                System.out.println("A data informada é inválida.");
                                            } 
                                        }
                                        else {
                                            if (dia >= 1 && dia <= 31) {
                                                System.out.println("A data informada é válida.");
                                            }
                                            else {
                                                System.out.println("A data informada é inválida.");
                                            } 
                                        }
                                    }
                                }
                                else {
                                    System.out.println("A data informada é inválida.");
                                }
                            }
                            catch (RuntimeException e) {
                                System.out.println("A data informada é inválida.");
                            }
                        }
                        else {
                            System.out.println("A data informada é inválida.");
                        }
                    }
                    catch (RuntimeException e) {
                        System.out.println("A data informada é inválida.");
                    }
                }
                else {
                    System.out.println("A data informada é inválida.");
                }
            }
            catch (RuntimeException e) {
                System.out.println("A data informada é inválida.");
            }
        }
        else {
            System.out.println("A data informada é inválida.");
        }
    }
}
