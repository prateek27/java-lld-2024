package L04_OOPSIV.InterfaceDemo2;

public class Picture implements Drawable {
    String name;
    Picture(String name){
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a pic of "+this.name);
    }
}
