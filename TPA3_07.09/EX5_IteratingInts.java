import java.util.Random;
public class EX5_IteratingInts{
	public static void main(String[] args) {
		Random rand = new Random();
		
		int num=rand.nextInt(10)+1;
		System.out.println("Num="+num);
		for (int i= 1; i<=num ; i++) {
			for (int y=1; y<=i ; y++) {
				
				System.out.print(i);
			}
			System.out.println();
		}
	}
}