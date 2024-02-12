import java.util.*;
import java.util.stream.Collectors;
public class PlainDromNumber {
	
	public static List<Integer> getAllNumber(List<Integer> allnumber){
		ArrayList<Integer> returnList = new ArrayList<>();
		returnList.addAll(allnumber.stream().filter(data -> !data.equals(0))
				.map(Integer::intValue).collect(Collectors.toList()));
		returnList.addAll(allnumber.stream().filter(data -> data.equals(0))
				.map(Integer::intValue).collect(Collectors.toList()));
		return returnList;
	}
	
	
	public static void main(String [] args) {
		Integer arr [] = {1, 2, 3, 0, 6, 7, 0,9, 10};
		List<Integer> asList = Arrays.asList(arr);
		System.out.println(getAllNumber(asList));
	}
}
