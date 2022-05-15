package MultipleExceptions;

public class TestMultipleException {
    public static void main(String[] args) {
        beforeJava7();
        afterJava7();
    }

    public static void beforeJava7(){
        int [] arr = new int[]{1,2,3};
        try {
            for (int i = 0; i < arr.length+1; i++) {
                arr[i] = i;
            }
        }catch (NullPointerException e){
            e.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException e2){
            e2.printStackTrace();
        }
    }

    public static void afterJava7(){
        int [] arr = new int[]{1,2,3};
        try {
            for (int i = 0; i < arr.length+1; i++) {
                arr[i] = i;
            }
        }catch (NullPointerException | ArrayIndexOutOfBoundsException e){ // we can throw exception but we separate business
            //e = new RuntimeException(); // need to final or effective final
            e.printStackTrace();
        }catch (Exception e2){
            System.err.println("Unknown exception thrown");
        }
    }
}
