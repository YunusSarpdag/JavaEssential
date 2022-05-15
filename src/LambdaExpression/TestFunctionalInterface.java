package LambdaExpression;

import com.sun.source.tree.ReturnTree;

import java.util.Locale;

public class TestFunctionalInterface {

    int sum = 0;
    public static void main(String[] args) {
        testVarargsAndGenericFunctionalInterface();
        testGenericFunctionalInterface();
        testFunctionalInterface();
        TestFunctionalInterface testFunctionalInterface = new TestFunctionalInterface();
        testFunctionalInterface.testLocalVariableChange(5,6);
        System.out.println("sum of : " + testFunctionalInterface.sum);
    }

    static void testVarargsAndGenericFunctionalInterface(){
        FunctionalInterfaceVarArgs<String> functionalInterfaceVarArgs = (String ... s) ->{
            for (int i = 0; i < s.length; i++) {
                System.out.println(s[i]);
            }
        };

        functionalInterfaceVarArgs.test("yunus" , "jhon" ,"pele");
    }

    static void testGenericFunctionalInterface(){
        FunctionalInterfaceGeneric<String> stringFunctionalInterfaceGeneric = (s)->{return s.toUpperCase();};
        System.out.println(stringFunctionalInterfaceGeneric.testLambda("yunus"));

        FunctionalInterfaceGeneric<Integer> integerFunctionalInterfaceGeneric = (i) -> {return i*i;};
        System.out.println(integerFunctionalInterfaceGeneric.testLambda(5));
    }

     void testLocalVariableChange(int one , int two){
        int tmpSum=0;
        FunctionalInterfaceTwoParamsAndOneReturn functionalInterfaceTwoParamsAndOneReturn = (i,j) ->{
            int sum =0;
            //tmpSum =0; // lambda local variable need to final or effective final
            this.sum = i+j;
            System.out.println("inner sum is " + sum);
            sum = 12;
            return this.sum;
        };
         System.out.println(functionalInterfaceTwoParamsAndOneReturn.testLambda(one,two));
    }

    static void testFunctionalInterface(){
        //if we implement this interface we can just override 1 time and give just one behavior but with lambda we can give different behaviors
        FunctionalInterfaceZeroInputExample functionalInterface = () ->System.out.println("First implementation");
        FunctionalInterfaceZeroInputExample functionalInterface2 = () ->System.out.println("Second implementation");

        functionalInterface.testLambda();
        FunctionalInterfaceZeroInputExample.test1();
        FunctionalInterfaceZeroInputExample.test2();
        System.out.println("-------------------");
        functionalInterface.testLambda();
        FunctionalInterfaceZeroInputExample.test1();
        FunctionalInterfaceZeroInputExample.test2();

        System.out.println("*******************");
        FunctionalInterfaceWitOneParam functionalInterfaceWitOneParam = (i) -> System.out.println(i.toLowerCase());
        FunctionalInterfaceWitOneParam functionalInterfaceWitOneParam2 = (i) -> System.out.println(i.toUpperCase());
        functionalInterfaceWitOneParam.testLambdaOneParam("Yunus");
        functionalInterfaceWitOneParam2.testLambdaOneParam("Yunus");

        System.out.println("++++++++++++++++++");
        FunctionalInterfaceTwoParamsAndOneReturn functionalInterfaceTwoParamsAndOneReturn = (i,j) ->i+j;
        FunctionalInterfaceTwoParamsAndOneReturn functionalInterfaceTwoParamsAndOneReturn2 = (i,j) -> {return i*j;};
        int test1 = functionalInterfaceTwoParamsAndOneReturn.testLambda(5,2);
        int test2 = functionalInterfaceTwoParamsAndOneReturn2.testLambda(5,2);
        System.out.println(test1);
        System.out.println(test2);
    }
}
