import org.w3c.dom.ls.LSOutput;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hashsetzinho = new HashSet<Integer>();
        hashsetzinho.add(13);
        hashsetzinho.add(57);
        hashsetzinho.add(92);

        Iterator<Integer> it = hashsetzinho.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        for (Integer integer : hashsetzinho) {
            System.out.println(integer);
        }
    }
}
// dois jeitos de fazer a mesma coisa :)
