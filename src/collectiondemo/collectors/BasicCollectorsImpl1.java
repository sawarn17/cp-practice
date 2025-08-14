package collectiondemo.collectors;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BasicCollectorsImpl1 {

    private static void toListConversionDemo(List<String> details) {
        // it will display only unique set of eements
        details.stream().collect(Collectors.toSet()).forEach(System.out::println);
    }

    // here duplicate keys handles easily
    private static void mappedToGroupingBy(List<String> details) {
        details.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .forEach(System.out::println);
    }

    // make partion based on the predicated passed in it
    private static void partitionByDemo(List<String> detaList) {
        Map<Boolean, List<String>> result = detaList.stream()
                .collect(Collectors.partitioningBy(data -> data.length() % 2 == 0));
        System.out.println(result);
        // OP: {false=[Ayarn, Vinod, Vimal], true=[Amit, Vishal, Vishal, Rama]}
    }

    //Collector.of allows the creation of a custom collector. 
    //This is especially useful for more specialized reductions that are not covered by the standard collectors.
    private static void demoCustomCollectors() {
        Collector<String, StringBuilder, String> joiningCollector = Collector.of(
                StringBuilder::new,
                StringBuilder::append,
                StringBuilder::append,
                StringBuilder::toString);

        String result = Stream.of("Aya", "RN ", "SAWARN").collect(joiningCollector);
        System.out.println(result);
    }

    //this is used to make summary for it.
    //summarizingInt, summarizingDouble, summarizingLong are collectors used for calculating statistical 
    //summaries (like count, sum, min, average, max) for elements in a stream.
    private static void summriseingCount(){
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        IntSummaryStatistics stats = numbers.stream()
                                    .collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println(stats);
        //IntSummaryStatistics{count=5, sum=15, min=1, average=3.000000, max=5}
    }

    private static void calculatingDetailsBasedOnKeyAndLength(List<String> details){
        Map<String, Integer> nameLengthMap = details.stream()
                                          .collect(Collectors.toMap(Function.identity(), String::length));
        System.out.println(nameLengthMap);
    }

    // Advanced Mappings with mapping

    /*
     * Collectors allow us to transform and aggregate stream elements in diverse and
     * complex ways.
     */
    public static void main(String[] args) {
        List<String> details = Arrays.asList("Ayarn", "Amit", "Vishal", "Vinod", "Vimal", "Vishal", "Rama");

        toListConversionDemo(details);
        mappedToGroupingBy(details);
        partitionByDemo(details);
        demoCustomCollectors();
        summriseingCount();
        calculatingDetailsBasedOnKeyAndLength(details);
    }
}
