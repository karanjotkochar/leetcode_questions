import java.util.Vector;

public class test_Vector {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(3,2);

        vector.addElement(1);
        vector.addElement(2);
        vector.addElement(3);

        vector.insertElementAt(0, 1);

        vector.removeElementAt(2);

        for (int i : vector) {
            System.out.println(i);
        }
        // part 2

        Vector<Integer> vector2 = new Vector<>();
        vector2.add(7);
        vector2.add(8);
        vector2.add(9);

        System.out.println("Vector 2 is: " + vector2);
    }
}
