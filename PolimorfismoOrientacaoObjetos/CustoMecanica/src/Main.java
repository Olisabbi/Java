package PolimorfismoOrientacaoObjetos.CustoMecanica.src;

import PolimorfismoOrientacaoObjetos.CustoMecanica.src.Controller.CarroController;
import PolimorfismoOrientacaoObjetos.CustoMecanica.src.Controller.MotocicletaController;
import PolimorfismoOrientacaoObjetos.CustoMecanica.src.Controller.OnibusController;
import PolimorfismoOrientacaoObjetos.CustoMecanica.src.Model.CarroModel;
import PolimorfismoOrientacaoObjetos.CustoMecanica.src.Model.MotocicletaModel;
import PolimorfismoOrientacaoObjetos.CustoMecanica.src.Model.OnibusModel;
import PolimorfismoOrientacaoObjetos.CustoMecanica.src.View.CarroView;
import PolimorfismoOrientacaoObjetos.CustoMecanica.src.View.MotocicletaView;
import PolimorfismoOrientacaoObjetos.CustoMecanica.src.View.OnibusView;

public class Main {
    
    public static void main(String[] args) {
        // Criando instâncias da view para cada categoria
        CarroView carroView = new CarroView();
        MotocicletaView motocicletaView = new MotocicletaView();
        OnibusView onibusView = new OnibusView();

        // Criando instâncias do modelo para cada categoria
        CarroModel carro = new CarroModel("Chevrolet", "Cruze", "ABC1234", 4);
        MotocicletaModel motocicleta = new MotocicletaModel("Honda", "CBR500R", "XYZ5678", 500);
        OnibusModel onibus = new OnibusModel("Mercedes", "MB O500U", "DEF9012", 40, 2);

        // Criando instâncias do controlador para cada categoria
        CarroController carroController = new CarroController(carroView, carro);
        MotocicletaController motocicletaController = new MotocicletaController(motocicletaView, motocicleta);
        OnibusController onibusController = new OnibusController(onibusView, onibus);

        // Simulando o valor das peças para cada categoria
        double valorPecasCarro = 3000.0;
        double valorPecasMotocicleta = 3000.0;
        double valorPecasOnibus = 3000.0;

        // Calculando e exibindo o preço do serviço para cada categoria
        carroController.calcularPrecoServico(valorPecasCarro);
        motocicletaController.calcularPrecoServico(valorPecasMotocicleta);
        onibusController.calcularPrecoServico(valorPecasOnibus);
    }
}
