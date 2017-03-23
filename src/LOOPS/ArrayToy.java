package HomeOne;

/**
 * Created by REY on 15.03.2017.
 */

// nvnvnhjhjhjhmhghmbghmghghghg jhjhkhhjkh hjhihjyhih h hhjhihjh


    /// dfgdfdsfgggggggc fghf
public class ArrayToy {

    static int[] Numeric = new int[10];
    static String[] Symbolic ={"a","b","c","d","e","f","g","h","i","j"};

    public static void main(String[] args) {
        Numeric[0] = 1;
        Numeric[1] = 1;

        for (int i = 0; i < Numeric.length; i++) {
            if (Numeric[i]== 1) {
                Numeric[i] = 1;
            } else {
                Numeric[i]=Numeric[i-2]+Numeric[i-1];
            }
            System.out.println(i + "-" + Numeric[i]);
        }
        for (int n=0; n<Symbolic.length; n++){
            System.out.println(n+"--"+Symbolic[9-n]);
        }
    }
}