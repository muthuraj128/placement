package day8_dsa;

public class Dcllinsertatposition {
    public static void main(String[] args){
    Dll obj=new Dll();
    obj.add(10);
    obj.add(20);
    obj.add(30);
    obj.add(40);
    obj.add(50);
    obj.display();
    obj.insertatposition(1,100);
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
            head.next=head;
            head.pre=head;
            return;
        }
        Dll temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        Dll newnode=new Dll();
        newnode.data=data;
        temp.next=newnode;
        newnode.pre=temp;
        newnode.next=head;
        head.pre=newnode;
    }
    void insertatposition(int a,int data){
        Dll temp=head;
        while(count!=a){
            temp=temp.next;
            count=count+1;
        }
        Dll newnode=new Dll();
        newnode.data=data;
        temp.pre.next=newnode;
        newnode.pre=temp.pre;
        newnode.next=temp;
        temp.pre=newnode;
        if(a==1){
            head=newnode;
        }
        
    }
    void display(){
        Dll temp=head;
        do
        {
            System.out.println(temp.data);
            temp=temp.next;    
        }while(temp!=head);
        System.out.println();
    }
}

