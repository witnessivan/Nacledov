/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nacledovanie1;

import java.math.BigDecimal;

public class flat_geometric_shape {

protected String nameFigure;

protected double S;

protected double P;

public flat_geometric_shape(){

S=0.00;

P=0.00;

this.nameFigure=new String("");

}

public flat_geometric_shape(String nameFigure) throws IllegalArgumentException

{

if(nameFigure.equals(""))

throw new IllegalArgumentException("Нет имени у фигуры");

S=0.00;

P=0.00;

this.nameFigure=new String(nameFigure);

}

public double getS() {

return S;

}

public double getP() {

return P;

}

public void P() {

P=0.0;

}

public void S() {

S=0.0;

}

public void setNameFigure(String nameFigure) {

this.nameFigure=nameFigure;

}

public String getNameFigure(){

return this.nameFigure;

}

}