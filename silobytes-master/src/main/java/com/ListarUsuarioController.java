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
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TableView.TableViewSelectionModel;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author joser
 */
public class ListarUsuarioController implements Initializable {

    @FXML
    private TableView<Usuario> tabela;
    @FXML
    private TableColumn<Usuario, String> colunaNome;
    @FXML
    private TableColumn<Usuario, String> colunaLogin;
    private TableColumn<Usuario, String> colunaPreco;
    private TableColumn<Usuario, String> colunaQuantia;

    private List<Usuario> usuarios;

    private ObservableList<Usuario> listaUsuarios;
    
    private List<Aluguel> alguel;
    
    private ObservableList<Aluguel> listaAluguel;
    
    TableViewSelectionModel<Usuario> selectionModel;

    @FXML
    public void initialize(URL url, ResourceBundle rb) {
        // busca usuarios no arquivo 
        usuarios = Arquivo.listar();    // busca todos usuarios gravados 
        colunaNome = new TableColumn("Nome");    // nome da coluna 
        colunaLogin = new TableColumn("Login");
        colunaPreco = new TableColumn("Preco");
        colunaQuantia = new TableColumn("Quantidade");
        colunaNome.setCellValueFactory(new PropertyValueFactory<>("nome"));   // valor da coluna (campo nome do objeto Usuario)
        colunaLogin.setCellValueFactory(new PropertyValueFactory<>("login"));
        colunaPreco.setCellValueFactory(new PropertyValueFactory<>("Preco"));
        colunaQuantia.setCellValueFactory(new PropertyValueFactory<>("Quantidade"));
        tabela.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);    // elimina colunas em branco     
        listaUsuarios = FXCollections.observableArrayList(usuarios);        // põe a lista de usuarios na lista que preenche a tabela
     //   listaAluguel = FXCollections.observableArrayList(aluguel);
        tabela.getColumns().addAll(colunaNome, colunaLogin, colunaPreco, colunaQuantia);
        tabela.setItems(listaUsuarios);   // preenche a tabela 
        //tabela.setItems(listaAluguel);
        selectionModel = tabela.getSelectionModel();
        selectionModel.setSelectionMode(SelectionMode.SINGLE);  // selecionar apenas uma linha 
    }

    @FXML
    private void menu() throws IOException {
        App.setRoot("menu");
    }

    public TableView<Usuario> getTabela() {
        return tabela;
    }

    public void setTabela(TableView<Usuario> tabela) {
        this.tabela = tabela;
    }

    public TableColumn<Usuario, String> getColunaNome() {
        return colunaNome;
    }

    public void setColunaNome(TableColumn<Usuario, String> colunaNome) {
        this.colunaNome = colunaNome;
    }

    public TableColumn<Usuario, String> getColunaLogin() {
        return colunaLogin;
    }

    public void setColunaLogin(TableColumn<Usuario, String> colunaLogin) {
        this.colunaLogin = colunaLogin;
    }

    public ObservableList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ObservableList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    @FXML
    private void eventos() {
        System.out.println("............... events");
        ObservableList<Usuario> selecionado = tabela.getSelectionModel().getSelectedItems();
        for (Usuario u : selecionado) {
            System.out.println("...: " + u.getNome());
        }

    }

}
