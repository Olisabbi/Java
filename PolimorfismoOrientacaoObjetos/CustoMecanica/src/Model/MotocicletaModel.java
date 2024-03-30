package PolimorfismoOrientacaoObjetos.CustoMecanica.src.Model;

public class MotocicletaModel extends VeiculoModel {

    private int cilindradas;

    public MotocicletaModel(String marca, String modelo, String placa, int cilindradas) {
        super(marca, modelo, placa);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
}
