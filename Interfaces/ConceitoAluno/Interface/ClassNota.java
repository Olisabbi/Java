package Interfaces.ConceitoAluno.Interface;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ClassNota implements InterfaceNota{

    float nota;

    public ClassNota (){};

    @Override
    public void notaExame(float exame) {
        JOptionPane.showMessageDialog(null, "Você não atingiu o mínimo esperado para aprovação");} 
    @Override
    public void notaBoa(float boa) {
        JOptionPane.showMessageDialog(null, "Parabéns, você obteve aproveitamento satisfatório nos indicadores de avaliação:");
    }
    @Override
    public void notaMaxima(float maxima) {
        JOptionPane.showMessageDialog(null, "Parabéns, você atingiu todos os indicadores de avaliação com excelência;");
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        boolean menu = true;
        ClassNota classNota = new ClassNota();
    
        while (menu) {
    
            String notaString = JOptionPane.showInputDialog("Digite a sua nota:");
            float nota = Float.parseFloat(notaString);
    
            if (nota < 5.0) {
                classNota.notaExame(nota);
            } else if (nota < 9.0) {
                classNota.notaBoa(nota);
            } else {
                classNota.notaMaxima(nota);
            }
            
            String resposta = JOptionPane.showInputDialog("Deseja inserir uma nova nota? s/n:");
            if (resposta.equalsIgnoreCase("n")) {
                menu = false;
            }
            
        }
    
        scanner.close();
    }

}

