package day7_dsa;

public class Circularlinkedlist {
    
}

class Cll{
    int data;
    Cll next;
    Cll head;
    void add(int data)
    {
        if(head==null)
        {
            Cll newnode=new Cll();
            head=newnode;
            head.data=data;
            return;
        }
        Cll temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        Cll newnode=new Cll();
        newnode.data=data;
        temp.next=newnode;
        newnode.pre=temp;
    }
    void display()
    {
        Cll temp=head;
        while(temp!=null){
            System.out.println();
            System.out.print(temp.data);
            temp=temp.next;
            
        }
    }
}