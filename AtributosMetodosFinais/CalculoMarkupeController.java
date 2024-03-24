package AtributosMetodosFinais;


import javax.swing.JOptionPane;


public class CalculoMarkupeController {
    public static void main(String [] args){
    
        CalculoMarkupe mk = new CalculoMarkupe();
        mk.calculaPreco(Double.parseDouble(JOptionPane.showInputDialog("Insira o preço de compra do produto")));
    
    
    }
}