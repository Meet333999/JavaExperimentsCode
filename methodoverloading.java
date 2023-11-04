class methodoverloading{
	int addition(int a, int b)
 	{
	   return(a+b);
	}
	int addition(int a, int b, int c)
	{
	   return(a+b+c);
	}
	double addition(double a, double b)
	{
	   return(a+b);
	}

	public static void main(String args[])
	{
		methodoverloading m = new methodoverloading();
		System.out.println(m.addition(20,30));
		System.out.println(m.addition(10,20,30));
		System.out.println(m.addition(10.55,30.55));	
	}
}