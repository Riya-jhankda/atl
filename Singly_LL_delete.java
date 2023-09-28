    
    //delete at given index 
    public Node delete(int ind){
        
        Node node = get(ind);
   
        node.next=node.next.next;
        size--;
        return node;
        
    }
    
    //delete first 
    public Node deleteF(){
        head=head.next;
        size--;
        return head;
    }
    
    //delete last
    public int deleteL(){
        
        Node prev = null;
        Node current = head;
        
        while (current.next != null) {
            prev = current;
            current = current.next;
        }
        
        int value = current.val;
        if (prev == null) {
            head = null; // If there's only one node, set head to null
        } else {
            prev.next = null; // Disconnect the last node
        }
        
        size--;
        return value;
    
    
       
       
    }
