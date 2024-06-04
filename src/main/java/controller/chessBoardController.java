package controller;

import LoginController.LoginController;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
import javafx.util.Duration;
import javafx.scene.control.Alert;


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
    public Label scoreLable2;
    @FXML
    public Label stepLable;
    int score = 0;
    int highestscore=0;
    int steps = -1;
    private int[][] chessboard = new int[4][4];
    private Random random = new Random();

    @FXML
    public void initialize() {
        createChessBoard();
        loadUserData();
        updateBoard();
    }

    public void newGame() {
        steps = -1;
        score = 0;
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
        if (score>highestscore){
            highestscore=score;
        }
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

        if (!radioMenuItem1.isSelected() && !radioMenuItem2.isSelected() && !radioMenuItem3.isSelected() && !radioMenuItem4.isSelected() && !radioMenuItem5.isSelected() && !radioMenuItem6.isSelected() && !radioMenuItem7.isSelected()) {
            radioMenuItem7.setSelected(true);
        }

        if (radioMenuItem7.isSelected()) {
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
        if (radioMenuItem1.isSelected()) {
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
        if (radioMenuItem2.isSelected()) {
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
        if (radioMenuItem3.isSelected()) {
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
        if (radioMenuItem4.isSelected()) {
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
                                "-fx-background-radius: 5;"); // 圆角

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
        if (radioMenuItem5.isSelected()) {

        }
        if (radioMenuItem6.isSelected()) {

        }


        scoreLable.setText("Score : " + score);
        steps++;
        stepLable.setText("Steps : " + steps);
        scoreLable2.setText("Highest score："+highestscore);
    }


    //根据当前数组，更新棋盘方块
    public boolean ifContinue(int [][]chessboard) {
        int rows = chessboard.length;
        int cols = chessboard[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int currentValue = chessboard[i][j];
                // 检查上方格子
                if (i > 0 && (chessboard[i - 1][j] == currentValue || chessboard[i - 1][j] == 0)) {
                    return true;
                }
                // 检查下方格子
                if (i < rows - 1 && (chessboard[i + 1][j] == currentValue || chessboard[i + 1][j] == 0)) {
                    return true;
                }
                // 检查左侧格子
                if (j > 0 && (chessboard[i][j - 1] == currentValue || chessboard[i][j - 1] == 0)) {
                    return true;
                }

                // 检查右侧格子
                if (j < cols - 1 && (chessboard[i][j + 1] == currentValue || chessboard[i][j + 1] == 0)) {
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

    public void loadUserData() {
        if (UserData.currentUser != null) {
            score = UserData.currentUser.score;
            highestscore=UserData.currentUser.highestscore;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    chessboard[i][j] = UserData.currentUser.gameState[i][j];
                }
            }
        }
    }


    public void saveGame() {
        if (UserData.currentUser != null) {
            UserData.currentUser.score = score;
            if (score>highestscore){
                UserData.currentUser.highestscore=score;
            }
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    UserData.currentUser.gameState[i][j] = chessboard[i][j];
                }
            }
            UserDataManager.saveUserData(UserData.currentUser);
            showAlert("Save successfully", "Save successfully");
        } else {
            showAlert("Saving fails","Haven't login yet");

        }
    }


    @FXML
    private void handleKeyPress(KeyEvent event) {
        KeyCode keyCode = event.getCode();
        switch (keyCode) {
            case UP -> moveUp();
            case DOWN -> moveDown();
            case LEFT -> moveLeft();
            case RIGHT -> moveRight();
        }
    }

    public void moveUp() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = j + 1; k < 4; k++) {
                    if (chessboard[k][i] != 0 && chessboard[j][i] != chessboard[k][i]) {
                        break;
                    }
                    //防止跳跃判定
                    if (chessboard[j][i] == chessboard[k][i]) {
                        chessboard[j][i] = 2 * chessboard[j][i];
                        score += chessboard[j][i];
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
        if (!ifContinue(chessboard)) {
            endGame();
        }

    }

    public void moveDown() {
        for (int i = 0; i < 4; i++) {
            for (int j = 3; j > 0; j--) {
                for (int k = j - 1; k >= 0; k--) {
                    if (chessboard[k][i] != 0 && chessboard[j][i] != chessboard[k][i]) {
                        break;
                    }
                    if (chessboard[j][i] == chessboard[k][i]) {
                        chessboard[j][i] = 2 * chessboard[j][i];
                        score += chessboard[j][i];
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
        if (!ifContinue(chessboard)) {
            endGame();
        }
    }

    public void moveLeft() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = j + 1; k < 4; k++) {
                    if (chessboard[i][k] != 0 && chessboard[i][j] != chessboard[i][k]) {
                        break;
                    }
                    if (chessboard[i][j] == chessboard[i][k]) {
                        chessboard[i][j] = 2 * chessboard[i][j];
                        score += chessboard[i][j];
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
        if (!ifContinue(chessboard)) {
            endGame();
        }
    }

    public void moveRight() {
        for (int i = 0; i < 4; i++) {
            for (int j = 3; j > 0; j--) {
                for (int k = j - 1; k >= 0; k--) {
                    if (chessboard[i][k] != 0 && chessboard[i][j] != chessboard[i][k]) {
                        break;
                    }
                    if (chessboard[i][j] == chessboard[i][k]) {
                        chessboard[i][j] = 2 * chessboard[i][j];
                        score += chessboard[i][j];
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
        if (!ifContinue(chessboard)) {
            endGame();
        }
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
    }

    //AI相关算法
    private int smoothnessWeight = -1;
    private int monotonicityWeight = 10;
    private int emptyTilesWeight = 27;
    private int maxTileWeight = 10;

    private int evaluate(int[][] board) {
        return calculateSmoothness(board) * smoothnessWeight +
                calculateMonotonicity(board) * monotonicityWeight +
                calculateEmptyTiles(board) * emptyTilesWeight +
                calculateMaxTile(board) * maxTileWeight;
    }

    private int calculateSmoothness(int[][] chessboard) {
        int smoothness = 0;
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                int value = chessboard[row][col];
                if (value != 0) {
                    if (row < 3) {
                        int belowValue = chessboard[row + 1][col];
                        if (belowValue != 0) {
                            smoothness -= Math.abs(value - belowValue);
                        }
                    }
                    if (col < 3) {
                        int rightValue = chessboard[row][col + 1];
                        if (rightValue != 0) {
                            smoothness -= Math.abs(value - rightValue);
                        }
                    }
                }
            }
        }
        return smoothness;
    }

    private int calculateMonotonicity(int[][] chessboard) {
        int[] totals = {0, 0, 0, 0};

        // Horizontal direction
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 3; col++) {
                int currentValue = chessboard[row][col];
                int nextValue = chessboard[row][col + 1];
                if (currentValue > nextValue) {
                    totals[0] += nextValue - currentValue;
                } else if (currentValue < nextValue) {
                    totals[1] += currentValue - nextValue;
                }
            }
        }

        // Vertical direction
        for (int col = 0; col < 4; col++) {
            for (int row = 0; row < 3; row++) {
                int currentValue = chessboard[row][col];
                int nextValue = chessboard[row + 1][col];
                if (currentValue > nextValue) {
                    totals[2] += nextValue - currentValue;
                } else if (currentValue < nextValue) {
                    totals[3] += currentValue - nextValue;
                }
            }
        }

        return Math.max(totals[0], totals[1]) + Math.max(totals[2], totals[3]);
    }

    private int calculateEmptyTiles(int[][] chessboard) {
        int emptyTiles = 0;
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                if (chessboard[row][col] == 0) {
                    emptyTiles++;
                }
            }
        }
        return emptyTiles;
    }

    private int calculateMaxTile(int[][] chessboard) {
        int maxTile = 0;
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                maxTile = Math.max(maxTile, chessboard[row][col]);
            }
        }
        return maxTile;
    }

    private int minimax(int[][] chessboard, int depth, boolean maximizingPlayer) {
        if (depth == 0 || !ifContinue(chessboard)) {
            return evaluate(chessboard);
        }

        if (maximizingPlayer) {
            int maxEval = Integer.MIN_VALUE;
            for (int move = 0; move < 4; move++) {
                int[][] newBoard = copyBoard(chessboard);
                if (makeMove(newBoard, move)) {
                    int eval = minimax(newBoard, depth - 1, false); // 下一步是最小化
                    maxEval = Math.max(maxEval, eval);
                }
            }
            return maxEval;
        } else {
            int minEval = Integer.MAX_VALUE;
            for (int row = 0; row < 4; row++) {
                for (int col = 0; col < 4; col++) {
                    if (chessboard[row][col] == 0) {
                        int[][] newBoard = copyBoard(chessboard);
                        newBoard[row][col] = 2;
                        int eval = minimax(newBoard, depth - 1, true); // 下一步是最大化
                        minEval = Math.min(minEval, eval);

                        newBoard[row][col] = 4;
                        eval = minimax(newBoard, depth - 1, true); // 下一步是最大化
                        minEval = Math.min(minEval, eval);
                    }
                }
            }
            return minEval;
        }
    }

    private int[][] copyBoard(int[][] chessboard) {
        int[][] newBoard = new int[4][4];
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                newBoard[row][col] = chessboard[row][col];
            }
        }
        return newBoard;
    }

    private boolean makeMove(int[][] chessboard, int direction) {
        boolean canMove=false;
            switch (direction) {
                case 0 -> {//moveuUp
                        for (int i = 0; i < 4; i++) {
                            for (int j = 0; j < 3; j++) {
                                for (int k = j + 1; k < 4; k++) {
                                    if (chessboard[k][i] != 0 && chessboard[j][i] != chessboard[k][i]) {
                                        break;
                                    }
                                    //防止跳跃判定
                                    if (chessboard[j][i] == chessboard[k][i]) {
                                        chessboard[j][i] = 2 * chessboard[j][i];
                                        chessboard[k][i] = 0;
                                        canMove=true;
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

                    }

                case 1 -> {//moveDown

                        for (int i = 0; i < 4; i++) {
                            for (int j = 3; j > 0; j--) {
                                for (int k = j - 1; k >= 0; k--) {
                                    if (chessboard[k][i] != 0 && chessboard[j][i] != chessboard[k][i]) {
                                        break;
                                    }
                                    if (chessboard[j][i] == chessboard[k][i]) {
                                        chessboard[j][i] = 2 * chessboard[j][i];
                                        chessboard[k][i] = 0;
                                        canMove=true;
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

                    }

                case 2 -> {//moveRight
                        for (int i = 0; i < 4; i++) {
                            for (int j = 3; j > 0; j--) {
                                for (int k = j - 1; k >= 0; k--) {
                                    if (chessboard[i][k] != 0 && chessboard[i][j] != chessboard[i][k]) {
                                        break;
                                    }
                                    if (chessboard[i][j] == chessboard[i][k]) {
                                        chessboard[i][j] = 2 * chessboard[i][j];
                                        chessboard[i][k] = 0;
                                        canMove=true;
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
                    }
                case 3 -> {//moveLeft
                        for (int i = 0; i < 4; i++) {
                            for (int j = 0; j < 3; j++) {
                                for (int k = j + 1; k < 4; k++) {
                                    if (chessboard[i][k] != 0 && chessboard[i][j] != chessboard[i][k]) {
                                        break;
                                    }
                                    if (chessboard[i][j] == chessboard[i][k]) {
                                        chessboard[i][j] = 2 * chessboard[i][j];
                                        chessboard[i][k] = 0;
                                        canMove=true;
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
                    }
        }
        return canMove;
    }

    public boolean ifFull(int [][]chessboard){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (chessboard[i][j]==0){
                    return false;
                }
            }
        }
        return true;
    }
    public void aiMove() {
        int bestMove = -1;
        double bestValue = Double.MIN_VALUE;
        for (int move = 0; move < 4; move++) {
            int[][] newBoard = copyBoard(chessboard);
            if (makeMove(newBoard, move)||!ifFull(newBoard)) {  // 检查移动是否有效
                double moveValue = minimax(newBoard, 4, false);  // 传入下一步是最小化玩家
                if (moveValue > bestValue) {
                    bestValue = moveValue;
                    bestMove = move;
                }
            }
        }
        switch (bestMove){
            case 0->moveUp();
            case 1->moveDown();
            case 2->moveRight();
            case 3->moveLeft();
            // 更新UI
        }
    }

    @FXML
    Button aiButton=new Button();
    private Timeline aiTimeline;
    public void handleAIButton(ActionEvent event) {
        if (aiTimeline == null) {
            aiTimeline = new Timeline(new KeyFrame(Duration.seconds(0.05), new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    aiMove();
                }
            }));
            aiTimeline.setCycleCount(Timeline.INDEFINITE);
            aiTimeline.play();
            aiButton.setText("Stop AI");
        } else {
            aiTimeline.stop();
            aiTimeline = null;
            aiButton.setText("Start AI");
        }
    }


}



