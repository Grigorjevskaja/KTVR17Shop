
import entity.Product;
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
class ProductCreator {
    public Product returnNewProduct(){
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Dobavlenie produkta");
        Product product = new Product();
        System.out.println("Nazvanie producta:");
        product.setName(scanner.nextLine());
        System.out.println("Ctoimost producta:");
        product.setPrice(scanner.nextInt());
        System.out.println("Kolitcestvo producta:");
        product.setCount(scanner.nextInt());
        return product;
        
    }
    
}
