package day6_dsa;

public class Linkedlist {
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
            return;
        }
        Ll temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=nnode;
        temp.next.data=data;
    }
    void display(){
        Ll temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

}

