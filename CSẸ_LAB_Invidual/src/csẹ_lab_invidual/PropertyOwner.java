import java.util.ArrayList;
import java.util.List;

import rental_management.Property;
import rental_management.User;

public class PropertyOwner {
    // Attributes
    private User user;
    private List<Property> listOfProperties;

    // Constructor
    public PropertyOwner(User user) {
        this.user = user;
        this.listOfProperties = new ArrayList<>();
    }

    // Methods
    public void addProperty(Property property) {
        listOfProperties.add(property);
    }

    public void removeProperty(Property property) {
        listOfProperties.remove(property);
    }

    // Getters and Setters
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Property> getListOfProperties() {
        return listOfProperties;
    }

    public void setListOfProperties(List<Property> listOfProperties) {
        this.listOfProperties = listOfProperties;
    }
}
