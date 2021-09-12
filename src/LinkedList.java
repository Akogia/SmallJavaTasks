public class LinkedList {
    private LinkedNode head;

    LinkedList(){
        this.head = null;
    }

    public void addNode(int value){
        LinkedNode newNode = new LinkedNode(value, this.head);
        this.head = newNode;
    }

    public int size(){
        LinkedNode current = this.head;
        int counter = 0;
        while(current != null){
            counter++;
            current = current.getNext();
        }
        return counter;
    }

    public boolean contains(int value){
        LinkedNode current = this.head;
        while(current != null){
            if(current.getEntry() == value){
                return true;
            }
            else {
                current = current.getNext();
            }
        }
        return false;
    }

    public void remove(int value){
        this.head = remove(this.head,value);
    }

    private LinkedNode remove(LinkedNode node, int value){
        if(this.head != null){
            if(node.getEntry() == value){
                return node.getNext();
            }
        }
        node.setNext(remove(node.getNext(),value));
        return node;
    }
}
