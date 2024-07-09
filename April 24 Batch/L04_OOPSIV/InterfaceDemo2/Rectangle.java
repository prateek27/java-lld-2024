package L04_OOPSIV.InterfaceDemo2;

public class Rectangle extends Shape implements Drawable {
    int l;
    int b;

    Rectangle(int l,int b){
        this.l = l;
        this.b = b;
    }

    float getArea(){
        return (float)l*b;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle of size " + this.l +" ," + this.b);
    }
}
