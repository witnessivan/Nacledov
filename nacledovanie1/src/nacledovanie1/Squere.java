/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nacledovanie1;

public class Squere extends flat_geometric_shape{

protected double length;

public Squere (double l,String nameFigure)throws IllegalArgumentException

{

super(nameFigure);

if(l<0)

throw new IllegalArgumentException("Длина стороны квадрата <0");

if(l==0)

throw new IllegalArgumentException("Длина стороны квадрата =0");

this.length=l;

}

@Override

public void S(){

S=length*length;

}

@Override

public void P(){

P=4*length;

}

}