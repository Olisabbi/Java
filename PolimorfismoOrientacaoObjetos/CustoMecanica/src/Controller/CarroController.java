package PolimorfismoOrientacaoObjetos.CustoMecanica.src.Controller;

import PolimorfismoOrientacaoObjetos.CustoMecanica.src.Model.CarroModel;
import PolimorfismoOrientacaoObjetos.CustoMecanica.src.View.CarroView;

public class CarroController {
    
    private CarroView carroView;
    private CarroModel carroModel;

    public CarroController(CarroView carroView, CarroModel carroModel){
        this.carroView = carroView;
        this.carroModel = carroModel;
    }

    
    public void calcularPrecoServico(double valorPecas) {
        double percentual = 0.25; 
        double precoServico = valorPecas * percentual;
        
        carroView.mostrarCarro(carroModel, precoServico);
    }
}
