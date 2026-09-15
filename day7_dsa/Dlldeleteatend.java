package day7_dsa;

public class Dlldeleteatend {
    public static void main(String[] args){
    Dll obj=new Dll();
    obj.add(10);
    obj.add(20);
    obj.add(30);
    obj.add(40);
    obj.add(50);
    obj.display();
    obj.delete();
    obj.display();
    obj.delete();
    obj.display();
    }
}
class Dll {
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
        while(temp.next!=null){
            temp=temp.next;
        }
        Dll newnode=new Dll();
        newnode.data=data;
        temp.next=newnode;
        newnode.pre=temp;
    }

    void display()
    {
        Dll temp=head;
        while(temp!=null){
            System.out.println();
            System.out.print(temp.data);
            temp=temp.next;
        }
        System.out.println();
    }
    void delete()
    {
        Dll temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp=temp.pre;
        temp.next=null;
    }
}

