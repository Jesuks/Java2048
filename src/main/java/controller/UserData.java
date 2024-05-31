package controller;

import java.io.Serializable;
import java.util.HashMap;

public class UserData implements Serializable {
    private static final long serialVersionUID = 1L; // 版本标识符
    public String username;
    public String password;
    public int score;
    public int[][] gameState;
    public UserData(String username, String password) {
        this.username = username;
        this.password = password;
        this.score = 0;
        this.gameState = new int[4][4];
    }

    public static UserData currentUser;
    public static UserData getCurrentUser() {
        return currentUser;
    }

    public static void setCurrentUser(UserData user) {
        currentUser = user;
    }


    // getter 和 setter 方法

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int[][] getGameState() {
        return gameState;
    }

    public void setGameState(int [][] gameState) {
        this.gameState = gameState;
    }
}
