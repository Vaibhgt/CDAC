class ArrayDemo{
	public static void main (String Args[]){
		/*
		String [] Array1={"Vaibhav", "Vivek", "Shilpa" ,"Swati"};
		for(int i=0;i<=Array1.length-1;i++){
			
			System.out.println(Array1[i]);
		}
		*/
			
		/*
		char [] Array1={'a','b','c','d'};
		String s;
		for(int i=0;i<=Array1.length-1;i++){
		s=""+Array1[i];
		System.out.print(s);
			
			
			
		}
		*/
		/*
		// Linear Search
		int [] Array1={2,3,4,5,6};
		int key=6;
		int temp=0;
		for(int i=0;i<=Array1.length-1;i++){
		//System.out.println(Array1[i]);
		if (Array1[i]==key){
			System.out.println("Found");
			temp=temp+1;
		}
		
			
			
		}
		if (temp==0)
		System.out.println("Not Found");
		*/
		/*
		String [] Array1={"Vaibhav", "Vivek","Shilpa","Kritika"};
		String key="Swati";
		int temp=0;
		for(int i=0;i<=Array1.length-1;i++){
		//System.out.println(Array1[i]);
		if (Array1[i].equals(key)){
			System.out.println("Found");
			temp=temp+1;
		}
		
			
			
		}
		if (temp==0)
		System.out.println("Not Found");
	*/
	//Binary Search
	/*
	int [] Array1={10,20,30,40,50,60,70,80};
	int key=100;
	int Li=0;
	int Hi=Array1.length-1;
	int Mi=(Li+Hi)/2;
	while(Li<=Hi){
	if(Array1[Mi]==key){
		System.out.println("Element found at index= "+Mi);
		break;
	}
	else if(Array1[Mi]<key){
		Li=Mi+1;
	}
	else{
		Hi=Mi-1;
	}
	Mi=(Li+Hi)/2;
	}
	if(Li>Hi){
		System.out.println("Element not found at index");
	}
	*/
	
	}
	
	
}