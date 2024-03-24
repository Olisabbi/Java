package AtributosMetodosFinais;

import javax.swing.JOptionPane;

public class CalculoMarkupeController {

    private CalculoMarkupe calculoMarkupe;

    public CalculoMarkupeController() {
        this.calculoMarkupe = new CalculoMarkupe();
    }

    public void solicitarPreco() {
        String precoP = JOptionPane.showInputDialog("Digite o preço do produto:");
        double preco = Double.parseDouble(precoP);
        this.calculoMarkupe.setPreco(preco);

        String compraP = JOptionPane.showInputDialog("Digite o Valor da Compra:");
        double compra = Double.parseDouble(compraP);
        this.calculoMarkupe.setCompra(compra);

        double resultado = this.calculoMarkupe.calculaMarkup();

        JOptionPane.showMessageDialog(null, "O preço final do produto é: " + resultado);
    }

    public static void main(String[] args) {
        CalculoMarkupeController controller = new CalculoMarkupeController();
        controller.solicitarPreco();
    }
}
