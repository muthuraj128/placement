package day10_dsa;

public class Queue {
    public static void main(String[] args){
        Qu obj=new Qu();
        obj.enQ(10);
        obj.enQ(20);
        obj.enQ(30);
        obj.enQ(40);
        obj.enQ(50);
        obj.display();
    }
    
}

class Qu{
    int data;
    Qu front;
    Qu rear;
    Qu next;
    void enQ(int a){
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
    int peek()
    {
        if(front==null){
            return -1;
        }
        return front.data;
    }
    void display(){
        Qu temp=front;
        while(temp!=null) {
            System.out.println(temp.data);
            temp=temp.next;
        }
              
    }

}