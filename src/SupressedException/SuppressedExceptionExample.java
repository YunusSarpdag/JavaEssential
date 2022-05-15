package SupressedException;

public class SuppressedExceptionExample implements AutoCloseable{
    @Override
    public void close() throws Exception {
        throw new NullPointerException();
    }

    public void test(){
        throw new RuntimeException("Suppressed Ex thrown");
    }
}
