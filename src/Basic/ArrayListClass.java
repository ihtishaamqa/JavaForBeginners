package Basic;

import java.util.List;
import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args){

        List<Integer> grades= new ArrayList<Integer>();
        grades.add(5);
        grades.add(10);
        grades.add(11);

        System.out.println(grades.get(0));
        System.out.println(grades.contains(11));
    }
}
