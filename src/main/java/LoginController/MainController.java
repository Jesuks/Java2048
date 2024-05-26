package LoginController;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {
    @FXML
    private Label userInfoLabel;
    @FXML
    private TextArea usersTextArea;
    @FXML
    private Button loginButton;
    @FXML
    private Button registerButton;
    @FXML
    private Button logoutButton;

    private User currentUser;

    @FXML
    public void initialize() {
        refreshUI();
    }

    @FXML
    private void handleLogin() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/login.fxml"));
        Parent root = loader.load();

        LoginController loginController = loader.getController();
        loginController.setMainController(this);

        Stage stage = new Stage();
        stage.setTitle("Login");
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(new Scene(root));
        stage.showAndWait();
    }

    @FXML
    private void handleRegister() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/register.fxml"));
        Parent root = loader.load();

        RegisterController registerController = loader.getController();
        registerController.setMainController(this);

        Stage stage = new Stage();
        stage.setTitle("Register");
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(new Scene(root));
        stage.showAndWait();
    }

    @FXML
    private void handleLogout() {
        if (currentUser != null) {
            UserManager.logout(currentUser);
            currentUser = null;
            refreshUI();
        }
    }

    public void setCurrentUser(User user) {
        this.currentUser = user;
        refreshUI();
    }

    private void refreshUI() {
        if (currentUser != null && currentUser.isLoggedIn()) {
            userInfoLabel.setText("Logged in as: " + currentUser.getUsername());
            loginButton.setVisible(false);
            registerButton.setVisible(false);
            logoutButton.setVisible(true);

            StringBuilder userText = new StringBuilder("Registered Users:\n");
            for (User user : UserManager.getUsers()) {
                userText.append("Username: ").append(user.getUsername()).append(", Password: ").append(user.getPassword()).append("\n");
            }
            usersTextArea.setText(userText.toString());
        } else {
            userInfoLabel.setText("Not logged in");
            loginButton.setVisible(true);
            registerButton.setVisible(true);
            logoutButton.setVisible(false);
            usersTextArea.setText("");
        }
    }
}
