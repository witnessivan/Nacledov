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
public class animal {
 
    private boolean vegetarian;
 
    private String eats;
 
    private int noOfLegs;
 
    public animal(){}
 
    public animal(boolean veg, String food, int legs){
        this.vegetarian = veg;
        this.eats = food;
        this.noOfLegs = legs;
    }
 
    public boolean isVegetarian() {
        return vegetarian;
    }
 
    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }
 
    public String getEats() {
        return eats;
    }
 
    public void setEats(String eats) {
        this.eats = eats;
    }
 
    public int getNoOfLegs() {
        return noOfLegs;
    }
 
    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }
}
