/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.globant.day1.exercises.oop.controller;

import edu.globant.day1.exercises.designPatterns.Entity.Customer;
import edu.globant.day1.exercises.designPatterns.Entity.Provider;
import edu.globant.day1.exercises.designPatterns.Entity.Receipt;
import edu.globant.day1.exercises.designPatterns.Entity.Sale;
import edu.globant.day1.exercises.designPatterns.Entity.SaleStatus;
import edu.globant.day1.exercises.oop.service.SalesService;
import edu.globant.day1.exercises.oop.service.SalesServiceImpl;

/**
 *
 * @author fedec
 */
public class ION {

    public static void main(String[] args) {
        
        Provider provider1 = new Provider("Real Case");

        System.out.println("*************ION SOLID CASE*************" + "\n");

        SalesService salesService = new SalesServiceImpl();

        Customer customer1 = new Customer("Federico Gaston Calarco", 22, 'M', "La Plata");
        Receipt receipt1 = new Receipt(customer1, "14/06/2016", 20, 1, "Store Nº 3 - 7th Ave, New York, NY, USA");

        Sale sale1 = new Sale(receipt1, SaleStatus.DRAFT);

    }
}
