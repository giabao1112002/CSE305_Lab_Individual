/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rental_management;

/**
 *
 * @author Duy
 */
public class Property {
    
    public static void main(String[] args) {
        PropertyInfo property = new PropertyInfo(1, "Description", 123);
        System.out.println(property);

    }

    public static class PropertyInfo {

        private int propertyID;
        private String description;
        private int propertyOwnerId;

       
        public PropertyInfo(int propertyID, String description, int propertyOwnerId) {
            this.propertyID = propertyID;
            this.description = description;
            this.propertyOwnerId = propertyOwnerId;
        }

      
        public int getPropertyID() {
            return propertyID;
        }

        public void setPropertyID(int propertyID) {
            this.propertyID = propertyID;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

      
        public int getPropertyOwnerId() {
            return propertyOwnerId;
        }

     
        public void setPropertyOwnerId(int propertyOwnerId) {
            this.propertyOwnerId = propertyOwnerId;
        }

        
        @Override
        public String toString() {
            return "PropertyInfo: "
                    + "propertyID:" + propertyID
                    + ", description:" + description 
                    + ", propertyOwnerId:" + propertyOwnerId
                    ;
        }
    }
}
