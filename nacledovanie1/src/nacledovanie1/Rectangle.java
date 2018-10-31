/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nacledovanie1;

public class Rectangle extends Squere{

protected double width;

Rectangle(double l, double w, String nameFigure)throws IllegalArgumentException

{

super(l,nameFigure);

if(l<=0)

throw new IllegalArgumentException("Ширина прямоугольника <=0");

if(w<=0)

throw new IllegalArgumentException("Длина прямоугольника <=0");

width=w;

}

@Override

public void S(){

S=length*width;

}

@Override

public void P(){

P=2*length+2*width;

}

}