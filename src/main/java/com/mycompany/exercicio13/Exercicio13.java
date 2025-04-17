package com.mycompany.exercicio13;

import java.util.Scanner;


public class Exercicio13 {

    public static void main(String[] args) {
        
        Scanner n1 = new Scanner(System.in);
        System.out.print("Salário bruto: ");
        String num1 = n1.nextLine();
        
        Scanner n2 = new Scanner(System.in);
        System.out.print("Valor da prestação: ");
        String num2 = n2.nextLine();
        
        float salario = Float.parseFloat(num1);
        float prestacao = Float.parseFloat(num2);
        
        float porcentagem = (30 * salario) / 100;
                
        if(porcentagem < prestacao){
            System.out.println("Você não pode pegar esse empréstimo!");
        } else {
            System.out.println("Você pode pegar esse empréstimo!");
        }
        
            
        
    }
}
