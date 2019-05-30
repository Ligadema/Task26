package by.yandex.sidvlada;

import java.util.ArrayList;
import java.util.List;

public class Notes {
    public static void main(String[] args) {

        int note = 20;
        List arrayList = new ArrayList(note);

        for (int i = 0; i < note; i++) {
            int x = (int) (Math.random() * 10 + 1);
            arrayList.add(x);
        }
        System.out.println(arrayList);

        List arrayList2 = new ArrayList ();
        for (int i = 0; i < note; i++) {
            int y = (int) arrayList.get(i);
            if (y <= 2)
                arrayList2.add(y);
        }
           arrayList.removeAll(arrayList2);
            System.out.println(arrayList);
    }
}
