
import entity.Customer;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pupil
 */
class CustomerCreator {
    public Customer returnNewCustomer(){
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Dobavlenie pokupatelja");
        Customer customer = new Customer();
        System.out.println("Imja pokupatelja:");
        customer.setName(scanner.nextLine());
        System.out.println("Familija pokupatelja:");
        customer.setSuurname(scanner.nextLine());
        System.out.println("Dengi u pokupatelja:");
        customer.setMoney(scanner.nextInt());
        return customer;
    }
}
