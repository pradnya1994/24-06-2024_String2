package javaStrings;

public class RelationalOperator {


	public static void main(String[] args) 
	{	
		//1.Creating the string object by String Literal way
		String text1 = "Welcome";
		String text2 = "Welcome";
		String text3 = "Welcome to learn Java Strings";
		String text4 = "Welcome to first java string program";
		
		System.out.println(text1.hashCode());
		System.out.println(text2.hashCode());
		System.out.println(text3.hashCode());
		System.out.println(text4.hashCode());

		System.out.println(text1 == text2);// == relational operator checking the reference of the sting
		System.out.println(text1 == text3);


		System.out.println("------------------------------------");
		//2.Creating the string object by using new keyword
		String text11 = new String("Welcome Pradnya");
		String text12 = new String("Welcome Mukund");
		String text13 = new String("Welcome to Java Strings class");
		String text14 = new String("Welcome to first java string program").intern();
		
		System.out.println(text11.hashCode());
		System.out.println(text12.hashCode());
		System.out.println(text13.hashCode());
		System.out.println(text14.hashCode());
		
		System.out.println(text11 == text12);
		System.out.println(text11 == text13);
		System.out.println("------------------------------------");
		System.out.println(text4 == text14);//true
		
	}

}
