package day5_oops;

class Child extends Parent{
    void sub(int a,int b)
    {
        System.out.println(a-b);   
    }
}

class Grandchild extends Child{
    void div(int a,int b)
    {
        System.out.println(a/b);   
    }
}

public class Parent {
    void add(int a,int b)
    {
        System.out.println(a+b);
    }
    public static void main(String[] args)
    {
        Grandchild n=new Grandchild();
        n.add(10,10);
        n.sub(10,10);
        n.div(10,10);
    }
}

