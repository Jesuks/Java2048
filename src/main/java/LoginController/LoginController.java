package LoginController;

import controller.UserData;
import controller.UserDataManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Arrays;

public class LoginController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    //private UserData currentUser;
    @FXML
    private void handleLogin(ActionEvent event) throws IOException {
        String username = usernameField.getText();
        String password = passwordField.getText();
        UserData loadedUser = UserDataManager.loadUserData(username);
        if (loadedUser != null && loadedUser.getUsername().equals(username) && loadedUser.getPassword().equals(password)) {
            //currentUser = loadedUser;
            UserData.setCurrentUser(loadedUser);
            showAlert("Login Success", "Welcome back, " + username);
            root = FXMLLoader.load(getClass().getResource("/fxml/chessBoard.fxml"));
            stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
            scene=new Scene(root);
            stage.setScene(scene);
            stage.show();

            // 恢复游戏状态
            // restoreGameState(currentUser);

        } else {
            showAlert("Login Error", "Invalid username or password");
        }
    }
    private void restoreGameState(UserData userData) {
        // 从 userData.getGameState() 中恢复游戏状态
        // 这个部分需要根据你的游戏框架具体实现
    }

    @FXML
    private void handleCancel() {
        Stage stage = (Stage) usernameField.getScene().getWindow();
        stage.close();
    }
    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
