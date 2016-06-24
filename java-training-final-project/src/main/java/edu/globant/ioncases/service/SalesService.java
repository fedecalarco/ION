/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.globant.ioncases.service;

import edu.globant.ioncases.model.Customer;
import edu.globant.ioncases.model.OrderSale;
import edu.globant.ioncases.model.Seller;





/**
 *
 * @author federico.calarco
 */
public interface SalesService {
    public void addSale(Customer customer, Seller seller, OrderSale orderSale);
}
