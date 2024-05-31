package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;
import java.util.Random;

public class chessBoardController {



    @FXML
    public GridPane gridPane;
    @FXML
    public Label scoreLable;
    @FXML
    public Label stepLable;
    int score=0;
    int steps=-1;

    public int[][] getChessboard() {
        return chessboard;
    }

    private int[][] chessboard = new int[4][4];
    private Random random = new Random();
    @FXML
    public void initialize() {
        createChessBoard();
        updateBoard();
    }
    //初始化棋盘。添加键盘监听
    private void updateBoard() {
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                String s= String.valueOf(chessboard[row][col]);
                Label label =(Label)gridPane.getChildren().get(row * 4 + col);
                label.setText(s);
                label.setStyle(Style.stlye(s));
            }
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

    public void endGame(){
        System.out.println("end!");
    }

    public void createChessBoard() {
        this.chessboard = new int[4][4];
        addRandom();
        addRandom();
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

}
