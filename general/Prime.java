class Prime {
    public static void main(String[] args)
    {
    int count=0;
        for(int i=2;i<=20;i++)
        {  
            int a=1;
            for(int j=2;j<=i-1;j++)
            {
                
                if(i%j==0)
                {
                    a=0;
                }
            }
            if(a==1)
            {
                count=count+1;
            }
        }
        System.out.println(count);
    }
    
}
