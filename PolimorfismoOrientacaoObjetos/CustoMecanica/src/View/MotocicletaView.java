package PolimorfismoOrientacaoObjetos.CustoMecanica.src.View;

import PolimorfismoOrientacaoObjetos.CustoMecanica.src.Model.MotocicletaModel;

public class MotocicletaView {
    
    public void mostrarMotocicleta(MotocicletaModel motocicleta, double precoServico) {
        System.out.println("Marca: " + motocicleta.getMarca());
        System.out.println("Modelo: " + motocicleta.getModelo());
        System.out.println("Placa: " + motocicleta.getPlaca());
        System.out.println("Cilindradas: " + motocicleta.getCilindradas());
        System.out.println("Preço do serviço para conserto da motocicleta: R$" + precoServico);
    }
}
