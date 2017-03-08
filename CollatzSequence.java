import java.io.*;
import java.util.*;
class CollatzSequence{
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Value: ");
		int n = Integer.parseInt(br.readLine());
		do
		{
			if(n%2==0){
				n = n/2;
				System.out.println(n);
			}else{
				n = (3*n)+1;
				System.out.println(n);
			}
		}while(n!=1);
	}
}