public class Principal {
    
    public static void main(String[] args){

        Aluno aluno = new Aluno("Alonco", "Rua Correia Silva", "4900983217", "Aloncogmail.com", "003982762");

        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Endereço: " + aluno.getEndereco());
        System.out.println("Telefone: " + aluno.getTelefone());
        System.out.println("Email: " + aluno.getEmail());
        System.out.println("Matrícula: "+ aluno.getMatricula() );
        
    }
}
