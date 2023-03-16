/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.customer.hoby.tpcustomerhoby.jsf;

import com.customer.hoby.tpcustomerhoby.ejb.CustomerManager;
import com.customer.hoby.tpcustomerhoby.entities.Customer;
import jakarta.ejb.EJB;  
import jakarta.inject.Named;  
import jakarta.faces.view.ViewScoped;  
import java.io.Serializable;  
import java.util.List;  

/**
 *
 * @author Hoby
 * Backing bean de la page customerList.xhtml.
 */
@Named(value = "customerBean")
@ViewScoped
public class CustomerBean implements Serializable {
    private List<Customer> customerList;  

    @EJB
    private CustomerManager customerManager;  
  
    public CustomerBean() {
    }
    
    /**
     * Retourne la liste des clients pour affichage dans une DataTable.
     * @return List
     */
    public List<Customer> getCustomers() {
        if (customerList == null) {
          customerList = customerManager.getAllCustomers();
        }
        return customerList;
     }  
    
}
