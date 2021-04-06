package com;

import com.util.Arquivo;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

/**
 * @author joser
 */

public class AlterarUsuarioController implements Initializable {
    
    @FXML
    private ComboBox<Usuario> comboUsuario;
    
    private List<Usuario> usuarios;
    
    private ObservableList<Usuario> listaUsuarios; 
    
    
    @FXML
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println(" ***************************** ");
        usuarios = Arquivo.listar();
        listaUsuarios = FXCollections.observableArrayList(usuarios); 
        comboUsuario.getItems().addAll(listaUsuarios);
        comboUsuario.setValue(usuarios.get(0));
    }
    
    @FXML
    public void show(){
        System.out.println(this.comboUsuario.getValue().getLogin());
    }
    
    @FXML
    private void menu() throws IOException {
        App.setRoot("menu");
    }

    public ComboBox<Usuario> getComboUsuario() {
        return comboUsuario;
    }

    public void setComboUsuario(ComboBox<Usuario> comboUsuario) {
        this.comboUsuario = comboUsuario;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public ObservableList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ObservableList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
    
    
    
    

}
