class FebionacciDemo{ 
	static int a=0;
	static int b=1;
	static int c;
	public static void main (String args[]){
		
		System.out.print(a+" "+b);
		FebionacciDemo f=new FebionacciDemo();
		f.feb(10);
		
	}
		
		void feb(int i){
		  if (i>=1){
		  c=a+b;
		  System.out.print(" "+c);
		  
		  a=b;
		  b=c;
		  feb(i-1);
		}
	}
		
		
		
}