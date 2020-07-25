import java.util.*;
import java.util.stream.*;

public class StringsFiltering {
	private static Scanner scanner;

	public static List<String> verificationMethod(List<String> list) {
		return list
				.stream()
				.filter(stringElement -> stringElement.startsWith("a") && stringElement.length()==3)
				.collect(Collectors.toList());
	}
	
	public static void main(String args[]) {
		scanner = new Scanner(System.in);
		int noOfStrings=scanner.nextInt();
		List<String> list= new ArrayList<String>();
		for(int iterator=0;iterator<noOfStrings;iterator++)
			list.add(scanner.next());
	     List<String> resultList = verificationMethod(list); 
	     System.out.println(resultList);	
	}
}