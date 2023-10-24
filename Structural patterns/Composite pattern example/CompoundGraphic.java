public class CompoundGraphic implements Graphic{
    Graphic[] children;
    public void add(Graphic child){

    }
    public void remove(Graphic child){

    }
    @Override
    public void move(double x, double y){
        for(Graphic child:children){
            child.move(x,y);
        }
    }

    @Override
    public void draw(){
        // 1. For each child component:
        //     - Draw the component.
        //     - Update the bounding rectangle.
        // 2. Draw a dashed rectangle using the bounding
        // coordinates.
    }
}
