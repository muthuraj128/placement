package day7_dsa;

public class Dllinsertatposition {
    public static void main(String[] args){
    Dll obj=new Dll();
    obj.add(10);
    obj.add(20);
    obj.add(30);
    obj.add(40);
    obj.add(50);
    obj.display();
    obj.insertAtposition(3,12);
    obj.display();
    obj.insertAtposition(5,18);
    obj.display();
    }
}

class Dll {
    int data;
    Dll next;
    Dll pre;
    Dll head;
    int count=1;
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
    void insertAtposition(int a,int b){
        Dll temp=new Dll();
        temp=head;
        while(count!=a){
            temp=temp.next;
            count=count+1;
        }
        Dll newnode=new Dll();
        newnode.data=b;
        newnode.pre=temp.pre;
        newnode.next=temp;
        temp.pre.next=newnode;
        temp.pre=newnode;
        count=1;

    }
}

