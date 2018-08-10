/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkap.Entity;

/**
 *
 * @author ScorPius 31
 */
public class Ship {
    private int idShip;
    private String nameShip;
    private int phone;
    private int distance;
    private double price;
    private boolean bit;

    public Ship() {
    }

    public Ship(int idShip, String nameShip, int phone, int distance, double price, boolean bit) {
        this.idShip = idShip;
        this.nameShip = nameShip;
        this.phone = phone;
        this.distance = distance;
        this.price = price;
        this.bit = bit;
    }

    public int getIdShip() {
        return idShip;
    }

    public void setIdShip(int idShip) {
        this.idShip = idShip;
    }

    public String getNameShip() {
        return nameShip;
    }

    public void setNameShip(String nameShip) {
        this.nameShip = nameShip;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isBit() {
        return bit;
    }

    public void setBit(boolean bit) {
        this.bit = bit;
    }
    
    
}
