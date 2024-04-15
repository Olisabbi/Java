package ClassesAbstratas.CadastroFuncionarios;

public class Colaborador {

String nome;
String logradouro;
int numero;
String bairro;
String cidade;
String unidadeFederacao;
int telefone;
String email;
String disciplinasMinistradas;


public Colaborador(String nome, String logradouro, int numero, String bairro, String cidade, String unidadeFederacao, int telefone, String email, String disciplinasMinistradas) {
    this.nome = nome;
    this.logradouro = logradouro;
    this.numero = numero;
    this.bairro = bairro;
    this.cidade = cidade;
    this.unidadeFederacao = unidadeFederacao;
    this.telefone = telefone;
    this.email = email;
    this.disciplinasMinistradas = disciplinasMinistradas;
}

public String getNome(){
    return nome;
}

public void setNome(String nome){
    this.nome = nome;
}

public String getLogradouro(){
    return logradouro;
}

public void setLogradouro(String logradouro){
    this.logradouro = logradouro;
}

public int getNumero(){
    return numero;
}

public void setNumero(int numero){
    this.numero = numero;
}

public String getBairro(){
    return bairro;
}

public void setBairro(String bairro){
    this.bairro = bairro;
}

public String getCidade(){
    return cidade;
}

public void setCidade(String cidade){
    this.cidade = cidade;
}

public String getUnidadeFederacao(){
    return unidadeFederacao;
}

public void setUnidadeFederacao(String unidadeFederacao){
    this.unidadeFederacao = unidadeFederacao;
}

public int getTelefone(){
    return telefone;
}

public void setTelefone(int telefone){
    this.telefone = telefone; 
}

public String getEmail(){
    return email;
}

public void setEmail(String email){
    this.email = email;
}

public String getDisciplinasMinistradas() {
    return disciplinasMinistradas;
}

public void setDisciplinasMinistradas(String disciplinasMinistradas) {
    this.disciplinasMinistradas = disciplinasMinistradas;
}

}
