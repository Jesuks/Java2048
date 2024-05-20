package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class LogInPageController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToUserPage(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("/fxml/UserPage.fxml"));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchTochessBoard(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("/fxml/chessBoard.fxml"));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }



    @FXML
    private Button guestModeButton;
}

