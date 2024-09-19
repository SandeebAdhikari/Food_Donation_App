package User;

import org.json.simple.JSONObject;

public class User {
    public int id;
    public String firstName;
    public String lastName;
    public String userName;
    public String password;
    public String role;

    public User(){}

    public User(User user) {
        this.id = user.id;
        this.firstName = user.firstName;
        this.lastName = user.lastName;
        this.userName = user.userName;
        this.password = user.password;
        this.role = user.role;
    }

    public User(int id, String firstName, String lastName, String userName, String password, String role) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            System.out.println("Please enter a valid ID number!!");
        }
    }

    public User getUser() {return this;}
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String address) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public JSONObject toJSON() {
        JSONObject userObj = new JSONObject();
        userObj.put("id", id);
        userObj.put("firstName", firstName);
        userObj.put("lastName", lastName);
        userObj.put("userName", userName);
        userObj.put("password", password);
        userObj.put("role", role);
        return userObj;
    }

    @Override
    public String toString() {
        String roleText = (role != null) ? role.toUpperCase() : "UNKNOWN ROLE";
        String idLabel = role.equalsIgnoreCase("Teacher") ? "DONOR ID" : "CUSTOMER ID";

        return "<html>Role: " + roleText + "<br>" + idLabel + ": " + id +
                "<br>First Name: " + firstName + "<br>Last Name: " + lastName +
                "<br>User Name: " + userName + "<br>Password: " + password + "</html>";
    }
}
