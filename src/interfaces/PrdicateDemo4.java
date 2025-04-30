package interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//genrally used to combined with multiple constion with one
public class PrdicateDemo4 {

    private static Predicate<Integer> IS_LESSER = (i) -> i <= 10;

    // creating a predicates that filterout word starts with A and length is greater
    // than 3
    private static final Predicate<String> STARTS_WITH_A = str -> str.startsWith("A");
    private static final Predicate<String> LENGTH_IS_GREATER_THAN_THREE = str -> str.length() > 3;


    //need to complete it : predictae with collection, combination of predictaes
    public static void main(String[] args) {

        // calling of prdicate to check is it is lesser or not
        System.out.println(IS_LESSER.test(5));// true
        System.out.println(IS_LESSER.test(15));// false

        List<String> names = Arrays.asList("Adam", "Alexander", "John", "Tom", "Ay", "Ayam");

        // combinting predicates
        //** Default predicates are static in nature */
        List<String> result = names.stream()
                .filter(STARTS_WITH_A.and(LENGTH_IS_GREATER_THAN_THREE))
                .collect(Collectors.toList());

        System.out.println(result);//[Adam, Alexander, Ayam]

        List<String> resultWithOr = names.stream()
                .filter(STARTS_WITH_A.or(LENGTH_IS_GREATER_THAN_THREE))
                .collect(Collectors.toList());

        System.out.println(resultWithOr);//[Adam, Alexander, John, Ay, Ayam] : just like a normal or



    }
}
