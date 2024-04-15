
package calculadora;

public class Controle {
    public static void main(String [] args){
    
    Calculadora.Soma s = new Calculadora().new Soma();
    Calculadora.Divide d = new Calculadora().new Divide();
    Calculadora.Multiplica m = new Calculadora().new Multiplica();
    Calculadora.Subtrai sb = new Calculadora().new Subtrai();
    
    s.soma(2, 3);
    d.divide(2, 3);
    m.multiplica(2, 3);
    sb.subtrai(2, 3);
    
    
    
 
}
}