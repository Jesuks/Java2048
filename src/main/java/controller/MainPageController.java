package controller;

import Test.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MainPageController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchTochessBoard(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("/fxml/chessBoard.fxml"));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToLoginPage(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("/fxml/LoginPage.fxml"));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToRegisterPage(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/fxml/RegisterPage.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }





    @FXML
    private Button guestModeButton;
}

