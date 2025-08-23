public class Composition {
    public static void main(String[] args){
        // Composition = represents a part of a relationship between objects
        //          example - an engine is a 'part of' a car
        //  allows complex objects to be constructed from smaller objects

    Car car = new Car("corvette", 2025, "V8");

        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine.type);

        car.start();




    }
}
