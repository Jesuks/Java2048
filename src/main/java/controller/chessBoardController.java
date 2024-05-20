package controller;

import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;
import java.util.Random;

public class chessBoardController {

    @FXML
    private GridPane gridPane;

    private int[][] chessboard = new int[4][4];
    private Random random = new Random();



    @FXML
    public void initialize() {
        createChessBoard();
        updateBoard();
    }

    private void updateBoard() {
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                Rectangle rect = getNodeByRowColumnIndex(row, col);
                int value = chessboard[row][col];
                assert rect != null;
                rect.setFill(getColorForValue(value));
            }
        }
    }

    private Color getColorForValue(int value) {
        return switch (value) {
            case 2 -> Color.LIGHTYELLOW;
            case 4 -> Color.LIGHTGREEN;
            case 8 -> Color.LIGHTBLUE;
            case 16 -> Color.LIGHTCORAL;
            default -> Color.LIGHTGRAY;
        };
    }

    private Rectangle getNodeByRowColumnIndex(final int row, final int column) {
        for (javafx.scene.Node node : gridPane.getChildren()) {
            if (GridPane.getRowIndex(node) != null && GridPane.getRowIndex(node) == row &&
                    GridPane.getColumnIndex(node) != null && GridPane.getColumnIndex(node) == column) {
                return (Rectangle) node;
            }
        }
        return null;
    }


    public boolean ifFull(int[][] chessboard) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (chessboard[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public void addRandom(int[][] chessboard) {
        ArrayList<grid> emptyCells = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (chessboard[i][j] == 0) {
                    emptyCells.add(new grid(i, j));
                }
            }
        }
        if (!emptyCells.isEmpty()) {
            int randomIndex = random.nextInt(emptyCells.size());
            grid randomCell = emptyCells.get(randomIndex);
            this.chessboard[randomCell.x][randomCell.y] = random.nextDouble() < 0.5 ? 2 : 4;
        }
    }
    class grid {
        int x, y;
        grid(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public void createChessBoard() {
        this.chessboard = new int[4][4];
        addRandom(this.chessboard);
        addRandom(this.chessboard);

    }

    public boolean moveUp() {
        boolean moved = false;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = j + 1; k < 4; k++) {
                    if (chessboard[j][i] == chessboard[k][i]) {
                        chessboard[j][i] = 2 * chessboard[j][i];
                        chessboard[k][i] = 0;
                        moved = true;
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
                }
            }
            for (int j = 0; j < 4; j++) {
                chessboard[j][i] = temp[j];
            }
        }
        if (moved && !ifFull(chessboard)) {
            addRandom(chessboard);
            updateBoard();
            return true;
        }
        return false;
    }

    public boolean moveDown() {
        boolean moved = false;
        for (int i = 0; i < 4; i++) {
            for (int j = 3; j > 0; j--) {
                for (int k = j - 1; k >= 0; k--) {
                    if (chessboard[j][i] == chessboard[k][i]) {
                        chessboard[j][i] = 2 * chessboard[j][i];
                        chessboard[k][i] = 0;
                        moved = true;
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
        if (moved && !ifFull(chessboard)) {
            addRandom(chessboard);
            updateBoard();
            return true;
        }
        return false;
    }

    public boolean moveLeft() {
        boolean moved = false;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = j + 1; k < 4; k++) {
                    if (chessboard[i][j] == chessboard[i][k]) {
                        chessboard[i][j] = 2 * chessboard[i][j];
                        chessboard[i][k] = 0;
                        moved = true;
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
        if (moved && !ifFull(chessboard)) {
            addRandom(chessboard);
            updateBoard();
            return true;
        }
        return false;
    }

    public boolean moveRight() {
        boolean moved = false;
        for (int i = 0; i < 4; i++) {
            for (int j = 3; j > 0; j--) {
                for (int k = j - 1; k >= 0; k--) {
                    if (chessboard[i][j] == chessboard[i][k]) {
                        chessboard[i][j] = 2 * chessboard[i][j];
                        chessboard[i][k] = 0;
                        moved = true;
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
        if (moved && !ifFull(chessboard)) {
            addRandom(chessboard);
            updateBoard();
            return true;
        }
        return false;
    }

}
