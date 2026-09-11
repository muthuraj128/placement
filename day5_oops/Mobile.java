package day5_oops;

public class Mobile {
    String name;
    int price;
    
    Mobile(String a,int b)
    {
        name=a;
        price=b;
    }
    public static void main(String[] args)
    {

        Mobile obj=new Mobile("Samsung",20000);
    }
}

