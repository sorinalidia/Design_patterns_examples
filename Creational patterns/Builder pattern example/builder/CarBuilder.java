package builder;
//The concrete builder classes follow the builder interface
//and provide specific implementations of the building steps.
//Your program may have several variations of builders, each
//implemented differently.

import buildings.*;
public class CarBuilder implements Builder {
    private Car car;
    public CarBuilder(){
        this.reset();
    }
    @Override
    public void reset(){
        this.car=new Car();
    }
    @Override
    public void setSeats(int numberOfSeats){
        car.setNumberOfSeats(numberOfSeats);
    }

    @Override
    public void setEngine(String engine) {
        car.setEngine(engine);
    }

    @Override
    public void setTripComputer(boolean tripComputer){
        car.setTripComputer(tripComputer);
    }

    @Override
    public void setGPS(boolean GPS) {
        car.setGPS(GPS);
    }
    public Car getProduct(){
        Car product=this.car;
        this.reset();
        return product;
    }
}
