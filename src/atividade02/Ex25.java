package atividade02;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Ex25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o valor do saque (mín: R$ 10; máx: R$ 600): ");
        double saque = sc.nextDouble();
        
        if(saque >= 10 && saque <= 600) {
            int centenas = (int) saque / 100;
            int dezenas = (int) (saque % 100)/10;
            int unidades = (int) saque % 10;
            int cinquenta = (int) (saque % 100)/50;
            int dez = (int) ((saque % 100) - cinquenta*50)/10;
            int cinco = (int) (saque % 10)/5;
            int um = (int) (saque % 10) - cinco*5;
            
            if (centenas != 0) {
                if(dezenas != 0) {
                    if(unidades != 0) {
                        if (cinquenta != 0) {
                            if (dez != 0) {
                                if(cinco != 0){
                                    if(um != 0) {
                                        System.out.println(centenas+" notas de 100, "+cinquenta+" notas de 50, "
                                        +dez+" notas de 10, "+cinco+" notas de 5 e "+um+" notas de 1.");
                                    }
                                    else {
                                        System.out.println(centenas+" notas de 100, "+cinquenta+" notas de 50, "
                                        +dez+" notas de 10, "+cinco+" notas de 5.");
                                    }
                                }
                                else {
                                    System.out.println(centenas+" notas de 100, "+cinquenta+" notas de 50, "
                                    +dez+" notas de 10 e "+um+" notas de 1.");
                                }
                            }
                            else {
                                if(cinco != 0) {
                                    if(um != 0) {
                                        System.out.println(centenas+" notas de 100, "+cinquenta+" notas de 50, "
                                        +cinco+" notas de 5 e "+um+" notas de 1.");
                                    }
                                    else {
                                        System.out.println(centenas+" notas de 100, "+cinquenta+" notas de 50 e "
                                        +cinco+" notas de 5.");
                                    }
                                }
                                else {
                                    System.out.println(centenas+" notas de 100, "+cinquenta+" notas de 50 e "
                                    +um+" notas de 1.");
                                }
                            }
                        }
                        else {
                            if(cinco != 0) {
                                if(um != 0) {
                                    System.out.println(centenas+" notas de 100, "+dez+" notas de 10, "
                                    +cinco+" notas de 5 e "+um+" notas de 1.");
                                }
                                else {
                                    System.out.println(centenas+" notas de 100, "+dez+" notas de 10 e"
                                    +cinco+" notas de 5.");
                                }
                            }
                            else {
                                System.out.println(centenas+" notas de 100, "+dez+" notas de 10 e "
                                +um+" notas de 1.");
                            }
                        }
                    }
                    else {
                        if (cinquenta != 0) {
                            if (dez != 0) {
                                System.out.println(centenas+" notas de 100, "+cinquenta+" notas de 50 e "
                                +dez+" notas de 10.");
                            }
                            else {
                                System.out.println(centenas+" notas de 100 e "+cinquenta+" notas de 50.");
                            }
                        }
                        else {
                            System.out.println(centenas+" notas de 100 e "+dez+" notas de 10.");
                        }
                    }
                }
                else {
                    if (unidades != 0) {
                        if(cinco != 0){
                            if(um != 0) {
                                System.out.println(centenas+" notas de 100, "+cinco+" notas de 5 e "
                                +um+" notas de 1.");
                            }
                            else {
                                System.out.println(centenas+" notas de 100 e "+cinco+" notas de 5.");
                            }
                        }
                        else {
                            System.out.println(centenas+" notas de 100 e "+um+" notas de 1.");
                        }
                    }
                    else {
                        System.out.println(centenas+" notas de 100.");
                    }
                }
            }
            else {
                if(dezenas != 0) {
                    if(unidades != 0) {
                        if (cinquenta != 0) {
                            if (dez != 0) {
                                if(cinco != 0){
                                    if(um != 0) {
                                        System.out.println(cinquenta+" notas de 50, "+dez+
                                        " notas de 10, "+cinco+" notas de 5 e "+um+" notas de 1.");
                                    }
                                    else {
                                        System.out.println(cinquenta+" notas de 50, "
                                        +dez+" notas de 10, "+cinco+" notas de 5.");
                                    }
                                }
                                else {
                                    System.out.println(cinquenta+" notas de 50, "
                                    +dez+" notas de 10 e "+um+" notas de 1.");
                                }
                            }
                            else {
                                if(cinco != 0) {
                                    if(um != 0) {
                                        System.out.println(cinquenta+" notas de 50, "
                                        +cinco+" notas de 5 e "+um+" notas de 1.");
                                    }
                                    else {
                                        System.out.println(cinquenta+" notas de 50 e "
                                        +cinco+" notas de 5.");
                                    }
                                }
                                else {
                                    System.out.println(cinquenta+" notas de 50 e "
                                    +um+" notas de 1.");
                                }
                            }
                        }
                        else {
                            if(cinco != 0) {
                                if(um != 0) {
                                    System.out.println(dez+" notas de 10, "
                                    +cinco+" notas de 5 e "+um+" notas de 1.");
                                }
                                else {
                                    System.out.println(dez+" notas de 10 e"
                                    +cinco+" notas de 5.");
                                }
                            }
                            else {
                                System.out.println(dez+" notas de 10 e "
                                +um+" notas de 1.");
                            }
                        }
                    }
                    else {
                        if (cinquenta != 0) {
                            if (dez != 0) {
                                System.out.println(cinquenta+" notas de 50 e "
                                +dez+" notas de 10.");
                            }
                            else {
                                System.out.println(cinquenta+" notas de 50.");
                            }
                        }
                        else {
                            System.out.println(dez+" notas de 10.");
                        }
                    }
                }
            }
        }
        else {
            System.out.println("Valor fora do permitido.");
        }
    }
}
