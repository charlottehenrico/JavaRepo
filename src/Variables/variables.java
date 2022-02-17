package Variables;

public class variables {

	package jbasics;

	public class Variables {
		//Practice Create a variable called myName of type String
		public static void main(String[] args) {
		String myName = "John";
		System.out.println(myName);
		

		//Create a variable called myNum of type int and use an operator to sum the total and pring out answ
		int myNum = 100+50;
		System.out.println(myNum);
		
		//Create a variable called myBoolean with true and false conditions and print both
		//boolean myBoolean (true,false);
		
		//Operators: + - * /
		int myMinusSum = 1000-240;
		int mySumTwo = myMinusSum*5;
		int myFinalAnsw = mySumTwo/2;
		System.out.println(myFinalAnsw);
		
		//Modus: Returns whatever remains after the answer like 3/2 modus would be .5
		int x = 5;
		int y = 2;
		System.out.println(x%y);
		
		//Increment:++ or -- will increment or decrement
		int z = 5;
		--z ;
		System.out.println(z);
		
		////assignment operats
		int a = 5;
		//x = x + 3;
		a += 3;
		System.out.println(a);

		//other assignment operators
		/*=-
		* \/*
		* %=
		*/
		
		////Java Comparison Operators
		// == Equal to
		// != not equal to
		// > greater than
		// < smaller than
		// >= greater than or equal to
		// <= smaller than or equal to

		int b = 10;
		int c = 10;
		System.out.println(b == c);
		
		////Logical operators
		//int x = 5;
		//and //System.out.println(x > 3 && x < 10);
		//or //System.out.println(x > 3 || x < 2 );
		//not // System.out.println(!(x > 3 && x < 10));
		
		//String object
		String txt = "ABCDEF";
		System.out.println("The lenght of the text is"+ txt.length());
		
		//other string methods
		String txtb = "Hello World";
		System.out.println(txtb.toUpperCase());
		System.out.println(txtb.toLowerCase());
		
		//index of -remember returned value of -1 means the value is not found, and index starts at 0
		String txtc = "Please locate where the 8 the char is";
		System.out.println(txtc.indexOf("8"));
		System.out.println(txtc.indexOf("P"));
		
		//// the int will be automatically converted to string when concatted in this manner
		System.out.println(firstName + " " + x);

		// special chars
		String txt = "We are the so-called \"Vikings\" from the north";
		System.out.println(txt);

		String txt1 = "We are the so-called 'Vikings' from the north";
		System.out.println(txt1);

		String txt3 = "We are the so-called \\Vikings\\ from the north";
		System.out.println(txt3);
		
		//Concat
		String firstName = "John";
		String lastName = "Doe";
		System.out.println(firstName + " " + lastName);
		
		//Java uses the + operator for both addition and concatenation.
		//Numbers are added. Strings are concatenated.
		int x = 10;
		int y = 10;
		int z = x + y;
		System.out.println(z);

		String xx = "10";
		String yy = "20";
		String zz = xx + yy;
		System.out.println(zz);
		}	

	}

}
