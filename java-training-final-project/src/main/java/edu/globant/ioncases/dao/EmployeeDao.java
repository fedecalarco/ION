/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.globant.ioncases.dao;

import edu.globant.ioncases.model.Employee;

/**
 *
 * @author fedec
 */
public interface EmployeeDao {

    void addEmployee(Employee employee);

    Employee getEmployee(Employee employee);

    Employee getEmployee(int id);
}
