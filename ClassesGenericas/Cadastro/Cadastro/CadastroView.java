package ClassesGenericas.Cadastro.Cadastro;



public class CadastroView {
    public <T, U, V, W, X> void imprimirDetalhesDoCliente(T nomeCliente, U sobrenomeCliente, V idadeCliente, W enderecoCliente, X emailCliente) {
        System.out.println("Nome: " + nomeCliente);
        System.out.println("Sobrenome: " + sobrenomeCliente);
        System.out.println("Idade: " + idadeCliente);
        System.out.println("Endereço: " + enderecoCliente);
        System.out.println("Email: " + emailCliente);
    }
}
