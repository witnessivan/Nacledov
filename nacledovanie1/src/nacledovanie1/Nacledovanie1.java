/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nacledovanie1;
import java.util.Scanner;

/**
 *
 * @author IVC1-4
 */
public class Nacledovanie1 {

public static flat_geometric_shape figure1=new flat_geometric_shape();

public static flat_geometric_shape figure2;

public static String nameFigure;

public static Squere Sq;

public static Rectangle Rect;

public static boolean t=true;

public static void main(String[] args) {

String s;

while(t)

{

Processing_Base_class();

if (figure2!=null)

{

switch(s=figure2.getNameFigure())

{

case "Squere":

Processing_Squere_class();

figure2.setNameFigure("");

break;

case "Rectangle":

Processing_Rectangle_class() ;

break;

case "Quit":t=false;

break;

}

}

}

}

public static void Processing_Base_class() {

System.out.println("Введите название фигуры : Squere или Rectangle или Quit");

Scanner newin=new Scanner(System.in);

nameFigure=new String(newin.nextLine());

try

{

figure2=new flat_geometric_shape(nameFigure);

}

catch (IllegalArgumentException e)

{

System.out.println(e);

}

}

public static void Processing_Squere_class() {

System.out.println("Введите длину стороны квадрата");

Scanner newin=new Scanner(System.in);

double length=newin.nextDouble();

try{

Sq=new Squere(length,nameFigure);

Sq.P();

Sq.S();

System.out.println(Sq.getNameFigure()+" Площадь ="+Sq.getS()+"Периметр="+Sq.getP());

}

catch(IllegalArgumentException e)

{

System.out.println(e);

}

}

public static void Processing_Rectangle_class() {

System.out.println("Введите ширину прямоугольника");

Scanner newin=new Scanner(System.in);

double width=newin.nextDouble();

System.out.println("Введите длину прямоугольника");

double length=newin.nextDouble();

try{

Rect=new Rectangle(width,length, nameFigure);

Rect.P();

Rect.S();

System.out.println(Rect.getNameFigure()+" Площадь ="+Rect.getS()+"Периметр="+Rect.getP());

}

catch(IllegalArgumentException e)

{

System.out.println(e);

}

}

}



