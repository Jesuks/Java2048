package LoginController;

import java.io.*;
import java.util.ArrayList;

public class UserManager {
    private static ArrayList<User> users = new ArrayList<>();
    private static final String FILE_NAME = "users.txt";

    static {
        loadUsersFromFile();
    }

    public static boolean register(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return false; // Username already exists
            }
        }
        users.add(new User(username, password));
        saveUsersToFile();
        return true;
    }

    public static User login(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                user.setLoggedIn(true);
                saveUsersToFile();
                return user;
            }
        }
        return null;
    }

    public static void logout(User user) {
        user.setLoggedIn(false);
        saveUsersToFile();
    }

    public static ArrayList<User> getUsers() {
        return users;
    }

    private static void saveUsersToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (User user : users) {
                writer.write(user.getUsername() + "," + user.getPassword() + "," + user.isLoggedIn());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void loadUsersFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    User user = new User(parts[0], parts[1]);
                    user.setLoggedIn(Boolean.parseBoolean(parts[2]));
                    users.add(user);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("User file not found, starting with an empty user list.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
