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

        int a = 100%10;
        int b = 111%9;

        System.out.println(a);
        System.out.println(b);
        int x = 10;
        while (x > 1) {
	    System.out.println("Hallo!");
	    x -= x / 2;
        System.out.println(x);
        }

        // Diese Variable kaennen sie veraendern, um Ihre
		// Implementierung zu testen
		int v = 8;
		// Der nachfolgende Quelltext erzeugt nur die Ausgabe
		System.out.print("Ist ");
		System.out.print(v);
		System.out.println(" eine Primzahl?");
        new PrimeNumberTest().primeNumber(v);

    }
}
