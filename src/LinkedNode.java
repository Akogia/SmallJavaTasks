public class LinkedNode {
    private int entry;
    private LinkedNode next;

    LinkedNode(int value){
        this(value,null);
    }

    LinkedNode(int value, LinkedNode nextNode){
        this.entry = value;
        this.next = nextNode;
    }

    public LinkedNode getNext(){
        if(this.next == null){
            return null;
        }
        return this.next;
    }

    public int getEntry(){
        return this.entry;
    }

    public void setNext(LinkedNode node){
        this.next = node;
    }

    public void setEntry(int setValue){
        this.entry = setValue;
    }
}
