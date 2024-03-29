package lambda;

import java.nio.charset.StandardCharsets;

public class MyExampleLambda {

    public static void main(String[] args) {

        // NoReturnArgument
        final Integer ii =0;
        NoReturnArgument noReturnArgument = arg -> arg.toString();

        // Lambda with more than one liner
        NoReturnArgument moreLine = arg -> {
            System.out.println(arg);
            System.out.println(arg.toString());
            System.out.println(arg.getClass());
        };

        // NoReturnNoArgument
        final Integer i  = 9;
        NoReturnNoArgument noReturnNoArgument = () -> i.byteValue();

        // ReturnArgument
        ReturnArgument<String, Integer> returnArgument = arg -> arg.toString();

        // ReturnNoArgument
        ReturnNoArgument<Integer> returnNoArgument = () -> Integer.getInteger("4");

    }
}
