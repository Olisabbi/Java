package EncapsulamentoeModificadoresdeAcesso;
import javax.swing.JOptionPane;

public class Calcula {
    public static void main(String[] args){
        CalculaVolume calculaVolume = new CalculaVolume();

        String base = JOptionPane.showInputDialog("Digite a base da viga (em metros):");
        String altura = JOptionPane.showInputDialog("Digite a altura da viga (em metros):");
        String comprimento = JOptionPane.showInputDialog("Digite o comprimento da viga (em metros):");

        double baseNum = Double.parseDouble(base);
        double alturaNum = Double.parseDouble(altura);
        double comprimentoNum = Double.parseDouble(comprimento);

        calculaVolume.setBase(baseNum);
        calculaVolume.setAltura(alturaNum);
        calculaVolume.setComprimento(comprimentoNum);

        double volume = calculaVolume.calcularVolume();

        JOptionPane.showMessageDialog(null, "O volume de concreto necessário é: " + volume + " metros cúbicos.");
    }
}