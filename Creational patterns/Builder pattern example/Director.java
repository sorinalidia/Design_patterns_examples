public class Director {
    public void constructSportsCar(Builder builder){
        builder.reset();
        builder.setSeats(2);
        builder.setEngine("sport");
        builder.setTripComputer(true);
        builder.setGPS(true);
    }

    public void constructSUV(Builder builder){
        //..
    }
}
