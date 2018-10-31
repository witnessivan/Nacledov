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
public class Nacled {
 
    public static void main(String[] args) {
        cat Cat = new cat(false, "milk", 4, "black");
 
        System.out.println("Cat is vegetaring?" + Cat.isVegetarian());
        System.out.println("Cat eats " + Cat.getEats());
        System.out.println("Cat has " + Cat.getNoOfLegs() + " legs.");
        System.out.println("Cat color is " + Cat.getColor());
    }
 
}