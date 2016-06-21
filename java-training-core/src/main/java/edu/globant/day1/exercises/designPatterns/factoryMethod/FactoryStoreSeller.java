/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.globant.day1.exercises.designPatterns.factoryMethod;

import edu.globant.day1.exercises.designPatterns.Entity.Seller;
import edu.globant.day1.exercises.designPatterns.Entity.StoreSeller;



/**
 *
 * @author fedec
 */
public class FactoryStoreSeller implements FactorySeller{

    @Override
    public Seller getSeller() {

        return new StoreSeller();
    }
    
}
