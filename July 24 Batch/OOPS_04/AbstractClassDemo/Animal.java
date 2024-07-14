package OOPS_04.AbstractClassDemo;

public abstract class Animal{
    String name;
    int age;

    Animal(String name,int age){
        this.name = name;
        this.age = age;
    }

    abstract void makeSound();
    void eat(){
        System.out.println("Animal is eating");
    }
}

