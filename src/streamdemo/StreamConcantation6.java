package streamdemo;

import java.util.stream.Stream;

public class StreamConcantation6 {

    private static void streamConcant(){
        Stream<Integer> stream1 = Stream.of(1, 3, 5);
        Stream<Integer> stream2 = Stream.of(2, 4, 6);
        Stream<Integer> stream3 = Stream.of(18, 15, 36);
        Stream<Integer> stream4 = Stream.of(99);

        Stream<Stream<Integer>> streamConcat= Stream.of(stream1, stream2, stream3, stream4);

        System.out.println(streamConcat);//prints object of the Stream

        //displaying elements
        streamConcat.flatMap(data -> data).forEach(System.out::println);
    }

    public static void main(String[] args) {
        streamConcant();
    }
}
