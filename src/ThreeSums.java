
public class ThreeSums {
	public static void main(String[] args) {
		int[] data = { 3, 2, 5, 7, 9, 12, 97, 24, 54 };
		
			int even = 0;
			int odd = 0;
			int sum = 0;
		

		// compute the sums
		
		for (int index = 0; index < data.length; index++) {
			int mns = data[index];
			sum += mns;
			if(mns % 2 == 0){
				even += mns;
			}else{
				odd += mns;
			}
		}
		
		// write out the three sums
		
		System.out.println("The sum of the evens = " + even);
		System.out.println("The sum of the numbers = " + sum );
		System.out.println("odd sum = " + odd);

	}
}
