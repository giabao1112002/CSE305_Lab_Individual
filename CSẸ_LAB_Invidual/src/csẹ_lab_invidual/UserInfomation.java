/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package csẹ_lab_invidual;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class UserInfomation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int userId;
        String password;
        String email;
        String userType;
        User user = new User("12345", "password123", "example@example.com", "admin");
        user.createUser();
        user.resetPassword();

    }

    public static class User {
        // Attributes

        private String userID;
        private String password;
        private String email;
        private String userType;

        // Constructor
        public User(String userID, String password, String email, String userType) {
            this.userID = userID;
            this.password = password;
            this.email = email;
            this.userType = userType;
        }

        // Operations
        public void createUser() {
            // Logic to create a new user
            System.out.println("User created successfully!");
        }

        public void resetPassword() {
            // Logic to reset password
            System.out.println("Password reset successful!");
        }

        // Getters and Setters
        public String getUserID() {
            return userID;
        }

        public void setUserID(String userID) {
            this.userID = userID;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getUserType() {
            return userType;
        }

        public void setUserType(String userType) {
            this.userType = userType;
        }
    }

}
