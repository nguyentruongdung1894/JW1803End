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
public class Comment {
    private int idCustomer;
    private int idProduct;
    private String nameProduct;
    private String nameCustomer;
    private String content;
    private Date dateComment;
    private boolean status;

    public Comment() {
    }

    public Comment(int idCustomer, int idProduct, String nameProduct, String nameCustomer, String content, Date dateComment, boolean status) {
        this.idCustomer = idCustomer;
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.nameCustomer = nameCustomer;
        this.content = content;
        this.dateComment = dateComment;
        this.status = status;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDateComment() {
        return dateComment;
    }

    public void setDateComment(Date dateComment) {
        this.dateComment = dateComment;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
