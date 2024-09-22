package utilities;

import User.User;

import org.json.simple.JSONArray;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import static User.UserApp.FILE_PATH;

public class utilities {
    private static ArrayList<User> users;
    public static void saveUsersToFile() {
        JSONArray userList = new JSONArray();
        for (User user : users) {
            userList.add(user.toJSON());
        }

        try (FileWriter file = new FileWriter(FILE_PATH)) {
            file.write(userList.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
