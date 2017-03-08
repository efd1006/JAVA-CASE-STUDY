import java.io.*;
import java.util.*;
class GCD{
	public static int gcd(int a, int b){
		if(b==0){
			return a;
		}else{
			return gcd(b,a%b);
		}
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("One: ");
		int first_num = Integer.parseInt(br.readLine());
		System.out.print("Two: ");
		int second_num = Integer.parseInt(br.readLine());
		System.out.println("GCD: "+gcd(first_num,second_num));
	}
}