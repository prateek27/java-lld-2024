package L09_Generics;
// here in this T can be Number or any child classes of Number
public class NumberBox<T extends Number> {
    T number;

    NumberBox(T number){
        this.number = number;
    }

    public T getNumber(){
        return this.number;
    }

    @Override
    public String toString() {
        return "NumberBox{" +
                "number=" + number +
                '}';
    }
}
