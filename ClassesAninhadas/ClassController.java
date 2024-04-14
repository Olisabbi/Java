package ClassesAninhadas;

import java.util.Scanner;

public class ClassController {
    private Calcula calcula;
    private Scanner scanner;

    public ClassController() {
        this.calcula = new Calcula();
        this.scanner = new Scanner(System.in);
    }

    public void executarOperacao() {
        System.out.println("Digite o primeiro número:");
        calcula.a = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        calcula.b = scanner.nextInt();

        System.out.println("Digite a operação ( ( + )  ( - )  ( * )  ( / ) ):");
        String operacao = scanner.next();

        switch (operacao) {
            case "+":
                Calcula.Soma soma = calcula.new Soma();
                System.out.println("Resultado da soma: " + soma.calcular());
                break;
            case "-":
                Calcula.Subtracao subtracao = calcula.new Subtracao();
                System.out.println("Resultado da subtração: " + subtracao.calcular());
                break;
            case "*":
                Calcula.Multiplicacao multiplicacao = calcula.new Multiplicacao();
                System.out.println("Resultado da multiplicação: " + multiplicacao.calcular());
                break;
            case "/":
                Calcula.Divisao divisao = calcula.new Divisao();
                System.out.println("Resultado da divisão: " + divisao.calcular());
                break;
            default:
                throw new IllegalArgumentException("Operação desconhecida: " + operacao);
        }
    }

    public static void main(String[] args) {
        ClassController controle = new ClassController();
        controle.executarOperacao();
    }
}





