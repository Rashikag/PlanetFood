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
public class Orders {
    private String ordId;
    private String ordDate;
    private double gst;
    private double gstAmount;
    private double discount;
    private double ordAmount;
    private double grandTotal;
    private String userId;

    

    public void setOrdId(String ordId) {
        this.ordId = ordId;
    }

    public void setOrdDate(String ordDate) {
        this.ordDate = ordDate;
    }

    public void setGst(double gst) {
        this.gst = gst;
    }

    public void setGstAmount(double gstAmount) {
        this.gstAmount = gstAmount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setOrdAmount(double ordAmount) {
        this.ordAmount = ordAmount;
    }

    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOrdId() {
        return ordId;
    }

    public String getOrdDate() {
        return ordDate;
    }

    public double getGst() {
        return gst;
    }

    public double getGstAmount() {
        return gstAmount;
    }

    public double getDiscount() {
        return discount;
    }

    public double getOrdAmount() {
        return ordAmount;
    }

    public double getGrandTotal() {
        return grandTotal;
    }

    public String getUserId() {
        return userId;
    }
    
    
}
