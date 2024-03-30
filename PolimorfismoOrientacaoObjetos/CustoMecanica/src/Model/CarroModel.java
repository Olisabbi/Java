package PolimorfismoOrientacaoObjetos.CustoMecanica.src.Model;

public class CarroModel extends VeiculoModel {

    private int numPortas;

    public CarroModel(String marca, String modelo, String placa, int numPortas) {
        super(marca, modelo, placa);
        this.numPortas = numPortas;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }
}
