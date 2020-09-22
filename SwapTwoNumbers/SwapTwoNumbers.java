
public class SwapTwoNumbers {
	public static void main(String args[]){
		int p = 10, q = 30;
		
		System.out.println("Before swapping "+ p +" " + q);
		//logic 1st
		
		int r = p;
		p = q;
		q = r;
		
		System.out.println("After Swapping " + p + " " + q );
	
		//logic 2nd
		/*
		p = p + q;
		q = p - q;
		p = p - q;
		System.out.println("After Swapping " + p + " " + q );
		*/
		
		//logic 3rd
		/*
		p = p * q;
		q = p / q;
		p = p / q;
		System.out.println("After Swapping " + p + " " + q );
		*/
		
		//logic 3rd
		/*
		q = p+q-(p=q);
		System.out.println("After Swapping " + p + " " + q );
		*/	
	}
}
		
		
		
