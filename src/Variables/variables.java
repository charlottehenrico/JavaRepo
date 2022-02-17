
package Variables;

	public class variables {
		//Practice Create a variable called myName of type String
		
		public static void main(String[] args) {
			System.out.println( "Hello World");
			String myName = "Charlotte";
			System.out.println(myName);
		

//		//Create a variable called myNum of type int and use an operator to sum the total and pring out answ
//		int myNum = 100+50;
//		System.out.println(myNum);
//		
//		//Create a variable called myBoolean with true and false conditions and print both
//		//boolean myBoolean (true,false);
//		
//		//Operators: + - * /
//		int myMinusSum = 1000-240;
//		int mySumTwo = myMinusSum*5;
//		int myFinalAnsw = mySumTwo/2;
//		System.out.println(myFinalAnsw);
//		
//		//Modus: Returns whatever remains after the answer like 3/2 modus would be .5
//		int x = 5;
//		int y = 2;
//		System.out.println(x%y);
//		
//		//Increment:++ or -- will increment or decrement
//		int z = 5;
//		--z ;
//		System.out.println(z);
//		
//		////assignment operats
//		int a = 5;
//		//x = x + 3;
//		a += 3;
//		System.out.println(a);
//
//		//other assignment operators
//		/*=-
//		* \/*
//		* %=
//		*/
//		
//		////Java Comparison Operators
//		// == Equal to
//		// != not equal to
//		// > greater than
//		// < smaller than
//		// >= greater than or equal to
//		// <= smaller than or equal to
//
//		int b = 10;
//		int c = 10;
//		System.out.println(b == c);
//		
//		////Logical operators
//		//int x = 5;
//		//and //System.out.println(x > 3 && x < 10);
//		//or //System.out.println(x > 3 || x < 2 );
//		//not // System.out.println(!(x > 3 && x < 10));
//		
//		//String object
//		String txt = "ABCDEF";
//		System.out.println("The lenght of the text is"+ txt.length());
//		
//		//other string methods
//		String txtb = "Hello World";
//		System.out.println(txtb.toUpperCase());
//		System.out.println(txtb.toLowerCase());
//		
//		//index of -remember returned value of -1 means the value is not found, and index starts at 0
//		String txtc = "Please locate where the 8 the char is";
//		System.out.println(txtc.indexOf("8"));
//		System.out.println(txtc.indexOf("P"));
//		
//		//// the int will be automatically converted to string when concatted in this manner
//		//System.out.println(firstName + " " + x);
//
//		// special chars
//		//String txt = "We are the so-called \"Vikings\" from the north";
//		System.out.println(txt);
//
//		String txt1 = "We are the so-called 'Vikings' from the north";
//		System.out.println(txt1);
//
//		String txt3 = "We are the so-called \\Vikings\\ from the north";
//		System.out.println(txt3);
//		
//		//Concat
//		String firstName = "John";
//		String lastName = "Doe";
//		System.out.println(firstName + " " + lastName);
//		
//		//Java uses the + operator for both addition and concatenation.
//		//Numbers are added. Strings are concatenated.
//		int xx = 10;
//		int yy = 10;
//		int zz = x + y;
//		System.out.println(z);
//
//		String xxc = "10";
//		String yvy = "20";
//		//String zzv = xxc + yd;
//		System.out.println(zz);
//		
//		String s1 = "AutomationProgramS12022";
//		String s2 = "2022-02-08";
//		// account number: 44444
//		System.out.println(s1.substring(2,4));
//		System.out.println(s1.substring(5,7));
//		System.out.println(s2.substring(0,4));
//		System.out.println(s2.substring(5,7));
//		// Revese substring
//		System.out.println(s1);
//		
//		//Random
//		int randonNum = (int)(Math.random() *101);
//		System.out.println(randonNum);
//		
//		//Boolean Values
//		boolean isJavaFun = true;
//		boolean isFishTasty = false;
//		System.out.println(isJavaFun);
//		System.out.println(isFishTasty);
//		
//		//IF statements with variable int
//		int e = 20;
//		int f = 18;
//		if (20>18) {
//			System.out.println ("20 is greater than 18");
//		}
//		
//		int time1 = 20;
//		if (time1 < 18) {
//			System.out.println("good day.");
//		} else {
//				System.out.println ("good evening");
//			}
//		
//		
//		//int time1 = 20;
//		if (time1 < 18) {
//			System.out.println("good day.");
//		} else if (time1 < 20) {
//				System.out.println ("good evening");	
//		} else if (time1 < 10) {
//			System.out.println ("good morning");
//		}
//		
//	
//	int age = 39;
//	if (age < 13) {
//		System.out.println("child");
//	} else if (age  < 21) {
//			System.out.println ("teen");	
//	} else if (age >= 21) {
//		System.out.println ("adult");
//	}
//	
//	int time1 = 17;
//	String result1 = (time1 < 18) ? "good day." : "Good evening.";
//	System.out.println(result1);
	
//	
//		int day1 = 1;
//		switch (day1) {
//		case 6:
//		System.out.println("Saturday");
//		break;
//		case 7:
//		System.out.println("Sunday");
//		break;
//		default:
//		System.out.println("Looking forward to the weekend");
//		}
			
			//while loops
//			int i = 0;
//					while(i<5) {
//						System.out.println (i);
//						i++;
//					}
			
//			int i = 0;
//			do {
//				System.out.println (i);
//				i++;
//			}
//			while (i<5);
			
//			for (int i = 0; i < 5; i++) {
//				System.out.println(i);
//				}
//			 for (int i = 0; i<=10;i=i+2) {
//				 System.out.println(i);
//			 }
			
			//create a string array of 4 or more fruit
			// use an appropriate loop
			// to print the fruit similar to "the fruit is apple"
//			
//			String[] fruit = {"Blueberry","Strawberry", "Youngberry", "Gooseberry"};
//			for (String i: fruit) {
//				System.out.println("The fruit is " + i);
//			}
			
		//  Another example to try: create a string array of 4 of more friends
		// use and appropriate loop
		//t o print the friend similar to "this is my best friend Shane"

			//Question Write a Java program to print 'Hello' on screen and then print your name on a separate line.

	
	}

	}

