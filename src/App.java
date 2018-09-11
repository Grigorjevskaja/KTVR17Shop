
import entity.Customer;
import entity.Product;
import entity.Purchase;
import java.util.ArrayList;
import java.util.List;
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
public class App {
   private List<Customer>customers = new ArrayList<>();
   private List<Product>products = new ArrayList<>();
   private List<Purchase>purchases = new ArrayList<>();
   public void run(){
       String repeat = "r";
       Scanner scanner = new Scanner(System.in);
       int task;
       do{
           System.out.println("Vibrat deistvie:");
           System.out.println("0-Vihod iz programmi:");
           System.out.println("1-Dobavit tovar:");
           System.out.println("2-Dobavit pokupatelja:");
           System.out.println("3-Sdelat pokupku:");
           
         
           task = scanner.nextInt();
           switch (task) {
               case 0:
                   repeat = "q";
                   break;
               case 1:
                   ProductCreator productCreator = new ProductCreator();
                   products.add(productCreator.returnNewProduct());
                   break;
               case 2:
                   CustomerCreator customerCreator = new CustomerCreator();
                   customers.add(customerCreator.returnNewCustomer());
                   break;
               case 3:
                   PurchaseCreator purchaseCreator = new PurchaseCreator();
                   purchases.add(purchaseCreator.returnNewPurchase());
                   break;
                   
                   
                   
                   
           }
       }
       
   }
}
