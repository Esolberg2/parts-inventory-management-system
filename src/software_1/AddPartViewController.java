/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package software_1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author eric
 */
public class AddPartViewController implements Initializable {
    
    
    
    @FXML
    private void cancel(ActionEvent event) throws IOException {
//        String id = ((Button)event.getSource()).getId();
        Parent parent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene main = new Scene(parent);
        
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(main);
        window.show();
    }
    
    @FXML
    private void save(ActionEvent event) throws IOException {
        System.out.println(addPartName.getText());
        
        if (addPartOutsourced.isSelected()) {
            System.out.println("outsourced");
        }
        else if (addPartInHouse.isSelected()) {
            System.out.println("inhouse");
        }
        else {
            System.out.println("select a source");
        }
        
    }
    
//    @FXML
//    private void save(ActionEvent event) throws IOException {
////        String id = ((Button)event.getSource()).getId();
//        Parent parent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
//        Scene main = new Scene(parent);
//        
//        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
//        
//        window.setScene(main);
//        window.show();
//    }
    
    @FXML private TextField addPartName;
    @FXML private TextField addPartInv;
    @FXML private TextField addPartPrice;
    @FXML private TextField addPartMax;
    @FXML private TextField addPartMin;
    @FXML private TextField addPartCompanyName;
    
    ToggleGroup toggleGroup = new ToggleGroup();
    @FXML private RadioButton addPartInHouse;
    @FXML private RadioButton addPartOutsourced;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ToggleGroup group = new ToggleGroup();
            addPartInHouse.setToggleGroup(group);
            addPartOutsourced.setToggleGroup(group);
    }    
    
}
