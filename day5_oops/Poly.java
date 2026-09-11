package day5_oops;
public class Poly {
    public static void main(String[] args)
    {
        Muthu2 obj=new Muthu2();
        obj.sum(10,20);
        obj.sum(20,30,10);
        obj.sum(30.0,10.0);
    }
}

class Muthu
{
    void sum(int a,int b)
    {
        System.out.println(a+b);
    }
}

class Muthu1 extends Muthu
{
    void sum(int a,int b,int c)
    {
        System.out.println(a*b*c);
    }
}

class Muthu2 extends Muthu1
{
    void sum(double a,double b)
    {
        System.out.println(a-b);
    }
}