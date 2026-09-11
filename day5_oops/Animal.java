package day5_oops;

public class Animal {
    void sound()
    {
        System.out.println("Howls");
    }
    public static void main(String[] args){
        Animal obj=new Animal();
        Dog obj1=new Dog();
        Cat obj2=new Cat();
        obj.sound();
        obj1.sound();
        obj2.sound();
        
    }
}

class Dog extends Animal
{
    void sound()
    {
        System.out.println("Dog barks");
    }
}

class Cat extends Dog
{
    void sound()
    {
        System.out.println("Cat Meows");
        super.sound();
    }
}

