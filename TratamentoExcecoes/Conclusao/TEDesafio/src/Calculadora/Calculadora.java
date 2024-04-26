
package Calculadora;

public class Calculadora {
    
    private double num1;
    private double num2;
    
    
    public void adicao(double num1, double num2){
        
        this.num1 = num1;
        this.num2 = num2;
        
        double adicao = num1 + num2;
        System.out.println("A soma é : " + adicao);   
    
    }
    
    public void subtracao(double num1, double num2){
    
        this.num1 = num1;
        this.num2 = num2;
    
        double subtracao = num1 - num2;
        System.out.println("A subtração é : " + subtracao); 
    }
    
    public void multiplicacao(double num1, double num2){
        
         this.num1 = num1;
        this.num2 = num2;
        
        double multiplicacao = num1 * num2;
        System.out.println("A multiplicação é : " + multiplicacao);   
    
    }
    
    public void divisao(double num1, double num2){
        
         this.num1 = num1;
        this.num2 = num2;
        
        double divisao = num1 / num2;
        System.out.println("A divisão é : " + divisao);   
           
    }
}