package SupressedException;

public class TestSuppressedException {
    public static void main(String[] args) throws Exception{
        //beforeJava7();
        //afterJava7();
        addManuelSuppressedException();
    }

    public static void beforeJava7() throws Exception{
        SuppressedExceptionExample example = new SuppressedExceptionExample();
        try{
            example.test();
        }catch (Exception e){
            throw e;
        }finally {
            example.close();
        }
    }

    public static void afterJava7() throws Exception{
        try(SuppressedExceptionExample example = new SuppressedExceptionExample()){
            example.test();
        }
    }

    public static void addManuelSuppressedException() throws Exception{
        Throwable firstException = null;
        SuppressedExceptionExample example = new SuppressedExceptionExample();
        try{
            example.test();
        }catch (Exception e){
            firstException = e;
        }finally {
            try {
                example.close();
            }catch (Exception ex2){
                if(firstException != null){
                    ex2.addSuppressed(firstException);
                }
                throw ex2;
            }
        }
    }
}
