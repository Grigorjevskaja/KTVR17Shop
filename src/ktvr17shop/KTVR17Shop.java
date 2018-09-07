/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktvr17shop;

import entity.Customer;
import entity.Product;
import entity.Purchase;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author pupil
 */
public class KTVR17Shop {

    public static void main(String[] args) {
        Product p1 = new Product(1L, "Moloko", 50,10);
        Product p2 = new Product(2L, "Hleb", 30,15);
        Product p3 = new Product(3L, "Kolbasa", 130,20);
        
        Customer c1 = new Customer(1L,"Ivan", "Ivanov", 1000);
        Customer c2 = new Customer(2L,"Sidor", "Sidorov", 1000);
        Customer c3 = new Customer(3L,"Petr", "Petrov", 1000);
        
        Calendar calendar = new GregorianCalendar();
        Purchase purchase = new Purchase(1L, p1, c1, calendar.getTime(), 2);
        c1.setMoney(c1.getMoney()-purchase.getProduct().getPrice()*purchase.getQuality());
        p1.setCount(p1.getCount()-purchase.getQuality());
        System.out.println(p1.toString());
        System.out.println(c1.toString());
        System.out.println(purchase.toString());
        System.out.println(calendar.toString());
        
    }
                
    }

