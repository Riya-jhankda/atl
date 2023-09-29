// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class CLL{
    
    //implemenation DLL
    
    public Node head;
    public Node tail;
    public int size;
    
    public CLL(){
        this.size=size;
    }
    
    public class Node{
        private int val;
        private Node next;
        
        
        public Node(int val){
            this.val=val;
        }
         public Node(int val, Node next){
            this.val=val;
            this.next=next;
        }
    }
    public static void main(String[] args){
        CLL lil = new CLL();
        lil.insertB(56);
        lil.insertB(6);
        lil.insertB(5);
        lil.insertB(3);
        lil.insertB(45);
        lil.del(2);
        lil.display();
    }
    
    public void insertB(int val){
        Node node=new Node(val);
        if(head==null){
            head=node;
            head.next=node;
            tail=head;
        }
        else{
            node.next=head;
            head=node;
            tail.next=node;
        }
        size++;
        return;
    }
    public void display(){
        Node temp=head;
        while(temp!=tail){
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }
        System.out.print(temp.val+" -> ");
        System.out.print("head");
    }
    
    public Node get(int ind){
        if(ind>size){
            return null;
        }
        Node temp=head;
        for(int i=0;i<ind-1;i++){
            temp=temp.next;
            
        }
        return temp;
    }
    
    //delete
    
      public void del(int ind){
        Node node= get(ind);
        
        node.next=node.next.next;
        size--;
        return;
     }

    
}
