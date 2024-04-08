package ClassesGenericas.Cadastro.Cadastro;



public class CadastroModel<T, U, V, W, X> {
    private T nome;
    private U sobrenome;
    private V idade;
    private W endereco;
    private X email;

    public T  getNome(){
        return nome;
    }

    public void setNome(T nome){
        this.nome = nome;
    }

    public U getSobrenome(){
        return sobrenome;
    }

    public void setSobrenome(U sobrenome){
        this.sobrenome = sobrenome;
    }

    public V getIdade(){
        return idade;
    }

    public void setIdade(V idade){
        this.idade = idade;
    }

    public W getEndereco(){
        return endereco;
    }

    public void setEndereco(W endereco){
        this.endereco = endereco;
    }

    public X getEmail(){
        return email;
    }

    public void setEmail(X email){
        this.email= email;
    }

}
