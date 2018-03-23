/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author 04399704233
 */
public class CalculadoraController implements Initializable {

    @FXML 
    private TextField txtNumero1;
    
    @FXML
    private TextField txtNumero2;
    
    @FXML
    private TextField txtResultado;
    
    @FXML
    private Button btnSomar;
    
    @FXML
    private Button btnDividir;
    
    @FXML
    private Button btnMenos;
    
    @FXML
    private Button btnMultiplicar;
   
    @FXML
    private void somar (ActionEvent event){
        
        
        Double num1 = Double.parseDouble(txtNumero1.getText());
        Double num2 = Double.parseDouble(txtNumero2.getText());
        
        Double resultado = num1+num2;
        
        txtResultado.setText("");
        txtResultado.setText(resultado.toString());
        
    }
     @FXML
      private void dividir (ActionEvent event){
             Double num1 = Double.parseDouble(txtNumero1.getText());
        Double num2 = Double.parseDouble(txtNumero2.getText());
        
        Double resultado = num1/num2;
        
         txtResultado.setText("");
        txtResultado.setText(resultado.toString());
        
    }
       @FXML
        private void multiplicar(ActionEvent event){
               Double num1 = Double.parseDouble(txtNumero1.getText());
        Double num2 = Double.parseDouble(txtNumero2.getText());
        
        Double resultado = num1*num2;
        
         txtResultado.setText("");
        txtResultado.setText(resultado.toString());
        
    }
         @FXML
          private void subtrair (ActionEvent event){
                 Double num1 = Double.parseDouble(txtNumero1.getText());
        Double num2 = Double.parseDouble(txtNumero2.getText());
        
        Double resultado = num1-num2;
        
         txtResultado.setText("");
        txtResultado.setText(resultado.toString());
        
    }
           @FXML
    public void initialize(URL url, ResourceBundle rb) {
     
    }    
    
}
