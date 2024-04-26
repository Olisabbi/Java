package TratamentoExcecoes.Calaculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){

        float n1;
        float n2;
        float resultado;
        String operacao;

        Scanner entrada = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro numero: ");
            n1 = entrada.nextFloat();
            entrada.nextLine();  // Consumir o '\n' restante

            System.out.println("Digite o segundo numero: ");
            n2 = entrada.nextFloat();
            entrada.nextLine();  // Consumir o '\n' restante

            System.out.println("Digite a operação desejada ( ( + )  ( - )  ( * )  ( / ) ) ");
            operacao = entrada.nextLine();

            switch (operacao) {
                case "+":
                    resultado = n1 + n2;
                    System.out.println(resultado);
                    break;
                case "-":
                    resultado = n1 - n2;
                    System.out.println(resultado);
                    break;
                case "*":
                    resultado = n1 * n2;
                    System.out.println(resultado);
                    break;
                case "/":
                    try {
                        resultado = n1 / n2;
                        System.out.println(resultado);
                    } catch (ArithmeticException e) {
                        System.out.println("Erro: Divisão por zero não é permitida.");
                    }
                    break;
                default:
                    System.out.println("Operação não reconhecida.");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Erro: Entrada inválida.");
        } finally {
            entrada.close();
        }
    }
}
