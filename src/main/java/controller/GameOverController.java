package controller;

import javafx.fxml.FXML;
import javafx.stage.Stage;

public class GameOverController {

    @FXML
    private void handleClose() {
        // 获取当前窗口并关闭它
        Stage stage = (Stage) ((javafx.scene.Node) (new javafx.event.ActionEvent()).getSource()).getScene().getWindow();
        stage.close();
    }
}
