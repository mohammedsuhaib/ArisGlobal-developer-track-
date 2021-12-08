package myJDBC;
import java.util.Arrays;
public class ParallelSort {
	public static void main(String[] args) {
		int numbers[] = {22, 89, 1, 32, 19, 5};
		Arrays.parallelSort(numbers);
		for(int i:numbers)
			System.out.print(i+" ");
	}
}
