package LoginController;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RegisterController {
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private PasswordField confirmPasswordField;

    private MainController mainController;

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

    @FXML
    private void handleRegister() {
        String username = usernameField.getText();
        String password = passwordField.getText();
        String confirmPassword = confirmPasswordField.getText();

        if (username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
            usernameField.setStyle("-fx-border-color: red;");
            passwordField.setStyle("-fx-border-color: red;");
            confirmPasswordField.setStyle("-fx-border-color: red;");
            return;
        }

        if (!password.equals(confirmPassword)) {
            passwordField.setStyle("-fx-border-color: red;");
            confirmPasswordField.setStyle("-fx-border-color: red;");
            return;
        }

        if (UserManager.register(username, password)) {
            Stage stage = (Stage) usernameField.getScene().getWindow();
            stage.close();
        } else {
            usernameField.setStyle("-fx-border-color: red;");
        }
    }

    @FXML
    private void handleCancel() {
        Stage stage = (Stage) usernameField.getScene().getWindow();
        stage.close();
    }
}
