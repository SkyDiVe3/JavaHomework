import java.util.Random;
public class EX6_SelectiveIteration{
	public static void main(String[] args) {
		Random rand = new Random();
		int num;
		int pass=0,i=0;
		
		do{
			num=rand.nextInt(2000);
			pass=(2000>num & num>1000)? 1 : 0;
		}while(pass==0);
		System.out.println("Num="+num);
		
		while(i<num){
			 int x=1;
			 
			if (i%3==0) {
				i++;
				continue;
				
			}
			else if(((i+5)%7)==0){
				i++;
				continue;

			}
			else if(i%10==0){
				i++;
				continue;
			}
			else{
				System.out.println(x+')'+i);
				x++;
				i++;
			}

			
		}
	}
}