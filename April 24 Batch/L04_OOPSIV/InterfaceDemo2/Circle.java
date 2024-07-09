package L04_OOPSIV.InterfaceDemo2;

public class Circle extends Shape implements Drawable {
    int radius;
    Circle(int r){
        radius = r;
    }
    float getArea(){
        return (float)Math.PI*radius*radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }
}
