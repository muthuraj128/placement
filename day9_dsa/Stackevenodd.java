package day9_dsa;

public class Stackevenodd {
    public static void main(String[] args){
        Node obj=new Node();
        obj.push(10);   
        obj.push(20); 
        obj.push(30); 
        obj.push(40); 
        obj.push(50);
        obj.display();
        obj.eo();
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
        void eo()
        {
            Node temp=top;
            while(temp!=null){
                if(temp.data%2==0){
                    ec=ec+1;
                }
                else{
                    oc=oc+1;
                }
                temp=temp.next;
            }
            System.out.println("Even: "+ec);
            System.out.println("Odd: "+oc);
        }
    }
   