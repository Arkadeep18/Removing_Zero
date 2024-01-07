import java.util.*;
public class Prac114Assgn_Q9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("ENter n");
		int n = sc.nextInt();
		
		int result = 0;
		int placevalue = 1;
		int lastdigit;
		
		while(n!=0) {  //n will continue until it gets 0
			lastdigit = n%10;
			if(lastdigit!=0) {
				result = result +lastdigit*placevalue;
				placevalue = placevalue*10;
			}
			n = n/10;
		}
		System.out.println("after removing 0 from "+ n + "the new number is "+ result);
		
		
		
		
	}

}
