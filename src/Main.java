import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;
public class Main {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args){

        System.out.println("What shape would you like to calculate the area for?");
        String reply = keyboard.nextLine();
        String shape = reply.toLowerCase();
        switch(shape){
            case "circle":
                System.out.println("What is the radius?");
                double r = keyboard.nextInt();
                getCircleArea(r);
                break;
            case "triangle":
                System.out.println("What is the base?");
                double b = keyboard.nextInt();
                System.out.println("What is the height?");
                double h = keyboard.nextInt();
                getTriangleArea(b,h);
                break;
            case "rectangle":
                System.out.println("What is the length?");
                double l = keyboard.nextInt();
                System.out.println("What is the width?");
                double w= keyboard.nextInt();
                getRectArea(l,w);
                break;
            case "square":
                System.out.println("What is the length?");
                double s = keyboard.nextInt();
                getSquareArea(s);
                break;

        }



    }
    private static void getCircleArea(double r){
        double area = 3.14 * r * r;
        System.out.println("Area of circle is: " + area);
    }

    private static void getTriangleArea(double b, double h){
        double area = .5 * b * h;
        System.out.println("Area of triangle is: " + area);
    }

    private static void getRectArea(double x, double y){
        double area = x * y;
        System.out.println("Area of rectangle is: " + area );
    }

    private static void getSquareArea(double x){
        double area = x * x;
        System.out.println("Area of square is: " + area);
    }


}
