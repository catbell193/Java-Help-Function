class Help {
	public static void main(String[] args) 
	  throws java.io.IOException {
	  	char selection;

			
		System.out.println("Help on:\n  1. if\n  2. switch\n  3. for\n  4. while\n  5. do-while\n  6. continue\n  7. break");
			
		selection = (char) System.in.read(); 
		char ignore;
		

		while(selection != 'q'){

			


		 	if( selection == '1' ) {
				System.out.println("The if :\n\nif(condition) statement;\nelse statement;");
			}

			else if( selection == '2') {
				System.out.println("The switch:");
				System.out.println("switch(expression) {"); 
				System.out.println(" case constant:");
				System.out.println("  statement sequence");
				System.out.println("  break;");
				System.out.println(" // ...");
				System.out.println("}");
			}

			else if( selection == '3' ){
				System.out.println("for(initialization; condition; iteration)");
				System.out.println("{");
				System.out.println(" statement sequence");
				System.out.println("}");
					
			}

			else if( selection == '4'){
				System.out.println("while (condition) {");
				System.out.println("   statement sequence");
				System.out.println("}");
			}

			else if( selection == '5'){
				System.out.println("do {");
				System.out.println("  statements;");
				System.out.println("} while(condition;");
			}
			else if( selection == '6'){
				System.out.println("continue;");
			
			}

			else if( selection == '7'){
				System.out.println("break;");
			
			
			}
			else 
				{
				System.out.println("Please Enter a number from the Help Menu provide and enter q to quit");
				
				
			}

			do{
				ignore = (char) System.in.read();
			} while( ignore != '\n');

			selection = (char) System.in.read(); 



				
		
			

		}

		 

		
	}
}