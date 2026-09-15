package day7_dsa;


public class 
public class Dll {
    int data;
    Dll next;
    Dll pre;
    Dll head;
    void add(int data)
    {
        if(head==null)
        {
            Dll newnode=new Dll();
            head=newnode;
            head.data=data;
            return;
        }
        Dll temp=head;
        Dll newnode=new Dll();
        temp.next=newnode;
        newnode.pre=temp;
    }
    void display()
    {
        Dll temp=head;
        while(temp!=null){
            System.out.println();
            temp=temp.next;
        }
    }
}

