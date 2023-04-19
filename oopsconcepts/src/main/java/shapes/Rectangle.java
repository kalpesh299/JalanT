package shapes;

import abstraction.Shape;

public class Rectangle extends Shape {
    private Double length;
    private Double width;

    public Rectangle(Double length,Double width){
        this.length=length;
        this.width=width;
    }

    @Override
    public Double area() {
        return length * width;
    }
}
