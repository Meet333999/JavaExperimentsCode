public class overriding{
	public static void main(String [] args){
		show obj = new show();
		int r1 = obj.add( 3,4);
		System.out.println(r1);	
	}
}

class demo{
	public int add(int n1, int n2){
		 
		return n1 + n2;	
	}
}

class show extends demo{
	public int add(int n1, int n2){
		return n1 + n2 + 1;
}
}
