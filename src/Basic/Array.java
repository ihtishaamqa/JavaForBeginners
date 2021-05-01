package Basic;
import java.util.Arrays;
public class Array {
    // An Array is a variable which can store more than one value, but it has to be the same datatype.
    //Example Box of White Chocolates.

    public static void main(String[] args){
        //Preferred way
        //int[] IntArray = {0,5,10,15,20,25};

        //Non Preferred way
        //int IntArray1[] = {0,1,2,3,4,5};

        int[] GradesBoys = new int[5];
        GradesBoys[0]= 2;
        GradesBoys[1]= 5;
        GradesBoys[2]= 7;
        GradesBoys[3]= 6;
        GradesBoys[4]= 9;

        int[] GradesGirls = {3,7,10,8,4};
        //GradesGirls[0]= 5;

        //System.out.println(GradesGirls[0]);


        //ArrayToString with Java Import
        int[] grades = {9,3,8,1,2,6,5,4,7};
        System.out.println(Arrays.toString(grades));


        //ArraydeepToString
        int[][] grades1={{9,3,8,1}, {2,6,5,4, 7}};
        System.out.println(Arrays.deepToString(grades1));


    }
    }
