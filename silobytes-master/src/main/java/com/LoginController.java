/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import com.util.Arquivo;
import java.io.FileNotFoundException;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

/**
 *
 * @author Antonio
 */
public class LoginController {

    @FXML
    private TextField campoLogin;

    @FXML
    private TextField campoSenha;
    @FXML
    private void loginUsuario() throws FileNotFoundException, IOException {
        Usuario usuario = new Usuario();
        usuario.setLogin(campoLogin.getText());
        usuario.setSenha(campoSenha.getText());
        if (Arquivo.buscar(usuario) != null) {
            usuario = Arquivo.buscar(usuario);
            App.setRoot("alugar");
        };
    }
    @FXML
    private void voltar() throws IOException{
        App.setRoot("menu");
    }

    
  
}
