package contract;

import builder.*;
import buildings.*;

public class Application {
    public void makeCar(){
        Director director=new Director();

        CarBuilder builder=new CarBuilder();
        director.constructSportsCar(builder);
        Car car=builder.getProduct();
        System.out.println(car.buildCheck());

        CarManualBuilder builder1=new CarManualBuilder();
        director.constructSportsCar(builder1);

        Manual manual=builder1.getProduct();
        System.out.println(manual.toString());
    }
}
