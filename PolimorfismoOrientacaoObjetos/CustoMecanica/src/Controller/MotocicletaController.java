package PolimorfismoOrientacaoObjetos.CustoMecanica.src.Controller;

import PolimorfismoOrientacaoObjetos.CustoMecanica.src.Model.MotocicletaModel;
import PolimorfismoOrientacaoObjetos.CustoMecanica.src.View.MotocicletaView;

public class MotocicletaController {
    
    private MotocicletaView motocicletaView;
    private MotocicletaModel motocicletaModel;

    public MotocicletaController(MotocicletaView motocicletaView, MotocicletaModel motocicletaModel){
        this.motocicletaView = motocicletaView;
        this.motocicletaModel = motocicletaModel;
    }

    public void calcularPrecoServico(double valorPecas) {
        double percentual = 0.15; 
        double precoServico = valorPecas * percentual;
        
        motocicletaView.mostrarMotocicleta(motocicletaModel, precoServico);
    }
}
