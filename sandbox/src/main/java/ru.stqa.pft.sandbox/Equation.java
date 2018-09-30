package ru.stqa.pft.sandbox;

public class Equation extends MyFirstProgram {
    private double a;
    private double b;
    private double c;

    private int x;

    public Equation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

        a = 4;
        b = 5;
        c = 1;

        double d = b * b - 4 * a * c;

        if (a == 0) {                // если а = 0  уравнение з квадратного  будет решаться по линейному,
                                     // а линейне решаеться по другим правилам
            System.out.println("это вырожденное уравнение");
        }

        if (d > 0) {
            x = 2;                       // x1 і x2 ийде, одне з + ,друге з -
            System.out.println(d);
        } else {
            if (d == 0) {                // x число вийде
                x = 1;
                System.out.println(d);
            } else {
                x = 0;
                System.out.println(d);    // d<0 не можливо, тому n = 0;
            }
        }
    }

    public int rootNumber() {
        return x;
    }
}