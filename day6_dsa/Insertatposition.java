public class Deleteatend {
    public static void main(String[] args){
        Ll obj=new Ll();
        obj.addatend(10);
        obj.addatend(20);
        obj.addatend(30);
        obj.addatend(40);
        obj.display();
        obj.insertatposition(2,80);
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

    void deleteatend()
    {
        Ll temp=head;
        System.out.println();
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;

    }
    void insertatposition(int a,int b){
        Ll temp=head;
        for(int i=1;i<(a-1);i++){
            temp=temp.next; 
        }
        Ll newnode=new Ll();
        newnode.next=temp.next;
        newnode.data=b;
        temp=newnode;

    }
    void display(){
        Ll temp=head;
        System.out.println();
        while(temp!=null){
            int count=1;
            System.out.println(count+" "+temp.data);
            temp=temp.next;
            count=count+1;
        }
    }
}