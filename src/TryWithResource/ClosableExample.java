package TryWithResource;

public class ClosableExample implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("Closable Called");
    }

    public void test(){
        System.out.println("test");
    }
}
