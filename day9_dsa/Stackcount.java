package day9_dsa;

public class Stackcount {
    public static void main(String[] args){
        Node obj=new Node();
        obj.push(10);   
        obj.push(20); 
        obj.push(30); 
        obj.push(40); 
        obj.push(50);
        obj.display();
        obj.count();
    }
}
class Node{
        Node next;
        Node pre;
        Node top;
        int data;
        int count=0;
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
        void count()
        {
            Node temp=top;
            while(temp!=null){
                temp=temp.next;
                count=count+1;
            }
            System.out.println(count);
            System.out.println();
        }
    }
    