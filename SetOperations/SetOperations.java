package SetOperations;

import java.util.ArrayList;

public class SetOperations {

	private ArrayList<Integer> arrayList1;
    private ArrayList<Integer> arrayList2;

    public SetOperations() {
        arrayList1 = new ArrayList<>();
        arrayList2 = new ArrayList<>();
        
        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);
        arrayList1.add(4);

        arrayList2.add(3);
        arrayList2.add(4);
        arrayList2.add(5);
        arrayList2.add(6);
    }

    public ArrayList<Integer> getArrayList1() {
        return arrayList1;
    }

    public ArrayList<Integer> getArrayList2() {
        return arrayList2;
    }

    // Intersection
    public ArrayList<Integer> intersection() {
        ArrayList<Integer> intersection = new ArrayList<>();
        for (Integer elem : arrayList1) {
            if (arrayList2.contains(elem)) {
                intersection.add(elem);
            }
        }
        return intersection;
    }

    // Union
    public ArrayList<Integer> union() {
        ArrayList<Integer> union = new ArrayList<>(arrayList1);
        for (Integer elem : arrayList2) {
            if (!union.contains(elem)) {
                union.add(elem);
            }
        }
        return union;
    }
    
    // Complement
    public ArrayList<Integer> complement() {
        ArrayList<Integer> complement = new ArrayList<>(arrayList1);
        complement.removeIf(arrayList2::contains);
        return complement;
    }

    public void run() {
        System.out.println("ArrayList1: " + getArrayList1());
        System.out.println("ArrayList2: " + getArrayList2());
        System.out.println("Union: " + union());
        System.out.println("Intersection: " + intersection());
        System.out.println("Complement (arrayList1 - arrayList2): " + complement());
    }
	
}
