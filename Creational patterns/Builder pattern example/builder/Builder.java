package builder;

//The builder interface specifies methods for creating
//the different parts of the product
public interface Builder {
    public void reset();
    public void setSeats(int numberOfSeats);
    public void setEngine(String engine);
    public void setTripComputer(boolean tripComputer);
    public void setGPS(boolean GPS);
}
