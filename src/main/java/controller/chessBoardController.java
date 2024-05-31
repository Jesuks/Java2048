package controller;

import LoginController.LoginController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class chessBoardController {

    @FXML
    public GridPane gridPane;
    @FXML
    public Pane pane;
    @FXML
    public Label scoreLable;
    @FXML
    public Label stepLable;
    int score=0;
    int steps=-1;
    private int[][] chessboard = new int[4][4];
    private Random random = new Random();
    @FXML
    public void initialize() {
        createChessBoard();
        loadUserData();
        updateBoard();
    }

    public void newGame(){
        steps=-1;
        score=0;
        createChessBoard();
        updateBoard();
    }


    @FXML
    private RadioMenuItem radioMenuItem1;
    @FXML
    private RadioMenuItem radioMenuItem2;
    @FXML
    private RadioMenuItem radioMenuItem3;
    @FXML
    private RadioMenuItem radioMenuItem4;
    @FXML
    private RadioMenuItem radioMenuItem5;
    @FXML
    private RadioMenuItem radioMenuItem6;
    @FXML
    private RadioMenuItem radioMenuItem7;
    @FXML
    private ToggleGroup toggleGroup;

    //初始化棋盘。添加键盘监听
    @FXML
    private void updateBoard() {
        toggleGroup = new ToggleGroup();
        radioMenuItem1.setToggleGroup(toggleGroup);
        radioMenuItem2.setToggleGroup(toggleGroup);
        radioMenuItem3.setToggleGroup(toggleGroup);
        radioMenuItem4.setToggleGroup(toggleGroup);
        radioMenuItem5.setToggleGroup(toggleGroup);
        radioMenuItem6.setToggleGroup(toggleGroup);
        radioMenuItem7.setToggleGroup(toggleGroup);
        toggleGroup = new ToggleGroup();


        toggleGroup.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                RadioButton selectedRadioButton = (RadioButton) newValue;
                String selectedText = selectedRadioButton.getText();

            }
        });

        if (!radioMenuItem1.isSelected() && !radioMenuItem2.isSelected() && !radioMenuItem3.isSelected() && !radioMenuItem4.isSelected() && !radioMenuItem5.isSelected() && !radioMenuItem6.isSelected() && !radioMenuItem7.isSelected()){
            radioMenuItem7.setSelected(true);
        }

        if(radioMenuItem7.isSelected()){
            for (int row = 0; row < 4; row++) {
                for (int col = 0; col < 4; col++) {
                    String s = String.valueOf(chessboard[row][col]);
                    Label label = (Label) gridPane.getChildren().get(row * 4 + col);
                    if (s.equals("0")) {
                        label.setText("");
                        label.setStyle("-fx-background-color:#FFF5EE;" +
                                "-fx-background-radius: 3;");
                    } else {
                        label.setText(s);
                        label.setStyle(Style.style(s));
                    }
                }
            }
        }
        if(radioMenuItem1.isSelected()){
            pane.setStyle("-fx-backgroud-color:#FF5733");
            for (int row = 0; row < 4; row++) {
                for (int col = 0; col < 4; col++) {
                    String s = String.valueOf(chessboard[row][col]);
                    Label label = (Label) gridPane.getChildren().get(row * 4 + col);
                    if (s.equals("0")) {
                        label.setText("");
                        label.setStyle("-fx-background-color:#FFF5EE;" +
                                "-fx-background-radius: 3;");
                    } else {
                        label.setText(s);
                        label.setStyle(Style1.style(s));
                    }
                }
            }
        }
        if(radioMenuItem2.isSelected()){
            pane.setStyle("-fx-backgroud-color:#3498DB");
            for (int row = 0; row < 4; row++) {
                for (int col = 0; col < 4; col++) {
                    String s = String.valueOf(chessboard[row][col]);
                    Label label = (Label) gridPane.getChildren().get(row * 4 + col);
                    if (s.equals("0")) {
                        label.setText("");
                        label.setStyle("-fx-background-color:#FFF5EE;" +
                                "-fx-background-radius: 3;");
                    } else {
                        label.setText(s);
                        label.setStyle(Style2.style(s));
                    }
                }
            }
        }
        if(radioMenuItem3.isSelected()){
            pane.setStyle("-fx-backgroud-color:#2C3E50");
            for (int row = 0; row < 4; row++) {
                for (int col = 0; col < 4; col++) {
                    String s = String.valueOf(chessboard[row][col]);
                    Label label = (Label) gridPane.getChildren().get(row * 4 + col);
                    if (s.equals("0")) {
                        label.setText("");
                        label.setStyle("-fx-background-color:#FFF5EE;" +
                                "-fx-background-radius: 3;");
                    } else {
                        label.setText(s);
                        label.setStyle(Style3.style(s));
                    }
                }
            }
        }
        if(radioMenuItem4.isSelected()) {
            pane.setStyle("-fx-background-image: url('file:src/main/resources/images/WaterLily.jpg');" +
                    "-fx-background-size: cover;" +
                    "-fx-background-position: center center;" +
                    "-fx-background-repeat: no-repeat;");

            for (int row = 0; row < 4; row++) {
                for (int col = 0; col < 4; col++) {
                    String s = String.valueOf(chessboard[row][col]);
                    Label label = (Label) gridPane.getChildren().get(row * 4 + col);
                    if (s.equals("0")) {
                        label.setText("");
                        label.setStyle("-fx-background-color:#FFF5EE;" +
                                "-fx-background-radius: 3;");
                    } else {
                        label.setStyle("-fx-background-color: rgba(0, 0, 0, 0.5);" + // 半透明背景
                                "-fx-text-fill: white;" + // 白色字体
                                "-fx-padding: 10;" + // 内边距
                                "-fx-background-radius: 5;" ); // 圆角

                    }
                }
            }
            for (int row = 0; row < 4; row++) {
                for (int col = 0; col < 4; col++) {
                    String s = String.valueOf(chessboard[row][col]);
                    Label label = (Label) gridPane.getChildren().get(row * 4 + col);


                }


            }
        }
        if(radioMenuItem5.isSelected()){

        }
        if(radioMenuItem6.isSelected()){

        }


        scoreLable.setText("Score : "+score);
        steps++;
        stepLable.setText("Steps : "+steps);
    }


    //根据当前数组，更新棋盘方块
    public  boolean ifContinue() {
        int rows = chessboard.length;
        int cols = chessboard[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int currentValue = chessboard[i][j];
                // 检查上方格子
                if (i > 0 && (chessboard[i - 1][j] == currentValue||chessboard[i-1][j]==0)) {
                    return true;
                }
                // 检查下方格子
                if (i < rows - 1 && (chessboard[i + 1][j] == currentValue||chessboard[i+1][j]==0)) {
                    return true;
                }
                // 检查左侧格子
                if (j > 0 && (chessboard[i][j - 1] == currentValue||chessboard[i][j-1]==0)) {
                    return true;
                }

                // 检查右侧格子
                if (j < cols - 1 && (chessboard[i][j + 1] == currentValue||chessboard[i][j+1]==0)) {
                    return true;
                }
            }
        }
        // 如果没有找到相等的相邻格子，返回 false
        return false;
    }


    public void addRandom() {
        ArrayList<grid> emptyCells = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (chessboard[i][j] == 0) {
                    emptyCells.add(new grid(i, j));
                }
            }
        }
        int randomIndex = random.nextInt(emptyCells.size());
        grid randomCell = emptyCells.get(randomIndex);
        this.chessboard[randomCell.x][randomCell.y] = random.nextDouble() < 0.5 ? 2 : 4;
    }
    public class grid {
        int x, y;
        grid(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    Stage stage;
    Scene scene;
    Parent root;
    public void endGame() {
        System.out.println("end!");
        // 弹出新的窗口
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/gameOver.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Game Over");
            stage.initModality(Modality.APPLICATION_MODAL); // 阻塞主窗口
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void createChessBoard() {
        this.chessboard = new int[4][4];
        addRandom();
        addRandom();
    }

    public void loadUserData(){
        if (UserData.currentUser!=null){
            score=UserData.currentUser.score;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    chessboard[i][j]=UserData.currentUser.gameState[i][j];
                }
            }
        }
    }

    public void saveGame(){
        if (UserData.currentUser!=null) {
            UserData.currentUser.score = score;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    UserData.currentUser.gameState[i][j] = chessboard[i][j];
                }
            }
            UserDataManager.saveUserData(UserData.currentUser);
            showAlert("Save successfully", "Save successfully");
        }
        else {

        }
    }



    @FXML
    private void handleKeyPress(KeyEvent event) {
        KeyCode keyCode = event.getCode();
        switch (keyCode) {
            case UP-> moveUp(); case DOWN-> moveDown(); case LEFT-> moveLeft(); case RIGHT-> moveRight();
        }
    }
    public void moveUp() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = j + 1; k < 4; k++) {
                    if (chessboard[k][i]!=0&&chessboard[j][i] != chessboard[k][i]){
                        break;
                    }
                    //防止跳跃判定
                    if (chessboard[j][i] == chessboard[k][i]) {
                        chessboard[j][i] = 2 * chessboard[j][i];
                        score+=chessboard[j][i];
                        chessboard[k][i] = 0;
                        break;
                    }
                }
            }
            int count = 0;
            int[] temp = new int[4];
            for (int j = 0; j < 4; j++) {
                if (chessboard[j][i] != 0) {
                    temp[count] = chessboard[j][i];
                    count++;
                    //对这一列，所有比零大的，排序。tem从上到下被赋值，下面没被复制的默认为0
                }
            }
            for (int j = 0; j < 4; j++) {
                chessboard[j][i] = temp[j];
            }
        }
        addRandom();
        updateBoard();
        if (!ifContinue()) {
            endGame();
        }

    }

    public void moveDown() {
        for (int i = 0; i < 4; i++) {
            for (int j = 3; j > 0; j--) {
                for (int k = j - 1; k >= 0; k--) {
                    if (chessboard[k][i]!=0&&chessboard[j][i] != chessboard[k][i]){
                        break;
                    }
                    if (chessboard[j][i] == chessboard[k][i]) {
                        chessboard[j][i] = 2 * chessboard[j][i];
                        score+=chessboard[j][i];
                        chessboard[k][i] = 0;
                        break;
                    }
                }
            }
            int count = 3;
            int[] temp = new int[4];
            for (int j = 3; j >= 0; j--) {
                if (chessboard[j][i] != 0) {
                    temp[count] = chessboard[j][i];
                    count--;
                }
            }
            for (int j = 0; j < 4; j++) {
                chessboard[j][i] = temp[j];
            }
        }
        addRandom();
        updateBoard();
        if (!ifContinue()) {
            endGame();
        }
    }

    public void moveLeft() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = j + 1; k < 4; k++) {
                    if (chessboard[i][k]!=0&&chessboard[i][j] != chessboard[i][k]){
                        break;
                    }
                    if (chessboard[i][j] == chessboard[i][k]) {
                        chessboard[i][j] = 2 * chessboard[i][j];
                        score+=chessboard[i][j];
                        chessboard[i][k] = 0;
                        break;
                    }
                }
            }
            int count = 0;
            int[] temp = new int[4];
            for (int j = 0; j < 4; j++) {
                if (chessboard[i][j] != 0) {
                    temp[count] = chessboard[i][j];
                    count++;
                }
            }
            for (int j = 0; j < 4; j++) {
                chessboard[i][j] = temp[j];
            }
        }
        addRandom();
        updateBoard();
        if (!ifContinue()) {
            endGame();}
    }

    public void moveRight() {
        for (int i = 0; i < 4; i++) {
            for (int j = 3; j > 0; j--) {
                for (int k = j - 1; k >= 0; k--) {
                    if (chessboard[i][k]!=0&&chessboard[i][j] != chessboard[i][k]){
                        break;
                    }
                    if (chessboard[i][j] == chessboard[i][k]) {
                        chessboard[i][j] = 2 * chessboard[i][j];
                        score+=chessboard[i][j];
                        chessboard[i][k] = 0;
                        break;
                    }
                }
            }
            int count = 3;
            int[] temp = new int[4];
            for (int j = 3; j >= 0; j--) {
                if (chessboard[i][j] != 0) {
                    temp[count] = chessboard[i][j];
                    count--;
                }
            }
            for (int j = 0; j < 4; j++) {
                chessboard[i][j] = temp[j];
            }
        }
        addRandom();
        updateBoard();
        if (!ifContinue()) {
            endGame();
        }
    }
    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

}

