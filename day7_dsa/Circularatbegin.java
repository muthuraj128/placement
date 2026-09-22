package day7_dsa;

public class Circularatbegin {
    public static void main(String[] args){
        Ll obj=new Ll();
        obj.addatend(10);
        obj.addatend(20);
        obj.addatend(30);
        obj.addatend(40);
        obj.display();
    }
}

class Ll{
    int data;
    Ll next;
    Ll head;
    void addatend(int data){
        Ll nnode=new Ll();
        if(head==null)
        {
            head=nnode;
            head.data=data;
            head.next=head;
            return;
        }
        Ll temp=head;
        while(temp.next!=head)
        {
            temp=temp.next;
        }
        temp.next=nnode;
        nnode.next=head;
        nnode.data=data;
        head=nnode;
    }
    void display(){
        Ll temp=head;
        do
        {
            System.out.println(temp.data);
            temp=temp.next;    
        }while(temp!=head);
    }
}
