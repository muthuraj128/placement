package Array;
import java.util.*;
public class Distinct {
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int[] arr=new int[a];
    int count=1;
    for (int i=0;i<a;i++)
    {
      arr[i]=sc.nextInt();
    }
    
    for(int j=0;j<a;j++){
      for (int i=j+1;i<a;i++)
    {
      if(arr[j]==arr[i])
      {
        count=count+1;
      }  
    }
}

    System.out.println(a-count+1);
  }
}

