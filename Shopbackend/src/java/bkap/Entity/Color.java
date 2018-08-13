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
public class Color {
    private int id;
    private String nameColor;
    private boolean status;

    public Color() {
    }

    public Color(int id, String nameColor, boolean status) {
        this.id = id;
        this.nameColor = nameColor;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameColor() {
        return nameColor;
    }

    public void setNameColor(String nameColor) {
        this.nameColor = nameColor;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
