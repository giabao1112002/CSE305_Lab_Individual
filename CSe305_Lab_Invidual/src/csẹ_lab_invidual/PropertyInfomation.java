/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class PropertyInfomation {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int proID;
        String description;
        int proOwnerId;
        Property property = new Property(1, "Example Property", 123);
        System.out.println(property);

    }

    public static class Property {

        private int propertyID;
        private String description;
        private int propertyOwnerId;

        // Constructor
        public Property(int propertyID, String description, int propertyOwnerId) {
            this.propertyID = propertyID;
            this.description = description;
            this.propertyOwnerId = propertyOwnerId;
        }

        // Getter for PropertyID
        public int getPropertyID() {
            return propertyID;
        }

        // Setter for PropertyID
        public void setPropertyID(int propertyID) {
            this.propertyID = propertyID;
        }

        // Getter for Description
        public String getDescription() {
            return description;
        }

        // Setter for Description
        public void setDescription(String description) {
            this.description = description;
        }

        // Getter for PropertyOwnerId
        public int getPropertyOwnerId() {
            return propertyOwnerId;
        }

        // Setter for PropertyOwnerId
        public void setPropertyOwnerId(int propertyOwnerId) {
            this.propertyOwnerId = propertyOwnerId;
        }

        // toString method to represent the object as a string
        @Override
        public String toString() {
            return "Property{"
                    + "propertyID=" + propertyID
                    + ", description='" + description + '\''
                    + ", propertyOwnerId=" + propertyOwnerId
                    + '}';
        }
    }
}
