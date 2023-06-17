
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package fruit_crear;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class interfasGraficaController_1 implements Initializable {

    @FXML
    private Label label;
    @FXML
    private Label label1;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
        
    }
     @FXML
    private void andleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
      
        label1.setText("Hello!");
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
