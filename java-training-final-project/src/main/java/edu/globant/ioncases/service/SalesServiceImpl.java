/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.globant.ioncases.service;

import edu.globant.ioncases.model.Case;
import edu.globant.ioncases.model.Customer;
import edu.globant.ioncases.model.OrderSale;
import edu.globant.ioncases.model.Receipt;
import edu.globant.ioncases.model.Sale;
import edu.globant.ioncases.model.SaleStatus;
import edu.globant.ioncases.model.Seller;
import java.util.Date;
import java.util.Map;

/**
 *
 * @author federico.calarco
 */
public class SalesServiceImpl implements SalesService {

//    SalesDao salesDao = new SalesDaoImpl();
//    InventoryService inventoryService = new InventoryServiceImpl();
    @Override
    public void addSale(Customer customer, Seller seller, OrderSale orderSale) {

        System.out.println("SalesService addSale");

        Receipt receipt = new Receipt(customer, new Date().toString(), calculateTotalPrice(orderSale.getOrder()), seller.getStore());

        Sale sale = new Sale(orderSale, customer, seller, SaleStatus.DRAFT, receipt);

    }

    private double calculateTotalPrice(Map<Case, Integer> order) {

        // TODO: !!!!
        double totalPrice = 999;

        //  order.forEach((ord,amount2) -> System.out.println("Order: "+ ord.getDesign() + " Price: " + ord.getPrice() + " Amount: " + amount2));
        return totalPrice;
    }

}
