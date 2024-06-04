package LoginController;

import controller.UserData;
import controller.UserDataManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class RegisterController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    public Button registerButton;
    @FXML
    private UserData currentUser;
    @FXML
    private void handleRegister(ActionEvent event) throws IOException {
        if (Objects.equals(registerButton.getText(), "Register")) {
            String username = usernameField.getText();
            String password = passwordField.getText();
            if (username.isEmpty() || password.isEmpty()) {
                showAlert("Registration Error", "Username and password cannot be empty");
                return;
            }
            currentUser = new UserData(username, password);
            UserDataManager.saveUserData(currentUser);
            showAlert("Registration Success", "User registered successfully");
        }else {
            root = FXMLLoader.load(getClass().getResource("/fxml/chessBoard.fxml"));
            stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
            scene=new Scene(root);
            stage.setScene(scene);
            stage.show();

        }
    }
    @FXML
    private void handleCancel(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/fxml/MainPage.fxml"));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        // Apply custom CSS
        DialogPane dialogPane = alert.getDialogPane();
        dialogPane.getStylesheets().add(getClass().getResource("/fxml/styles.css").toExternalForm());
        dialogPane.getStyleClass().add("alert");
        alert.showAndWait();
        registerButton.setText("Start Game");
    }



}
