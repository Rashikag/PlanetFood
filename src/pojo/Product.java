/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

/**
 *
 * @author Rashika
 */
public class Product {
    private String prod_id;
    private String cat_id ;
    private String prod_name;
    private double price;
    private String active;

    public void setProd_id(String prod_id) {
        this.prod_id = prod_id;
    }

    public void setCat_id(String cat_id) {
        this.cat_id = cat_id;
    }

    public void setProd_name(String prod_name) {
        this.prod_name = prod_name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getProd_id() {
        return prod_id;
    }

    public String getCat_id() {
        return cat_id;
    }

    public String getProd_name() {
        return prod_name;
    }

    public double getPrice() {
        return price;
    }

    public String getActive() {
        return active;
    }
    
    
}
