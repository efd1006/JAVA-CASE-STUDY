import java.io.*;
import java.util.*;
class PrimeNumber{
	static String msg = "Prime";
	public static boolean isPrime(int n){
		if(n==0){
			return false;
		}
		return true;
	}
	public static void compute(int number){
		int t;
		for(int z=2;z<=number/2;z++){
			t = number%z;
			if(isPrime(t) == false){
				msg = "Not prime";
				break;
			}
		}
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Value: ");
		int n = Integer.parseInt(br.readLine());
		compute(n);
		System.out.println(msg);
	}
}