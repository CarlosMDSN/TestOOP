package ie.atu.test;


import javax.naming.Name;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


      ArrayList<String>CustomerObjects = new ArrayList<>(Arrays.asList("Computer","Charger","Mouse"));



      Scanner scanner = new Scanner(System.in);

      System.out.println("Add Customer");
        System.out.print("name:");
        String name1 = scanner.nextLine();
        System.out.print("Email:");
        String email = scanner.nextLine();
        System.out.print("customerId:");
        String customerId = scanner.nextLine();
        System.out.println("phoneNumber:");
        String phoneNumber = scanner.nextLine();

              Customer Customer1 = new Customer();
              Customer1.setName(name1);
              Customer1.setEmail(email);
              Customer1.setCustomerId(customerId);
              Customer1.setPhoneNumber(phoneNumber);

        System.out.println("\nUpdate Customer");
        System.out.print("Name:");
        String name2 = scanner.nextLine();
        System.out.print("Email:");
        String email2 = scanner.nextLine();
        System.out.print("customerId:");
        String customerId2 = scanner.nextLine();
        System.out.println("phoneNumber:");
        String phoneNumber2 = scanner.nextLine();

        Customer updateCustomer =  new Customer(name2);
        updateCustomer.setName(email2);
        updateCustomer.setCustomerId(customerId2);
        updateCustomer.setPhoneNumber(phoneNumber2);

        System.out.println("\nAll Customers:");


        System.out.println("\nName:"+ Customer1.getName());
        System.out.println("Email:"+ Customer1.getEmail());
        System.out.println("customerId:"+ Customer1.getCustomerId());
        System.out.println("phoneNumber:"+ Customer1.getPhoneNumber());


        System.out.println("\nName:"+ updateCustomer.getName());
        System.out.println("Email:"+ updateCustomer.getEmail());
        System.out.println("customerId:"+ updateCustomer.getCustomerId());
        System.out.println("phoneNumber:"+ updateCustomer.getPhoneNumber());
        scanner.close();

        System.out.println("\nExit.");
    }

}