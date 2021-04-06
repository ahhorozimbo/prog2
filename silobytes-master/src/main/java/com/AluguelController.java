/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import com.util.Arquivo;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

/**
 *
 * @author Antonio
 */
public class AluguelController {
    
    @FXML
    private TextField campoToneladas;

    @FXML
    private TextField campoDias;

    @FXML
    private TextField campoPreco;
    
    

    @FXML
    private void somar() {
        double toneladas = Double.valueOf(campoToneladas.getText());
        int dia = Integer.valueOf(campoDias.getText());
        double preco = (toneladas * 212) / dia;
        campoPreco.setText(Float.toString((float) preco) + "R$");
    }
    
    @FXML
    private void salve() {
        Aluguel aluguel = new Aluguel();
        
    }
        
    
    @FXML
    private void voltar() throws IOException{
        App.setRoot("menu");
    }
            

}
