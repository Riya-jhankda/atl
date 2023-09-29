public class DLL{
    
    //implemenation DLL
    
    public Node head;
    public int size;
    
    public DLL(){
        this.size=size;
    }
    
    public class Node{
        private int val;
        private Node next;
        private Node prev;
        
        public Node(int val){
            this.val=val;
        }
         public Node(int val, Node next, Node prev){
            this.val=val;
            this.next=next;
            this.prev=prev;
        }
    }
    public static void main(String[] args){
        DLL lil = new DLL();
        lil.insertBeg(23);
        lil.insertBeg(11);
        lil.insertBeg(2);
        lil.insertEnd(67);
        lil.insertEnd(15);
        lil.insert(2,5);
        lil.insert(4,9);
        lil.display();
        
    }
    // insert at beigning
    public void insertBeg(int val){
        
        Node node = new Node(val);
        
        if(head!=null){
            node.next=head;
            head.prev=node;
            head=node;
        }
        else{ 
            node.next=null;
            node.prev=null;
            head=node;
            
        }
        size++;
        return;
      
    }
    
    public void insertEnd(int val){
        
        Node node = new Node(val);
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        
        curr.next=node;
        node.prev=curr;
        size++;
        return;
    
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
    
    public void insert(int ind, int val){
        Node node=get(ind);
        Node m=new Node(val);
        
        m.next=node.next;
        node.next.prev=m;
        node.next=m;
        m.prev=node;
        size++;
        return;
        
          
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }
        System.out.print("null");
    }
    
}
