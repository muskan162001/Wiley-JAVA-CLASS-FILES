package lambda;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.*;

public class BuiltInPredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Predicate<String>checkLength=(String str)->str.length()== 4;
	List<String>f1=Arrays.asList("Java","Python","angular","Jira");
	
	f1.forEach(l->{
		if(checkLength.test(l)) {
			System.out.println(l);
		}
	});
	}

}