package session1;
import java.util.*;

public class libraryproject {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Who are you ? Admin or Student");
	String a = sc.nextLine();
	if(a.equalsIgnoreCase("admin"))
	{
		System.out.println("Enter admin password");
		String passA = sc.next();
		if(passA.equalsIgnoreCase("Admin123"))
		{
			System.out.println("Who want to issue the book");
			String i = sc.next();
			String arr[] = {"Divyansh" , "Yash" , " Vivek" , " Uvais" , " Anshul" , " Harsh" ," Muskan" , " Ankit" , " Jai" };
			for(int j=0;j<arr.length;j++)
			{
				if(i.equalsIgnoreCase(arr[j]))
				{
					System.out.println("Logged In");
					System.out.println("Which book " + i + " want to issue?");
					String b = sc.next();
					String ar[] = {"java" , "c++" , "pyhton" , "mysql" , "html" , "css" ,"django" , "how to kill your friend in 10 days" , "how to have a girlfriend" };
					for(int k=0;k<ar.length;k++)
					{
						if(b.equalsIgnoreCase(ar[k]))
						{
							System.out.println("OK! System is issuing " + ar[k] + " to " + i);
							double date = Math.floor(Math.random()*10);
							System.out.println(i + " will return the book in " + date + " days.");
							break;
						}
						else
						{
							System.out.println("Book ka naam toh sahi daal lo sir. Aap rehne do. Try  Next time!");
							break;
						}
				}
					break;
				}
				else
				{
					System.out.println("Naam bhi galat waah.Try next time by entering first letter capital and rest small. ");
					break;
				}	
			}
			
		}
		else
		{
			System.out.println("Sir kahin pe password likh lo kyun ki shayad aapko yaad nhi h .Try next time!");
		}
	}
	else if(a.equalsIgnoreCase("student"))
	{
		System.out.println("Enter your name?");
		String s = sc.next();
		String arr[] = {"divyansh" , "yash" , "vivek" , "uvais" , "anshul" , "harsh" ,"muskan" , "ankit" , "jai" };
		for(int i=0;i<arr.length;i++)
		{
			if(s.equalsIgnoreCase(arr[i]))
			{
				System.out.println("Enter your school I'D?");
				int id = sc.nextInt();
				int ap[] = {012,013,014,015,016,017,123,111,101};
				for(int m=0;m<ap.length;m++)
				{
					if(ap[m] ==id)
					{
						System.out.println("You are marked present");
						System.out.println("Logging in");
						System.out.println("Showing you some of the books name. If want to issue anyone , then tell your admin he will do the same.");
						System.out.println(" java , c++ ,  pyhton ,  mysql ,  html ,  css , django ,  how to kill your friend in 10 days,  how to have a girlfriend");
						System.out.println("Which book do you like?");
						int chos = sc.nextInt();
						System.out.println("Ok noted just inform your admin.");
						System.out.println("Logged out");
						break;
					}
				}break;
			}
			else
			{
				System.out.println("ERROR!");
				break;
			}
		}
		
	}
	else 
	{
		System.out.println("Who are you?");	
	}
	
}
}
