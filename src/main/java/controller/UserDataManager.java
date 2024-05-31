package controller;

import java.io.*;

public class UserDataManager {
    private static final String FILE_PATH = "D:/Develop/Code/Project2048/UserData/userdata.ser";

    public static void saveUserData(UserData userData) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH+ userData.getUsername() + ".ser"))) {
            oos.writeObject(userData);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static UserData loadUserData(String username) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH+ username + ".ser"))) {
            UserData s=(UserData) ois.readObject();
            return s;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
