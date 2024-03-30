package PolimorfismoOrientacaoObjetos.CustoMecanica.src.View;

import PolimorfismoOrientacaoObjetos.CustoMecanica.src.Model.CarroModel;

public class CarroView {
    
    public void mostrarCarro(CarroModel carro, double precoServico) {
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Placa: " + carro.getPlaca());
        System.out.println("Número de Portas: " + carro.getNumPortas());
        System.out.println("Preço do serviço para conserto do carro: R$" + precoServico);
    }
}
