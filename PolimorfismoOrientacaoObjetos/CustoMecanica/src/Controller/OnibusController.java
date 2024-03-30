package PolimorfismoOrientacaoObjetos.CustoMecanica.src.Controller;

import PolimorfismoOrientacaoObjetos.CustoMecanica.src.Model.OnibusModel;
import PolimorfismoOrientacaoObjetos.CustoMecanica.src.View.OnibusView;

public class OnibusController {
    
    private OnibusView onibusView;
    private OnibusModel onibusModel;

    public OnibusController(OnibusView onibusView, OnibusModel onibusModel){
        this.onibusView = onibusView;
        this.onibusModel = onibusModel;
    }

    public void calcularPrecoServico(double valorPecas) {
        double percentual = 0.4; 
        double precoServico = valorPecas * percentual;
        
       
        onibusView.mostrarOnibus(onibusModel, precoServico);
    }
}
