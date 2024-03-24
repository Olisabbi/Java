package AtributosMetodosFinais;


public class CalculoMarkupe {
    
    private static final double MARKUP = 1.5;
    private double preco;
    private double compra;

    public double getMarkup() {
        return MARKUP;
    } 

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getCompra() {
        return compra;
    }

    public void setCompra(double compra) {
        this.compra = compra;
    }

    public final double calculaMarkup() {
        return MARKUP * preco * compra;
    }

   
}
