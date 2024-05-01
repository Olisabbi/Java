package ArquivosPersistenciaObjetos.formulario;
import javax.swing.JOptionPane;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Cadastro implements Serializable{

    private String nome;
    private String cpf;
    private String dataNascimento;
    private String telefone;

    public Cadastro (String nome, String cpf, String dataNascimento, String telefone){

        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf(){
        return cpf;
    }

    public String getDataNascimento(){
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone(){
        return telefone;
    }

    public void setTelefone(String telefone){
        this.telefone= telefone;
    }

    public static void main(String[] args) {
        ArrayList<Cadastro> cadastros = new ArrayList<>();

        try {
            FileOutputStream fileOut = new FileOutputStream("cadastro.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            boolean continuar = true;

            while (continuar) {

                JOptionPane.showMessageDialog(null, "Digite seus Dados");

                String nome = JOptionPane.showInputDialog(null, "Nome:");

                String cpf = JOptionPane.showInputDialog(null, "CPF");

                String dataNascimento = JOptionPane.showInputDialog(null, "Data de Nascimento dd/mm/aaaa");

                String telefone = JOptionPane.showInputDialog(null, "Telefone");

                Cadastro cadastro = new Cadastro(nome, cpf, dataNascimento, telefone);

                cadastros.add(cadastro);

                out.writeObject(cadastros);

                String[] options = {"Novo Cadastro", "Ver Cadastros", "Sair"};
                int resposta = JOptionPane.showOptionDialog(null, "O que você gostaria de fazer?", "Opções", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

                if (resposta == 0) {
                    continuar = true;
                } else if (resposta == 1) {
                    FileInputStream fileIn = new FileInputStream("cadastro.ser");
                    ObjectInputStream in = new ObjectInputStream(fileIn);

                    ArrayList<Cadastro> cadastrosSalvos = (ArrayList<Cadastro>) in.readObject();

                    for (Cadastro c : cadastrosSalvos) {
                        JOptionPane.showMessageDialog(null, "Nome: " + c.getNome());
                        JOptionPane.showMessageDialog(null, "CPF: " + c.getCpf());
                        JOptionPane.showMessageDialog(null, "Data de Nascimento: " + c.getDataNascimento());
                        JOptionPane.showMessageDialog(null, "Telefone: " + c.getTelefone());
                    }

                    in.close();
                    fileIn.close();

                    continuar = true;
                } else {
                    continuar = false;
                }
            }

            out.close();
            fileOut.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar o arquivo.");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Classe Cadastro não encontrada.");
        }
    }
}

