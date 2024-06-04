package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.stage.Stage;


public class GameOverController {
    @FXML
    private void handleClose(ActionEvent event) {
        // 获取当前窗口并关闭它
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }
}
