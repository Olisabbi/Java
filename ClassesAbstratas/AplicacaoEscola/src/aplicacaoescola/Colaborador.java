
package aplicacaoescola;

public abstract class Colaborador {
      
    String logradouro;
    int numero;
    String bairro;
    private String cidade;
    private String uf;
    private String fone;
    private String disciplinaMinistra;
    
   

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getDisciplinaMinistra() {
        return disciplinaMinistra;
    }

    public void setDisciplinaMinistra(String disciplinaMinistra) {
        this.disciplinaMinistra = disciplinaMinistra;
    }
    
}
