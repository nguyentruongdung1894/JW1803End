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
    private int saleId;
    private Date dateInput;
    private Date dateOutput;
    private int levelSale;

    public Sale() {
    }

    public Sale(int saleId, Date dateInput, Date dateOutput, int levelSale) {
        this.saleId = saleId;
        this.dateInput = dateInput;
        this.dateOutput = dateOutput;
        this.levelSale = levelSale;
    }

    public int getSaleId() {
        return saleId;
    }

    public void setSaleId(int saleId) {
        this.saleId = saleId;
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
