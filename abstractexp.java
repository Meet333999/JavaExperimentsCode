public class abstractexp{
	public static void main(String [] args){
		tata obj = new tata();
		obj.drive();
		obj.playmusic();
	}
}


abstract class car{
	public abstract void drive();
	public void playmusic(){
		System.out.println("Music Start");
	}
}

class tata extends car{
	public void drive(){
		System.out.println("accelerate");
	}

}


