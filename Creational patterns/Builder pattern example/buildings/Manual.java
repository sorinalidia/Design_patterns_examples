package buildings;

public class Manual {
    //each car should have a user manual that corresponds to
    //the car's configuration and describes all its features
    private int numberOfSeats;
    private String engine;
    private boolean tripComputer;
    private boolean GPS;

    public void setEngine(String engine){
        this.engine=engine;
    }

    public void setNumberOfSeats(int numberOfSeats){
        this.numberOfSeats=numberOfSeats;
    }
    public void setTripComputer(boolean tripComputer){
        this.tripComputer=tripComputer;
    }

    public void setGPS(boolean GPS){
        this.GPS=GPS;
    }

    public String toString(){
        String tcCheck,GPScheck;
        if(this.tripComputer){
            tcCheck="Yes";
        }
        else {
            tcCheck = "No";
        }

        if(this.GPS){
            GPScheck="Yes";
        }
        else{
            GPScheck="No";
        }


        return ("Buildings.Car specifications:\n" +
                "number of seats: "+ this.numberOfSeats+"\n" +
                "engine type: " + this.engine+"\n" +
                "tripComputer: " + tcCheck+"\n" +
                "GPS: " + GPScheck);
    }
}
