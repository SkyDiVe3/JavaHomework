import java.util.Random;
public class EX2{
	public static void main(String[] args) {
		Random rand = new Random();
		int n=rand.nextInt(10), i=0;
		int raspuns;
		while(i<=10){
			raspuns+=i;
			i++;
		}
		System.out.println("Raspuns="+raspuns);

		Random rand = new Random();
		int n=rand.nextInt(10), i=0;
		int raspuns;
		do{
			raspuns+=i;
			i++;
		}while(i<=10);
		System.out.println("Raspuns="+raspuns);

	}
}