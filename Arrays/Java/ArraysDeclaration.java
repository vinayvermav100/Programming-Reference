package Arrays.Java;

public class ArraysDeclaration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		oneDArray.oneDArray();
		twoDArray.twoDArray();
	}
	
public static class oneDArray{
	public static void oneDArray(){
		int[] x=new int[]{1,2,3,4,5}; // Declaring one dimensional array and assigning value to them 
		
		for(int i=0;i<x.length;i++){
			System.out.println("Elements of 1-D array are " +x[i]); //Printing all the elements of array
		}
		
	}
}
//MultiDimensional Array
public static class twoDArray{
	public static void twoDArray(){
		int[][] arr= new int[][]{{1,2,3},{4,5,6},{7,8,9}}; // Declaring two dimensional array and assigning value to them 
		for(int i = 0;i< arr.length;i++){
			for(int j=0;j<arr.length;j++){
				System.out.println("Elements of 2-D array are " + arr[i][j]); //Printing all the elements of array
			}
		}
	}
	
}


}
