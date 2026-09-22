package day10_dsa;

import java.util.Scanner;

public class Queusefirstunique {
        public static void main(String[] args){
        Qu obj=new Qu();
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        for(int i=0;i<a.length();i++){
                obj.enQ(a.charAt(i));
        }
        obj.display();
        obj.check();
    }
}


class Qu{
    char data;
    Qu front;
    Qu rear;
    Qu next;
    int count=0;
    void enQ(char a){
        Qu newnode=new Qu();
        if(front==null){
            newnode.data=a;
            front=newnode;
            rear=newnode;
        }
        newnode.data=a;
        rear.next=newnode;
        rear=newnode;
    }
    void deQ()
    {
        front=front.next;
    }
    char peek()
    {
        return front.data;
    }
    void display(){
        Qu temp=front;
        while(temp!=null) {
            System.out.println(temp.data);
            temp=temp.next;
        }
              
    }
    void check(){
        int c=0;
        Qu temp=front;
        while(temp!=null){
            Qu check=front;
        while(check!=null){
            if(temp.data==check.data){
                c=c+1;
            }
            check=check.next;
        }
        if(c==1){
            System.out.println("First non repeating String index "+count);
            break;
        }
        else{
            c=0;
        }
        if(c==1){
            break;
        }
        else{
        temp=temp.next;
        count=count+1;
        }
        }
        
    }

}