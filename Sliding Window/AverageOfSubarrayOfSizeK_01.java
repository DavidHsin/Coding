import java.util.Arrays;

public class AverageOfSubarrayOfSizeK_01 {
	
	public static double[] findAverage(int[] arr, int k) {
		double[] result = new double[arr.length + 1 - k];
		for (int i = 0; i <= arr.length - k; i++) {
			double sum = 0;
			for (int j = i; j < i + k; j++) {
				sum += arr[j];
			}
			result[i] = sum / k;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] result = AverageOfSubarrayOfSizeK_01.findAverage(new int[] { 1, 3, 2, 6, -1, 4, 1, 8, 2 }, 5);
		System.out.println(Arrays.toString(result));
	}
	

}
