package java8;
import java.util.Arrays;
import java.util.List;

public class Java8 {
	public static void main(String[] args) {
		        List<Employee> employeesList = Arrays.asList(
		                                            new Employee(1, "Alex", 100),
		                                            new Employee(2, "Brian", 100),
		                                            new Employee(3, "Charles", 200),
		                                            new Employee(4, "David", 200),
		                                            new Employee(5, "Edward", 300),
		                                            new Employee(6, "Frank", 300)
		                                        );
		          
		     employeesList.stream().map( e -> e.getSalary()).distinct().forEach(System.out::println);
		    }
		}
