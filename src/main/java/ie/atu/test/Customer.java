package ie.atu.test;

public class Customer {
    private String customerId;
    private String Name;
    private String Email;
    private String phoneNumber;

    public Customer(String customerId, String name, String email, String phoneNumber) {
        this.customerId = customerId;
        Name = name;
        Email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
