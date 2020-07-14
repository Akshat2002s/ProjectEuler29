import java.util.*;
import java.math.*;
public class DisPow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger ans;
		ArrayList<BigInteger> num= new ArrayList<BigInteger>();
		int a=2;
		int b=2;
		for(a=2;a<=100;a++) {
			for(b=2; b<=100; b++) {
				ans=BigInteger.valueOf(a).pow(b);
				if(!num.contains(ans))
				num.add(ans);
			}
			
		}
		System.out.println(num);
		System.out.println(num.size());
	}
}

	