public class Dot implements Graphic{
    double x;
    double y;
    public Dot(double x, double y){
        this.x=x;
        this.y=y;
    }
    @Override
    public void move(double x, double y){
        this.x += x;
        this.y += y;
    }

    @Override
    public void draw(){

    }
}
