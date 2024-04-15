package calculadora;

public class Calculadora {

    private double num1;
    private double num2;
    


    class Soma {
        
        public void soma(int n1, int n2) {
            num1 = n1;
            num2 = n2;
            
            double result = num1 + num2;
            System.out.println("O resultado é: " + result);
        }
    }

    class Subtrai {

        public void subtrai(int n1, int n2) {
            num1 = n1;
            num2 = n2;
            
          double result = num1 - num2;
            System.out.println("O resultado é: " + result);
        }
    }
    
    class Multiplica {

        public void multiplica(int n1, int n2) {
            num1 = n1;
            num2 = n2;
            
            double result = num1 * num2;
            System.out.println("O resultado é: " + result);
        }
    }
    
    class Divide {

        public void divide(int n1, int n2) {
            num1 = n1;
            num2 = n2;
            
            double result = num1 / num2;
            System.out.println("O resultado é: " + result);
        }
    }
}
