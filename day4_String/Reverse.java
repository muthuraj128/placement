package day4_String;

public class Reverse {
    public static void main(String[] args){
    String a= new String("Muthuraj");
    int b= a.length();
    String c="";
    for(int i=b-1;i>=0;i--)
    {
        c=c+a.charAt(i);
    }
    System.out.println(c);
}
}
