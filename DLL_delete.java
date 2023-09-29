  public void del(int ind){
        Node node= get(ind);
        
        node.next=node.next.next;
        node.next.prev=node;
        size--;
        return;
    }

//for deletion in between only
