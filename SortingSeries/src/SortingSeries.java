import java.util.Scanner;
import java.util.Arrays;
public class SortingSeries {
	public static void main(String[] args) {
		int size,value;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a size of serie: ");
		size = input.nextInt();
		int[] list = new int[size];
		for(int i=0;i<size;i++) {
			System.out.print((i+1) + ". element: ");
			value = input.nextInt();
			list[i] = value;
		}
		
		System.out.println("array created with the value you entered: " + Arrays.toString(list));
		Arrays.sort(list);
		System.out.print("sorted array: " + Arrays.toString(list));
	}
}
