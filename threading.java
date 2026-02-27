package class1;

class Cake extends Thread{
	public void run() {
		System.out.println("Mixing Ingredients for Cake "+Thread.currentThread().getId());
		System.out.println("Backing Cake "+Thread.currentThread().getId());
		System.out.println("Decorating Cake "+Thread.currentThread().getId());


	}
}
public class ThreadBaking {

	public static void main(String[] args) {
	
		int cakecount = 4;
		for(int i=0;i<cakecount;i++)
			Cake cake = new Cake();
			cake.start();


	}

}
