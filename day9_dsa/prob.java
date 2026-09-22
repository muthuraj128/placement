package day9_dsa;

public class prob {
    public static void main(String[] args){
    int value=750;
    int temp;
    int level=0;
    int levelup=1;
    int levelupv=0;
    while(value>0){
        temp=value;
        value=value-(levelupv+(levelup*100));
        if(value<0){
            System.out.println(level);
            System.out.println(temp);
            break;
        }
        levelup=levelup+1;
        level+=1;

    }
    }
}
