package DerekBananasTut;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class ListThings {

	public static void main(String args[]) {
		//FILL
		List<Integer> oneTo10 = IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());
		
		//TRANSFORM AND MAKE ANOTHER LIST
		List<Integer> squares = oneTo10.stream().map(x -> x*x).collect(Collectors.toList());
		
		//FILTER
		List<Integer> evens = oneTo10.stream().filter(x -> (x%2)==0).collect(Collectors.toList());
		for (Integer x: evens) System.out.println(x);

		//limit stream's values 
		IntStream limitTo5 = IntStream.range(1,10).limit(5);
		limitTo5.forEach(System.out::println);
		
		// range(1,6) = rangeClosed(1,5);
		int multAll = IntStream.range(1, 5).reduce(1, (x,y)->x*y);
		System.out.println(multAll);
		
		// IntStream in DoubleStream
		DoubleStream stream = IntStream.range(1, 5).mapToDouble(i -> i);
		
		//statistics of a stream
		IntSummaryStatistics iStats = IntStream.range(1, 10).summaryStatistics();
		System.out.println(iStats.getAverage());
		System.out.println(iStats.getMin());
		System.out.println(iStats.getMax());
		
	
		/* EXAMPLE IN USE
		 * 
		 * the long way 
		 * 
		 * List<Person> list = Arrays.asList( new Person("John Blue", 28), new
		 * Person("Anna Brown", 53), new Person("Paul Black", 47) );
		 * 
		 * int min = list.stream() .mapToInt(Person::getAge) .min()
		 * .orElseThrow(NoSuchElementException::new);
		 * 
		 * int max = list.stream() .mapToInt(Person::getAge) .max()
		 * .orElseThrow(NoSuchElementException::new);
		 */
		
		/* Stream allows to get statistics very fast
		 * 
		 * IntSummaryStatistics statistics = list.stream() .mapToInt(Person::getAge)
		 * .summaryStatistics();
		 * 
		 * int min = statistics.getMin(); int max = statistics.getMax();
		 */
	}
}
