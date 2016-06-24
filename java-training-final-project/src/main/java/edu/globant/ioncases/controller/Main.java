/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.globant.ioncases.controller;

import edu.globant.ioncases.model.Case;
import edu.globant.ioncases.model.Customer;
import edu.globant.ioncases.model.OrderSale;

import edu.globant.ioncases.model.Store;
import edu.globant.ioncases.model.StoreSeller;
import edu.globant.ioncases.service.SalesService;
import edu.globant.ioncases.service.SalesServiceImpl;

/**
 *
 * @author federico.calarco
 */
public class Main {

    public static void main(String[] args) {
        
       
        OrderSale orderSale = new OrderSale();

        orderSale.addCaseToOrder(new Case("Batman case", 20), 2);
        orderSale.addCaseToOrder(new Case("Batman case2", 20), 2);
        orderSale.addCaseToOrder(new Case("Batman case3", 20), 2);
        orderSale.addCaseToOrder(new Case("Batman case4", 20), 2);

        Store store1 = new Store("Store1");

        StoreSeller seller = new StoreSeller("Federico", store1);

        Customer customer = new Customer("Pepe", 21, 'M', "Madryn");

        SalesService sc = new SalesServiceImpl();
        sc.addSale(customer, seller, orderSale);

    }
}
