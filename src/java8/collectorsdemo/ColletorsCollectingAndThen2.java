package java8.collectorsdemo;

import java.util.Collections;
import java.util.Set;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ColletorsCollectingAndThen2 {

    // uses of intpredicate
    private static IntPredicate IS_EVEN_PREDICATE = (x) -> {
        if (x % 2 == 0)
            return true;
        return false;
    };

    private static Stream<Integer> getListData() {
        return Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }

    public static void demoOfCollectingAndThen() {
        Set<Integer> unmodifiedableInteger = getListData().filter(IS_EVEN_PREDICATE::test)
                .collect(Collectors.collectingAndThen(Collectors.toSet(), Collections::<Integer>unmodifiableSet));

        System.out.println("THE RESULT IS " + unmodifiedableInteger);
    }

    public static void main(String[] args) {
        demoOfCollectingAndThen();
    }
}
