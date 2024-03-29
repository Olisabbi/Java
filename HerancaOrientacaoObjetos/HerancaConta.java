package HerancaOrientacaoObjetos;

public class HerancaConta {

    protected static int proximoId = 1;
    protected int numeroConta;
    protected double saldo;
    protected boolean especial; // Atributo para verificar se o correntista é especial
    protected double limite;
    protected double movimentacoes;
    protected double tarifas;

    // Construtor
    public HerancaConta(int numeroConta, double saldoInicial, boolean especial) {
        this.numeroConta = proximoId;
        this.saldo = saldoInicial;
        this.especial = especial; // Inicializa o atributo especial
        this.limite = 100000; // Definir limite conforme regra de negócio
        this.movimentacoes = 0;
        this.tarifas = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    // Método para calcular a taxa de operação com base no status do correntista
    protected double calcularTaxa(double quantia) {
        if (especial) {
            return quantia * 0.001; // Taxa reduzida de 0,1% para correntistas especiais
        } else {
            return quantia * 0.005; // Taxa padrão de 0,5% para correntistas normais
        }
    }

    // Outros métodos (depositar, sacar, getSaldo) permanecem os mesmos

    // Classe para representar um correntista
    public static class Correntista extends HerancaConta {

        public String nome;
        public int cpf;
        public int id;

        // Construtor da classe Correntista
        public Correntista(int numeroConta, double saldoInicial, boolean especial, String nome, int cpf, int id) {
            super(numeroConta, saldoInicial, especial); // Chama o construtor da classe pai com o status especial
            this.nome = nome;
            this.cpf = cpf;
            this.id = id;
        }
    }

        // Método para sacar uma quantia da conta
    public boolean sacar(double quantia) {
        double taxa = calcularTaxa(quantia);
        if (quantia > 0 && (saldo - quantia - taxa) >= 0) {
            saldo -= (quantia + taxa); // Subtrai a quantia e a taxa do saldo
            tarifas += taxa; // Adiciona a taxa ao objeto tarifas
            movimentacoes++;
            return true;
    }
            return false;
}


}

