
import entity.Customer;
import entity.Product;
import entity.Purchase;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pupil
 */
class PurchaseCreator {

    public Purchase returnNewPurchase(List<Product> products, List<Customer> customers) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pokupka");
        Purchase purchase = new Purchase();
        System.out.print("Spisok tovarov:");
        int countProducts = products.size();
        for (int i = 0; i < countProducts; i++) {
            System.out.println(i + 1 + "." + products.get(i).getName());
        }
        System.out.println("Spisok klijentov:");
        int countCustomers = customers.size();
        for (int i = 0; i < countCustomers; i++) {
            System.out.println(i + 1 + ". " + customers.get(i).getName());
        }

        System.out.println("Выбрать номер товара:");
        int numberProduct = scanner.nextInt();
        Product product = products.get(numberProduct - 1);
        System.out.println("Выбрать покупателя: ");
        int numberCustomer = scanner.nextInt();
         System.out.println("Выбрать количество товара: ");
        int quantity = scanner.nextInt();
        Customer customer = customers.get(numberCustomer - 1);
        purchase.setCustomer(customer);
        purchase.setProduct(product);
        purchase.setQuantity(quantity);
       Calendar c  = new GregorianCalendar();
       LibHistory libHistory = new LibHistory();
       purchase.setDate(date);
        return purchase;

    }

}

}
