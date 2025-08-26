public class Car {
    int year;
    String model;
    Engine engine;

    Car(String model, int year, String engineType){
        this.year = year;
        this.model = model;
        this.engine = new Engine(engineType);
    }

    void start(){
        this.engine.start();
        System.out.println("The " + this.model + "running");
    }

}
