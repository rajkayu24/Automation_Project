package javaprogram;

public class ArrayProgram {

	public static void main(String[] args) {
	/*
	int a[]=new int[4];
	a[0]=1;
	a[1]=2;
	a[2]=3;
	System.out.println(a[3]);//0<-default value
	System.out.println(a[2]);//
	
	//reading throgh for for  loop
	for(int i=0;i<=3;i++) {
		System.out.println(a[i]);
	}
	
	//using for each loop
	for(int i:a) {
		System.out.println(i);//
	}*/
		
		//creation of 2 D array 
		
		int a[][]= {{1,2,3},{3,4,5},{6,6,7},{8,9,6},{1,2,4}};

		/*for(int i=0;i<=4;i++) {
		for(int j=0;j<=2;j++){
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	}
	*/
//read data through enhanced for loop
for(int i[]:a) {
	for(int j:i) {
		System.out.print(j+" ");
	}
System.out.println();
}
}
}
