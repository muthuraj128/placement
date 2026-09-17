package day9_dsa;

public class Stack {
    public static void main(String[] args){
        Node obj=new Node();
        Node ob=new Node();
        obj.push(10);   
        obj.push(20); 
        obj.push(30); 
        obj.push(40); 
        obj.push(50);
        obj.display();
        obj.reverse();
        obj.display();
    }
}
class Node{
        Node next;
        Node pre;
        Node top;
        int data;
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
        void reverse()
        {
            Node temp=top;
            while(temp.next!=null){
                temp=temp.next;
            }
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.pre;
            }
            System.out.println();
        }
    }
    