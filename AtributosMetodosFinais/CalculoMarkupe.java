package AtributosMetodosFinais;

import javax.swing.JOptionPane;

public class CalculoMarkupe {
    

    
    private final double MARKUP = 1.54;
    private double precoCompra;
    private double precoVenda;
    
    
    public final void calculaPreco(double precoCompra){
    
        this.precoCompra = precoCompra;
        
        precoVenda = MARKUP * precoCompra;
        
        JOptionPane.showMessageDialog(null, "Preço sugerido de venda R$ " + precoVenda);
    
    
    }   
}
