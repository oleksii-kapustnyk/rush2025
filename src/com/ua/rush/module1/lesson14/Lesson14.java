package com.ua.rush.module1.lesson14;

public class Lesson14 {

    public static void main(String[] args) {
//        Parent p = new Parent();
//        p.a = 6;
//        Parent.b = 7;
//        System.out.println(Parent.b);
//        p.b = 8;
//        System.out.println(p.b);
//
//        p.someMethod();
//        p.someStaticMethod(); //incorrect
//        Parent.someStaticMethod(); //correct

//        Car c = new Car();
//
//        Car.Engine engine = c.new Engine("V6", 3.8);
//        System.out.println(engine);
//
//        c.setName("BMW");
//        c.setEngine(engine);
//        System.out.println(c);
//
//        Car.Transmission ct = new Car.Transmission();
//        Car.Transmission.Gear ctg = new Car.Transmission.Gear(5, 6.7);
//        c.setTransmission(ct);

//        Car.Engine engine = new Car.Engine("V6", 3.8);
//
//        Parent p1 = new Parent();
////        Parent p2 = new Parent(5);
//        Parent c1 = new Child();
//        System.out.println();
//        Child c2 = new Child(5, 6);
////        Child.someStaticMethod();
//        p1.someStaticMethod();
//        c1.someStaticMethod();
//        System.out.println();
//        p1.someMethod();
//        c1.someMethod();

        Figure f1 = new Square(5);
        Figure f2 = new Rectangle(5, 6);
        Figure f3 = new Circle(5);
//        System.out.println(f1.area());
//        System.out.println(f2.area());
//        System.out.println(f3.area());
//
//        System.out.println(f1);
//        System.out.println(f2);
//        System.out.println(f3);

        Figure[] figures = {f1, f2, f3};
        for (int i = 0; i < figures.length; i++) {
            printFigure(figures[i]);
        }



    }

    public static void printFigure(Figure figure) {
        System.out.println(figure);
    }


}
