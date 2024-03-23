package EncapsulamentoeModificadoresdeAcesso;


public class CalculaVolume {
    private double base;
    private double altura;
    private double comprimento;

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double calcularVolume() {
        return base * altura * comprimento;
    }
}
