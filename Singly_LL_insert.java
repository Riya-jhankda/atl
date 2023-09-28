public class LL{
  //Implemenatation part begins here,
    private int size;
    private Node head;
    private Node tail;
    
    public LL(){
        this.size=size;
    }
    
    public static class Node{
        int val;
        Node next;
        
        public Node(int val){
            this.val=val;
        }
        public Node(int val,Node next){
            this.val=val;
            this.next=next;
        }
        
    }
  
    
    public static void main(String[] args){
        //creating node 1st 
        LL list= new LL();
        list.InsertF(2);
        list.InsertF(23);
        list.InsertF(3);
        list.InsertL(34);
        list.Insert(22,3);
        list.Insert(67,5);
        System.out.println(list.size);
        list.display();
        
        
        
    }
     //creating node 1st and updating the ll 
    public void create(int val){
        
        Node node = new Node(val);
        
        if(head==null){
            node.next=null;
            head=node;
            size++;
        }
        return;
      
    }
    
    //insert first
    public   void InsertF(int val){
        if(head==null){
            create(val);
            return;
        }
        
        Node node = new Node(val);
        
        node.next=head;
        head=node;
        size++;
        return;
    }
    
    //display func
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }
        System.out.print("null");
    }
    
    //insert last 
    public void InsertL(int val){
        if(size==0){
            InsertF(val);
            return ;
            
            
        } 
        
        if (tail == null) {
            tail = head;
        }
        while(tail.next!=null){
            tail=tail.next;//at last iteration it will point to null
            // and due to this reason tail.next will point to null -> producing error
        }
        Node node = new Node(val);
        
        tail.next=node;
        tail=node;
        size++;
        return ;
        
        
    }
    //get node 
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
    
    //Insert in b/w
    
    public void Insert(int val,int index){
        Node node=get(index);
        Node node2= new Node(val);
        
        node2.next=node.next;
        node.next=node2;
        size++;
        return;
        
    }
}
