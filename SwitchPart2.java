
public class SwitchPart2 
{

	public static void main(String[] args) 
	{
		//in switch we can't use double//
		//in switch we can use char and string//
		char n = 'A';
		switch(n)
		{
		case 'A':
			System.out.println("one");
			break;
		case 'B':
			System.out.println("two");
		}
		
		String s="abc";
		switch(s)
		{
		case "abc" :
			System.out.println("Raja is a java developer");
			break;
			default:
				System.out.println("deffenetlly he will become one day ");
				break;
		}
	}

}
