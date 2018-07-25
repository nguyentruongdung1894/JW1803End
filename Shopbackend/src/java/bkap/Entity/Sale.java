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
public class Sale {

    private int saleid;
    private Date dateInput;
    private Date dateOutput;
    private int levelSale;

    public Sale(int saleid, Date dateInput, Date dateOutput, int levelSale) {
        this.saleid = saleid;
        this.dateInput = dateInput;
        this.dateOutput = dateOutput;
        this.levelSale = levelSale;
    }

    public Sale() {
    }

    public int getSaleid() {
        return saleid;
    }

    public void setSaleid(int saleid) {
        this.saleid = saleid;
    }

    public Date getDateInput() {
        return dateInput;
    }

    public void setDateInput(Date dateInput) {
        this.dateInput = dateInput;
    }

    public Date getDateOutput() {
        return dateOutput;
    }

    public void setDateOutput(Date dateOutput) {
        this.dateOutput = dateOutput;
    }

    public int getLevelSale() {
        return levelSale;
    }

    public void setLevelSale(int levelSale) {
        this.levelSale = levelSale;
    }

}
