package ClassesGenericas.Cadastro.Cadastro;



public class CadastroController<T, U, V, W, X> {
    private CadastroModel<T, U, V, W, X> model;
    private CadastroView view;

    public CadastroController(CadastroView view) {
        this.view = view;
    }

    public void criarCliente(T nome, U sobrenome, V idade, W endereco, X email) {
        model = new CadastroModel<>();
        model.setNome(nome);
        model.setSobrenome(sobrenome);
        model.setIdade(idade);
        model.setEndereco(endereco);
        model.setEmail(email);
    }

    public void atualizarView() {
        view.imprimirDetalhesDoCliente(model.getNome(), model.getSobrenome(), model.getIdade(), model.getEndereco(), model.getEmail());
    }

    public static void main(String[] args) {
        CadastroView view = new CadastroView();
        CadastroController<String, String, Integer, String, String> controller = new CadastroController<>(view);
        controller.criarCliente("Joao", "Rica", 30, "Rua das Flores, 678", "joao.silva@gmail.com");
        controller.atualizarView();
    }
}
