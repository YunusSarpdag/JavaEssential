package StreamAPI;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class CreatingStream {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("David");
        names.add("Jane");
        names.add("Linda");
        names.add("Angle");
        Stream<String> fromList = names.stream();
        Stream<String> of = Stream.of("John" , "Marry");
        Stream<String> pStream = names.parallelStream();

        fromList.forEach(System.out::println);
        of.forEach(System.out::println);
        // List is sequential but we are processing it parallel , result will be different from normal stream
        pStream.forEach(System.out::println);

        System.out.println("---------------");

        names.stream().map(l->l.toUpperCase()).forEach(System.out::println);
        List<Integer> integerList = names.stream().map(l-> l.length()).collect(Collectors.toList());
        integerList.stream().forEach(System.out::println);

        //flatmap process stream of stream
        names.stream().map(s-> s.split("")).flatMap(Arrays::stream).forEach(System.out::println);

        names.stream().filter(s-> s.length()>4).map(s-> s.toUpperCase()).forEach(System.out::println);

        Stream.iterate(1, n->n+1).limit(10).forEach(System.out::print);
        System.out.println();
        Stream.iterate(1, n->n+1).skip(10).limit(20).forEach(System.out::print);
        names.addAll(names);
        System.out.println();
        System.out.println(names.size());
        names.stream().map(n->n.toUpperCase()).distinct().peek(System.out::println).collect(Collectors.toList());

        Stream<String> stream = names.stream();
        try {
            stream.filter(s-> s.equals("David")).distinct().forEach(System.out::println);
            stream.filter(s-> s.equals("David")).distinct().forEach(System.out::println);
        }catch (Exception e){
            e.printStackTrace();
        }

        names.stream().map(s -> s.length()).reduce(0, (a, b) ->{System.out.println("a = " + a + " b= "+b); return a+b;});

        System.out.println(names.stream().distinct().collect(Collectors.groupingBy(String::toLowerCase)));
        System.out.println("****************");
        System.out.println(names.stream().distinct().collect(Collectors.groupingBy(s -> s.length()>4)));
    }
}
