package logix;

public class CreateLogix {
	
	public static void main(String args[]){
		
		getOutput();
	}

	private static void getOutput() {
		int a=1;
		Integer[] input=new Integer[]{1,7,4,3};
		Integer[] output=new Integer[4];
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {
				if(j!=i){
					a*=input[j];
				}
				output[i]=a;
			}
			a=1;
		}
		
		for (int i = 0; i < output.length; i++) {
			System.out.println("output==> "+output[i]);
		}
		
	}

}
