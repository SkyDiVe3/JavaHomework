import java.util.Random;
public class EX4_UsingTernaryOperator{
	public static void main(String[] args) {
		Random rand = new Random();
		double num = rand.nextDouble()*100;
		String tip;
		System.out.println(num);
		tip=(num >= 999) ? "Large" : "Small";
		System.out.println("Tipul double="+tip);

	}
}