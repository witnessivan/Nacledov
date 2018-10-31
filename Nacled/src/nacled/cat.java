/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nacled;

/**
 *
 * @author IVC1-4
 */
public class cat extends animal{
 
    private String color;
 
    public cat(boolean veg, String food, int legs) {
        super(veg, food, legs);
        this.color="White";
    }
 
    public cat(boolean veg, String food, int legs,String color){
        super(veg, food, legs);
        this.color=color;
    }
 
    public String getColor() {
        return color;
    }
 
    public void setColor(String color) {
        this.color = color;
    }
}