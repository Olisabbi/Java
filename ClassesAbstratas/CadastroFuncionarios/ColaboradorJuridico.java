package ClassesAbstratas.CadastroFuncionarios;

public class ColaboradorJuridico extends Colaborador {

    String razaoSocial;
    String nomeFantasia;
    String inscricaoMunicipal;
    String inscricaoEstadual;
    String cnpj;
    String website;

    public ColaboradorJuridico(String nome, String logradouro, int numero, String bairro, String cidade, String unidadeFederacao, int telefone, String email, String disciplinasMinistradas, String razaoSocial, String nomeFantasia, String inscricaoMunicipal, String inscricaoEstadual, String cnpj, String website) {
        super(nome, logradouro, numero, bairro, cidade, unidadeFederacao, telefone, email, disciplinasMinistradas);
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.inscricaoMunicipal = inscricaoMunicipal;
        this.inscricaoEstadual = inscricaoEstadual;
        this.cnpj = cnpj;
        this.website = website;
    }


    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getInscricaoMunicipal() {
        return inscricaoMunicipal;
    }

    public void setInscricaoMunicipal(String inscricaoMunicipal) {
        this.inscricaoMunicipal = inscricaoMunicipal;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getRazaoSocial(){
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial){
        this.razaoSocial = razaoSocial;
    }



}
