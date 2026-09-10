package day4_String;

public class Sorting {
    public static void main(String[] args){
    String a="dcba";
    int l=a.length();
    char[] c= new char[l];
    for(int i=0;i<l;i++)
    {
        c[i]=a.charAt(i);
    }
    for(int i=0;i<l;i++)
    {
        for(int j=0;j<l;j++)
        {
            if((c[i])>=(c[j]))
            {
                continue;
            }
            else{
                char temp=c[i];
                c[i]=c[j];
                c[j]=temp;
            }
        }
    }
    System.out.println(c);
    
}
}