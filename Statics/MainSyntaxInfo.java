
public class MainSyntaxInfo {
	//1. public : full visibility
	//2. static : MainSyntaxInfo.main(....), 
	//to start with execution method should in the memory
	//3. void : does not return anything
	//4: main : predefined method name :main 
	//5: String array : used to take command line arguments
	public static void main(String[] ar) { // {"","","",""}
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]+"  "+i);
		}
		String sum="";
		for(int i=0;i<ar.length;i++) {
			sum=sum+ar[i];
		}
		System.out.println(sum);
		String a[]={"neosoft technologies","rabale"};
		test(a);

	}
	public static void test(String[] ar) {
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]+"  "+i);
		}
	}
}
