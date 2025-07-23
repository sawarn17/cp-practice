package streamdemo;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private LocalDateTime creationDateTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(LocalDateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
        this.creationDateTime = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", creationDateTime=" + creationDateTime + "]";
    }

}

// this is used to convert the list of data into map in the java
public class ConvertIntoMap {

    public static void buildLogs(String message) {
        System.out.println(
                "========================================" + message + "===========================================");
    }

    // for duplicate key it is not sutaible
    public static void convertIntoMap(List<Long> res) {
        buildLogs("CONVERSION IN MAP");
        Map<Long, Long> collect = res.stream().collect(Collectors.toMap(Function.identity(), data -> data));
        System.out.println("THE DATA IN THE MAP ARE " + collect);
    }

    public static void convertObjectIntoMap(List<Employee> enEmployees) {
        buildLogs("CONVERSION OF DATA INTO MAP");
        Map<Integer, Employee> details = enEmployees.stream().collect(Collectors.toMap(Employee::getId, emp -> emp));
        System.out.println("THE CONVERTED EMPLOYEESS ARE " + details);
    }

    public static void convetInToMap(List<Employee> employees) {
        buildLogs("CONVERSION OF DATA INTO MAP WHEN DUPS ID ARE PRESENT");
        Map<Integer, Employee> details = employees.stream()
                .collect(Collectors.toMap(Employee::getId, emp -> emp, (existing, newid) -> {
                    return existing;
                }));
        System.out.println("THE CONVERTED EMPLOYEESS ARE " + details);
    }

    // here we need to comparator
    public static void performSortingOnDate(List<Employee> employees) {
        buildLogs("PERFORM SORTING IN LOCALDATETIME");
        employees.stream().sorted(Comparator.comparing(Employee::getId).reversed())
                .collect(Collectors.toList()).forEach(System.out::println);
    }

    // this is used to compare object on multiple feilds
    private static Comparator<Employee> employeeComparator = Comparator.comparing(Employee::getName)
            .thenComparingInt(Employee::getId).reversed();

    public static void performSortingOnMultipleFeilds(List<Employee> employees) {
        buildLogs("PERFORM SORTING ON MULTIPLE FEILDS");
        employees.stream().sorted(employeeComparator)
                .collect(Collectors.toList()).forEach(System.out::println);
    }

    public static void sortingEmployeeAndStoredInSortedMap(List<Employee> employees) {
        buildLogs("CONVERING LIST INTO MAP IN LINKEDHASHMAP");
        Map<Integer, Employee> sortedEmployeeMap = employees.stream()
                .sorted(employeeComparator)
                .collect(Collectors.toMap(Employee::getId, emp -> emp,
                        (existing, replacement) -> existing, LinkedHashMap::new));

        sortedEmployeeMap.forEach((id, data) -> System.out.println("THE ID ARE " + id + " THE DATA ARE " + data));
    }

    public static void groupByElements(List<Employee> employees) {
        buildLogs("GROUP BY CATEGORIES");
        Map<String, List<Employee>> groupedEmployee = employees.stream()
                .collect(Collectors.groupingBy(Employee::getName));

        groupedEmployee.forEach(
                (name, details) -> System.out.println("THE NAME" + name + " and group elements are" + details));
    }

    public static void getLastELemetsFromTheList(List<Long> lists) {
        buildLogs("GETTING LAST ELEMENTS FROM THE LIST");
        Optional<Long> lastElem = lists.stream().reduce((a, b) -> {
            return b;
        });
        System.out.println(lastElem);
    }

    public static void getSumOfNumber(List<Long> lists) {
        buildLogs("GETTING SUM FROM THE LIST");
        Optional<Long> lastElem = lists.stream().reduce((a, b) -> a + b);
        System.out.println(lastElem);
    }

    public static void findDuplicateElements(List<Integer> data) {
        buildLogs("FINDING DUPLICATE ELEMENTS FROM THE LIST");
        data.stream().collect(
                Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()))
                .entrySet()
                .stream()
                .filter(m -> m.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet()).forEach(System.out::println);
    }

    public static void findDuplicateElementsByCounting(List<Integer> details){
        buildLogs("GETTING DUPLICATE ELEMENTS FROM THE LIST");
        details.stream().filter(data -> Collections.frequency(details, data)>1)
        .collect(Collectors.toSet()).forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<Long> res = Arrays.asList(1L, 2L, 3L, 4L);

        convertIntoMap(res);

        List<Employee> employees = List.of(new Employee(1, "TEST-1"), new Employee(2, "TEST-2"),
                new Employee(3, "TEST-3"), new Employee(5, "TEST-5"), new Employee(4, "TEST-4"),
                new Employee(7, "TEST-5"));

        convertObjectIntoMap(employees);

        // perform sorting on that
        performSortingOnDate(employees);

        // perform sorting in various feilds in the java
        performSortingOnMultipleFeilds(employees);

        // performing sorying and storing them into map
        sortingEmployeeAndStoredInSortedMap(employees);

        // making group by example
        groupByElements(employees);

        // getting last elements from the list
        getLastELemetsFromTheList(res);

        // getting sum of the list
        getSumOfNumber(res);

        List<Integer> dups = Arrays.asList(1, 1, 1, 3, 3, 4, 5, 5, 6, 7, 8);
        findDuplicateElements(dups);
        //finding duplicate elements by the using of the collections frequency
        findDuplicateElementsByCounting(dups);

    }

}
