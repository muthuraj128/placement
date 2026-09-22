package day9_dsa;
import java.util.*;
public class Stackrangeprime {
        public static void main(String[] args){
        Node obj=new Node();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int count=0;
        for(int i=a;i<=b;i++){
            for(int j=a;j<=b;j++){
                if(i%j==0){
                    count=count+1;
                }
            }
            if(count==2){
                obj.push(i);
            }
            count=0;
        } 
        obj.display();
    }
}


class Node{
        Node next;
        Node pre;
        Node top;
        int data;
        int ec;
        int oc;
        void push(int a)
        {
            Node newnode=new Node();
            if(isEmpty()){
                newnode.data=a;
                top=newnode;
                return;
            }
            newnode.data=a;
            top.pre=newnode;
            newnode.next=top;
            top=newnode;
        }
        boolean isEmpty(){
            return top==null;
        }
        void pop()
        {
            if(isEmpty()){
                System.out.println("Stack is empty");
            }
            int res=top.data;
            top=top.next;
        }
        void peek()
        {
            int peek=top.data;
            System.out.println(peek);
        }

        void display()
        {
            Node temp=top;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
            System.out.println();
        }

}
   