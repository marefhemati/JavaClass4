package loops;

public class ForEachLoop {

	public static void main(String[] args) {
		String a = "apple";
		char[] myarray = a.toCharArray();
		//or
		String[] names = {"TOM", "MIKE", "BOB", "STEVE"};
		//The formulla for for each loop array is almost same like for loop 
		//for(here we the data type and a name : here we add the group data name ){}
		
		for(char item :myarray) {
			System.out.println(item);
				
		}
		for(String myname : names) {
			System.out.println(myname);
		}
		}
		

	}


