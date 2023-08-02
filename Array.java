class Ar{
	public static void main(String[] args){
		//Types of declaration of ARRAY
		int[] a={12,23,34,45};
		int []b={2,3,6,4};
		int c[]={8,9,10,12};
		int[] d; //Declaring variable and inatantiating below
		d= new int[5];//instantiation
		d[0]=1;// initializing values --> we can assign values upto the size mentioned above
		d[2]=3;// we can also update values like d[0]=5; , a[0] =10;
		String[] e={"Nandu", "Pandu", "Singham", "Neha", "Lavanya", "BT", "Neeraj"};
		// ACCESSING
		/* Accessing can be done using index...a[0],a[1],b[3]...
		1...Direct Accessing
		2...Using loops (traversing Array) (for loop and for each loop)
		*/
		System.out.println(a[0]);//12
		System.out.println();
		System.out.println();
		for(int i=0;i<b.length;i++){
			System.out.println(a[i]);//12 23 34 45
		}
		System.out.println();
		System.out.println();
		for(int i:c){//for each loop
			System.out.println(i); //  8 9 10 12
		}
		System.out.println();
		System.out.println();
		//length property ---> used to find the size of array----> syntax : arr_name.length
		// length method ---> used to find the length of String ---> syntax : Str_name.length() 
		System.out.println(c.length); // 4
		System.out.println(e[0].length()); //5
	}
}