package ClassesAninhadas;

public class Calcula {
    int a = 0;
    int b = 0;

    public class Soma {
        public int calcular() {
            return a + b;
        }
    }

    public class Subtracao {
        public int calcular() {
            return a - b;
        }
    }

    public class Multiplicacao {
        public int calcular() {
            return a * b;
        }
    }

    public class Divisao {
        public int calcular() {
            if (b == 0) {
                throw new IllegalArgumentException("Divisor não pode ser zero");
            }
            return a / b;
        }
    }
}
