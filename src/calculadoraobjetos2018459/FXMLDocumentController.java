/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraobjetos2018459;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author informatica
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button btnUno;
    @FXML
    private Button btnDos;
    @FXML
    private Button btnTres;
    @FXML
    private Button btnCuatro;
    @FXML
    private Button btnCinco;
    @FXML
    private Button btnSeis;
    @FXML
    private Button btnSiete;
    @FXML
    private Button btnOcho;
    @FXML
    private Button btnNueve;
    @FXML
    private Button btnCero;
    @FXML
    private Button btnMasMenos;
    @FXML
    private Button btnIgual;
    @FXML
    private Button btnMas;
    @FXML
    private Button btnMenos;
    @FXML
    private Button btnMulti;
    @FXML
    private Button btnDivi;
    @FXML
    private Button btnUnoX;
    @FXML
    private Button btnPorcentaje;
    @FXML
    private Button btnCE;
    @FXML
    private Button btnC;
    @FXML
    private TextField txtPantalla;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource() == btnUno) {
            txtPantalla.setText(txtPantalla.getText()+"1");
        } else if(event.getSource() == btnDos) {
            txtPantalla.setText(txtPantalla.getText()+"2");
        } else if(event.getSource() == btnTres){
            txtPantalla.setText(txtPantalla.getText()+"3");
        } else if (event.getSource() == btnCuatro){
            txtPantalla.setText(txtPantalla.getText()+"4");
        } else if (event.getSource() == btnCinco){
            txtPantalla.setText(txtPantalla.getText()+"5");
        } else if (event.getSource() == btnSeis){
            txtPantalla.setText(txtPantalla.getText()+"6");
        } else if (event.getSource() == btnSiete){
            txtPantalla.setText(txtPantalla.getText()+"7");
        } else if (event.getSource() == btnOcho){
            txtPantalla.setText(txtPantalla.getText()+"8");
        } else if (event.getSource() == btnNueve){
            txtPantalla.setText(txtPantalla.getText()+"9");
        } else if (event.getSource() == btnCero){
            txtPantalla.setText(txtPantalla.getText()+"0");
        }
        
        }

        @Override
        public void initialize(URL   url, ResourceBundle rb) {
        }

}
