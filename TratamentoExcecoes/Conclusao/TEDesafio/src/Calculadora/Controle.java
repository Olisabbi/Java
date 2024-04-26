
package Calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Controle {
    public static void main(String [] args){
        String op;
        Calculadora c = new Calculadora();
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite uma das quatro operações básicas da matemática. Exemplo (+),(-), (/), (*) ");
        op = entrada.next();
        
        switch(op){
        case "+" : 
        try{
            double n1;
            double n2;
            
            System.out.println("Digite o primeiro numero");
            n1 = entrada.nextDouble();
            System.out.println("Digite o segundo número");
            n2 = entrada.nextDouble();            
            c.adicao(n1, n2);
            
        }catch(InputMismatchException e){
        
            System.out.println("Digite um número decimal exemplo: 12,50 ou 10");
        }
        
        break;
            
        case "-":
       try{
            double n1;
            double n2;
            
            System.out.println("Digite o primeiro numero");
            n1 = entrada.nextDouble();
            System.out.println("Digite o segundo número");
            n2 = entrada.nextDouble();            
            c.subtracao(n1, n2);
            
        }catch(InputMismatchException e){
        
            System.out.println("Digite um número decimal exemplo: 12,50 ou 10");
        }
        
        break;
            
        case "*":
        try{
            double n1;
            double n2;
            
            System.out.println("Digite o primeiro numero");
            n1 = entrada.nextDouble();
            System.out.println("Digite o segundo número");
            n2 = entrada.nextDouble();            
            c.multiplicacao(n1, n2);
            
        } catch(InputMismatchException e){
        
            System.out.println("Digite um número decimal exemplo: 12,50 ou 10");
        }
        break;
            
        case "/":
            
           try{
            double n1;
            double n2;
            
            System.out.println("Digite o primeiro numero");
            n1 = entrada.nextDouble();
            System.out.println("Digite o segundo número");
            n2 = entrada.nextDouble();            
            c.divisao(n1, n2);
            
        }
            catch(InputMismatchException error){
        
            System.out.println("Digite um número decimal exemplo: 12,50 ou 10" + error);
        }
        
        break;
            
            
        default :
            System.out.println("Digite uma opção válida");
    } 
    
}
}