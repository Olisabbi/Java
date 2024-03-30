package PolimorfismoOrientacaoObjetos.CustoMecanica.src.View;

import PolimorfismoOrientacaoObjetos.CustoMecanica.src.Model.OnibusModel;

public class OnibusView {
    
    public void mostrarOnibus(OnibusModel onibus, double precoServico) {
        System.out.println("Marca: " + onibus.getMarca());
        System.out.println("Modelo: " + onibus.getModelo());
        System.out.println("Placa: " + onibus.getPlaca());
        System.out.println("Capacidade de Passageiros: " + onibus.getCapacidadePassageiros());
        System.out.println("Eixos: " + onibus.getEixos());
        System.out.println("Preço do serviço para conserto do ônibus: R$" + precoServico);
        System.out.println();
    }
}
