package builder;

import buildings.*;

public class CarManualBuilder implements Builder {
    private Manual manual;
    public CarManualBuilder(){
        this.reset();
    }
    @Override
    public void reset() {
        this.manual=new Manual();
    }

    @Override
    public void setSeats(int numberOfSeats) {
        manual.setNumberOfSeats(numberOfSeats);
    }

    @Override
    public void setEngine(String engine) {
        manual.setEngine(engine);
    }

    @Override
    public void setTripComputer(boolean tripComputer) {
        manual.setTripComputer(tripComputer);
    }

    @Override
    public void setGPS(boolean GPS) {
        manual.setGPS(GPS);
    }

    public Manual getProduct(){
        Manual product=this.manual;
        this.reset();
        return product;
    }
}
