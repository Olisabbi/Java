package ClassesAbstratas.CadastroFuncionarios;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando alguns colaboradores
        ColaboradorFisico colaboradorFisico = new ColaboradorFisico("Leso", "Rua Carpa", 4343, "Aquarela", "Joinville", "Santa Catarina", 12345678, "leso@gemail.com", "Matematica", "332.987.755-01", "12.345.678-9", 30, "Graduado");
        ColaboradorJuridico colaboradorJuridico = new ColaboradorJuridico("Luiz", "Rua Monte", 456, "Boa Vista", "Joinville", "Santa Catarina", 87654321, "Luiz@gemail.com", "Biologia", "Razão Social ", "Luiz", "Inscrição Municipal", "Inscrição Estadual", "11.000.000/0001-00", "www.luiz.com");

        // Adicionando os colaboradores a uma lista
        List<Colaborador> colaboradores = new ArrayList<>();
        colaboradores.add(colaboradorFisico);
        colaboradores.add(colaboradorJuridico);

        // Exibindo os dados dos colaboradores
        for (Colaborador colaborador : colaboradores) {
            System.out.println("Nome: " + colaborador.getNome());
            System.out.println("Endereço: " + colaborador.getLogradouro() + ", " + colaborador.getNumero());
            System.out.println("Bairro: " + colaborador.getBairro());
            System.out.println("Cidade: " + colaborador.getCidade());
            System.out.println("Unidade da Federação: " + colaborador.getUnidadeFederacao());
            System.out.println("Telefone: " + colaborador.getTelefone());
            System.out.println("Email: " + colaborador.getEmail());
            System.out.println("Disciplinas que ministram: " + colaborador.getDisciplinasMinistradas());
            System.out.println();
        }
    }
}

