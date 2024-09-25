package utilities;

import User.User;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

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

    public static JSONObject toJSON(Map<String, Object> data) {
        JSONObject jsonObj = new JSONObject();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            jsonObj.put(entry.getKey(), entry.getValue());
        }
        return jsonObj;
    }
}
