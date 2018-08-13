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
public class Size {
    private int id;
    private String nameSize;
    private boolean status;

    public Size() {
    }

    public Size(int id, String nameSize, boolean status) {
        this.id = id;
        this.nameSize = nameSize;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameSize() {
        return nameSize;
    }

    public void setNameSize(String nameSize) {
        this.nameSize = nameSize;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
