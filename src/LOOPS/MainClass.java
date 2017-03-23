package HomeOne;

/**
 * Created by REY on 15.03.2017.
 */
public class MainClass {
    public static void main(String[] args) {
        GetSet getset= new GetSet();

        getset.setValueN(888);
        getset.setValueT("Must be a text");
        System.out.println(getset.getValueN());
        System.out.println(getset.getValueT());
    }



}
