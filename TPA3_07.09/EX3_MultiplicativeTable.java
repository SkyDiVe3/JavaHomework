public class EX3_MultiplicativeTable{
	public static void main(String[] args) {
		int n = 7;
		for (int x=0;x<10;x++ ) {
			System.out.println();
			System.out.print(n);
			System.out.print('*');
			System.out.print(x);
			System.out.print('=');
			System.out.print(n*x);
		}
	}
}