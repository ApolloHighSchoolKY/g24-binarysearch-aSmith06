import java.util.Arrays;

public class BinarySearch
{
	public static int binarySearch(int[] ray, int item)
	{
		Arrays.sort(ray);
		//System.out.println("After calling binarySearch");
		//System.out.println(Arrays.toString(ray));

		int bottom = 0;
		int top = ray.length-1;
		int middle = (top + bottom)/2;
		
		while(top >= bottom)
		{
			if(ray[middle] < item)
				bottom = middle + 1;
			else if(ray[middle] > item)
				top = middle - 1;
			else if(ray[middle] == item)
				return middle;

			middle = (top + bottom)/2;
		}
		return -1;
	}
}
