package ClassesAbstratas.CadastroFuncionarios;

public class ColaboradorFisico extends Colaborador{
    
    String cpf;
    String rg;
    int idade;
    String titulacao;

    public ColaboradorFisico(String nome, String logradouro, int numero, String bairro, String cidade, String unidadeFederacao, int telefone, String email, String disciplinasMinistradas, String cpf, String rg, int idade, String titulacao) {
        super(nome, logradouro, numero, bairro, cidade, unidadeFederacao, telefone, email, disciplinasMinistradas);
        this.cpf = cpf;
        this.rg = rg;
        this.idade = idade;
        this.titulacao = titulacao;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getTitulacao() {
        return titulacao;
    }
    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

}
