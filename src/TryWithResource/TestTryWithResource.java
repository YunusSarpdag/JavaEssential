package TryWithResource;

public class TestTryWithResource {
    public static void main(String[] args) throws Exception{
        try(ClosableExample closableExample = new ClosableExample()){
            //closableExample = new ClosableExample(); // need to bo final or effective final cause try block need to know to close whic resource closable method
            closableExample.test();
        }
    }
}
