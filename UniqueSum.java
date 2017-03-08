import java.io.*;
import java.util.*;
class UniqueSum{
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		System.out.println("Enter 5 integer values: ");
		
		for(int z=1;z<=5;z++){
			numbers.add(Integer.parseInt(br.readLine()));
		}
		HashSet<Integer> noDup = new HashSet<Integer>();
		ArrayList<Integer> notAllowed = new ArrayList<Integer>();	
		for(int n : numbers){
			if(noDup.add(n) == false){
				notAllowed.add(n);
			}
		}
		ArrayList<Integer> Allowed = new ArrayList<Integer>();
		for(int n : numbers){
			Allowed.add(notAllowed.contains(n) ? 0:n);
		}
		int sum=0;
		for(int n: Allowed){
			sum+=n;
		}
		System.out.print("Sum: "+sum);
	}
}