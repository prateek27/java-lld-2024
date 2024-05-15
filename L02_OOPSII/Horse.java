package L02_OOPSII;

import L01_OOPS.Animal;

public class Horse extends Animal {
    public void speak(){
        System.out.println("Horse...Mehhh...");
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
