public class wrapper{
	public static void main(String [] args){
		int num1 = 7;
		Integer num2 = num1;

		int num3 = num2;
		System.out.println(num3);

		String str = "1234";
		Integer num4 = Integer.parseInt(str);
		System.out.println(num4);
	}
}