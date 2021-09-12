public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        /*
        First Task: Create a linked list: Therefore two classes are needed "LinkedList" and "LinkedNode"
        */
        //Create empty List
        LinkedList firstList = new LinkedList();

        // Add some values and create a list of 7 nodes
        firstList.addNode(5);
        firstList.addNode(10);
        firstList.addNode(435);
        firstList.addNode(45);
        firstList.addNode(8);
        firstList.addNode(455);
        firstList.addNode(37);

        //Check if the size is correct, shall print 7
        System.out.println(firstList.size());

        //Check if method "contain" works properly, shall print true
        System.out.println(firstList.contains(8));

        //Check whether method remove works, the size shall be reduced by one
        firstList.remove(435);
        System.out.println(firstList.size());
    }
}
