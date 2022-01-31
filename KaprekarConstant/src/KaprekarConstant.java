// import java.util.ArrayList;

public class KaprekarConstant {
	
	private int number; 

	public int computeNumberIOfIterationsUntil6174(int inputNumber) {

		int count = 0; 
		int temp = inputNumber; 
		int newVar = 0; 
		
		while (temp != 6174) {
			temp = computeGreatestToLeast(temp) - computeLeastToGreatest(temp); 
			count++; 
		}
		
		return count; 
		
	}
	
	
	public int computeGreatestToLeast(int inputNumber) {
		
		int temp = inputNumber; 
		int inputNumberLength = computeNumberOfDigitsInNumber(temp); 
		int[] res = new int[inputNumberLength];

		
		int myNum = computeLeastToGreatest(temp); // now, temp is sorted from least to greatest 
		
		for (int i = 0; i < inputNumberLength; i++) {
			res[i] = (myNum % 10);
			myNum /= 10; 
		} // now, res contains the number from greatest to least, with an index for each digit 

		String strForOutput = "";
		
		for (int i = 0; i < res.length; i++) {
			strForOutput += res[i]; 
		} // now, strForOutput has the number in greatest to least order (in String form) 
		

		return Integer.parseInt(strForOutput); 
		
	}
	
	public int computeLeastToGreatest(int inputNumber) {
		
		int[] inputData = new int[computeNumberOfDigitsInNumber(inputNumber)];
		int myNum = inputNumber; 
		
		for (int i = 0; i < inputData.length; i++) {
			inputData[i] = (myNum % 10); 
			myNum /= 10; 
		}
		
		for (int j = 1; j < inputData.length; j++) {
			int temp = inputData[j];
			int possibleIndex = j;
			while (possibleIndex > 0 && temp < inputData[possibleIndex - 1]) {
				inputData[possibleIndex] = inputData[possibleIndex - 1];
				possibleIndex--;
			}
			inputData[possibleIndex] = temp;
		}
		
		String strForOutput = "";
		
		for (int i = 0; i < inputData.length; i++) {
			strForOutput += inputData[i]; 
		}
		
		return Integer.parseInt(strForOutput); 

	}
	
	public int computeNumberOfDigitsInNumber(int inputNumber) {
		
		int temp = inputNumber; 
		int count = 0; 
		
		while (temp > 0) {
			temp /= 10; 
			count++; 
		}
		
		return count; 
		
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		KaprekarConstant myObj = new KaprekarConstant(); 
		
		/* RULES FOR NUMBER 
		  	number must be 4 digits or more 
			number must not contain any repeat digits 
		 */
		
		// replace 8315 with your number!  
		
		System.out.println("Iterations: " + myObj.computeNumberIOfIterationsUntil6174(8315)); 
		
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
