import java.util.*; 
import java.util.stream.IntStream; 

public class IntegersAndTheirAverage {
	 private static Scanner scanner;

	public static void main(String[] args) 
	    {
		    scanner = new Scanner(System.in);
		    System.out.println("Enter the number of elements: ");
		    int noOfElements=scanner.nextInt();
		    int[] array=new int[noOfElements];
		    System.out.println("Enter the array elements:");
		    for(int iterator=0;iterator<noOfElements;iterator++)
		    	array[iterator]=scanner.nextInt();
	        IntStream inStream = IntStream.of(array); 
	        OptionalDouble optionalDouble = inStream.average(); 
	        System.out.println("The average is: ");
	        if (optionalDouble.isPresent()) { 
	            System.out.println(optionalDouble.getAsDouble()); 
	        } 
	        else { 
	            System.out.println("-1"); 
	        } 
	    } 

}