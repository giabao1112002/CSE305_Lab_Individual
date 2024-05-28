/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class RegisterUser {

    public class RegisteredUser {
        private List<User> listOfUsers;

        public RegisteredUser() {
            this.listOfUsers = new ArrayList<>();
        }

        public void addUser(User user) {
            this.listOfUsers.add(user);
        }

        public void removeUser(User user) {
            this.listOfUsers.remove(user);
        }
    }
}
