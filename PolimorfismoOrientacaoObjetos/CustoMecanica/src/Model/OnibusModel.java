package PolimorfismoOrientacaoObjetos.CustoMecanica.src.Model;

public class OnibusModel extends VeiculoModel {

    private int capacidadePassageiros;
    private int eixos;

    public OnibusModel(String marca, String modelo, String placa, int capacidadePassageiros, int eixos) {
        super(marca, modelo, placa);
        this.capacidadePassageiros = capacidadePassageiros;
        this.eixos = eixos;
    }
    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    public void setCapacidadePassageiros(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    
}
