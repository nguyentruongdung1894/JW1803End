/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkap.Entity;

import java.sql.Date;

/**
 *
 * @author ScorPius 31
 */
public class Order {
    private int id;
    private int idCustomer;
    private double quantity;
    private Date datebuy;
    private int idShip;
    private int idPay;
    private boolean status;

    public Order() {
    }

    
    public Order(int id, int idCustomer, double quantity, Date datebuy, int idShip, int idPay, boolean status) {
        this.id = id;
        this.idCustomer = idCustomer;
        this.quantity = quantity;
        this.datebuy = datebuy;
        this.idShip = idShip;
        this.idPay = idPay;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public Date getDatebuy() {
        return datebuy;
    }

    public void setDatebuy(Date datebuy) {
        this.datebuy = datebuy;
    }

    public int getIdShip() {
        return idShip;
    }

    public void setIdShip(int idShip) {
        this.idShip = idShip;
    }

    public int getIdPay() {
        return idPay;
    }

    public void setIdPay(int idPay) {
        this.idPay = idPay;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }   
}
