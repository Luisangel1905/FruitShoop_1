package fruitshoop_1;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
import fruit_crear.interfasGraficaController_1;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class interfasGraficaController implements Initializable {

    @FXML
    private TextField texuser;
    @FXML
    private Label label1;

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        System.out.println("You clicked me!");
        label.setText("Hello World!");

       
        
    }
     @FXML
    private void andleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
      
        label1.setText("Hello!");
    }
     @FXML
    private void ndleButtonAction(ActionEvent event) throws IOException {
    FXMLLoader loader = new FXMLLoader(getClass().getResource("interfasGraficaController_1.fxml"));
        Parent root = loader.load();

        // Obtener el controlador de la nueva interfaz
        interfasGraficaController_1 controller = loader.getController();

        // Configurar la escena y mostrarla
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
