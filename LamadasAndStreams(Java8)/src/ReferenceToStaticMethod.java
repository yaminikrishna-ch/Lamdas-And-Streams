import java.util.*;
import java.util.function.Predicate;

public class ReferenceToStaticMethod {
	private static Scanner scanner;
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		int noOfStrings=scanner.nextInt();
		String[] stringArray=new String[noOfStrings];
		for(int iterator=0;iterator<noOfStrings;iterator++)
			stringArray[iterator]=scanner.next();
        List<String> list = Arrays.asList(stringArray);
        List<String> resultPalindromes = ReferenceToStaticMethod.searchPalindrome(list, str -> ReferenceToStaticMethod.checkPalindrome(str));
        System.out.println("Palindromes are " + resultPalindromes);
    }
 
    public static boolean checkPalindrome(String string) {
    	StringBuilder resultString =new StringBuilder();
    	for(int iterator = string.length()-1; iterator >= 0 ; iterator--)
    	     resultString = resultString.append(string.charAt(iterator));
    	return string.equalsIgnoreCase(resultString.toString());
        } 
    public static List<String> searchPalindrome(List<String> list, Predicate<String> predicate) { 
    	List<String> sortedPalindromes = new ArrayList<>(); 
    	list
    	.stream()
    	.filter(iterator -> (predicate.test(iterator))).forEach(iterator ->{
            sortedPalindromes.add(iterator);
        });
        return sortedPalindromes;
 
    }
    
}