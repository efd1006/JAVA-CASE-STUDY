import java.io.*;
import java.util.*;
class EvenlySpaced{
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		System.out.println("Enter 5 integer values: ");
		int temp=0;
		int current;
		String message="";
		for(int z=1;z<=5;z++){
			current = Integer.parseInt(br.readLine());
			if(current>temp){
				numbers.add(current);
				temp=current;
			}else{
				System.out.println("Error");
				System.exit(0);
			}
		}
		Collections.sort(numbers);
		for(int x=0;x<numbers.size();x++){
			if(numbers.get(x)%2 == 0){
				message = "EVENLY SPACED";
			}else{
				message = "NOT EVENLY SPACED";
				break;
			}
		}
		System.out.println(message);
	}
}