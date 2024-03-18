public class Aluno {

    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private String matricula;

    public Aluno(String nome, String endereco, String telefone, String email, String matricula) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.matricula = matricula;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }
        public String getNome() {
                        return nome;
        }
        public void setEndereco(String endereco) {
                    this.endereco = endereco;
        }
        public String getEndereco() {
                        return endereco;
        }
        public void setTelefone(String telefone) {
                    this.telefone = telefone;
        }
        public String getTelefone() {
                        return telefone;
        }
        public void setEmail(String email) {
                    this.email = email;
        }
        public String getEmail() {
                        return email;
        }
        public void setMatricula(String matricula) {
                    this.matricula = matricula;
        }
        public String getMatricula() {
                        return matricula;
        }
                

           

    
}
