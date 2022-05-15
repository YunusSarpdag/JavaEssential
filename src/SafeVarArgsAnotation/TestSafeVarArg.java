package SafeVarArgsAnotation;

import java.util.ArrayList;
import java.util.List;

public class TestSafeVarArg {

    public static void main(String[] args) {
        List<String> sList = new ArrayList<>();
        sList.add("yunus");
        sList.add("ali");
        test(sList);
    }


    @SafeVarargs
    public static void test(List<String>... st) {
        /*Object[] objects = st;
        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        objects[0] = integerList; */ // causes heap pollution we make it safe to heap pollution and
        // make it developers know also if we remove static other developer can cause heap pollution so compiler will give error
        String first = st[0].get(0);
        System.out.println(first);
    }
}
