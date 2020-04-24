package com.syntax.class09;

public class Deneme1 {

	public static void main(String[] args) {
		
		for(int i=1; i<=3; i++) {
			System.out.println("I'm boy");
			
			for(int k=1; k<=3; k++) {
				System.out.println("she is a girl");
			}
			
		}
		for(int c=1; c<=3; c++) {
			
			for(int a=1; a<=3; a++) {
				System.out.println(c+" "+a);
			}
		}
		System.out.println("PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP");
		//using nested loop to print 10 until 99
		
		for(int i=1; i<=9; i++) {
			for(int y=0; y<=9; y++) {
			System.out.println(i+""+y);
			
	}
		}
		System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
		//using nested loop to print clock
		
		for(int h=0; h<24; h++) {
			for(int m=0; m<60; m++) {
				
				if (m < 10) {
					System.out.println(h + ":0" + m);
				}else {
					System.out.println(h + ":" + m);
				}
				
			}
		}
		System.out.println("OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOo");
		for(int n=0; n<=9; n++) {
			for(int m=0; m<=9; m++) {
				for(int v=0; v<=9; v++) {
					for(int c=0; c<=9; c++) {
						System.out.println(n+""+m+""+v+""+c);
					}
				}
			}
		}
	
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		
		for(int a=1; a<=5; a++) {
			
				System.out.print("*");
				
		}
		
		System.out.println();
		System.out.println("--- PRINTING PATTERN USING NESTED LOOPS -----------");
		
		System.out.println();
		
		
		for(int i=1; i<=4; i++) {
			
			for(int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}"); //mine own examle.
		
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=4; j++) {
				
				if (i==1 || i==4 || j==1 || j==4) {
					System.out.print("$");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("????????????????????????????????????????????????????????????????????");
		
		for(int a=1; a<=10; a++) {         //rows
			for(int b=1; b<=9; b++) {      //colons
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVv");
		
		for(int o=1; o<=5; o++) {
			for(int v=1; v<=9; v++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
		
		for(int i=1; i<=5; i++) {
			for(int b=1; b<=5; b++) {
				System.out.print(b);
			}
			System.out.println();
		}
		System.out.println("ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ");
		
		for(int i=1; i<=5; i++) { //rows
			
			for(int j=1; j<=9; j++) {//colons
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBb");
		
		for(int i=1; i<=5; i++) {
			
			for(int b=5; b>=1; b--) {
				System.out.print(b);
			}
			System.out.println();
			
		}
		System.out.println("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
		
       for(int i=5; i>=1; i--) {
			
			for(int b=5; b>=1; b--) {
				System.out.print(i);
			}
			System.out.println();
       }
       System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
       
       for(int r=1; r<=4; r++) {
    	   
    	   for(int c=1; c<=r; c++) {
    		   System.out.print("*");
    	   }
    	   System.out.println();
       }
       System.out.println("========================================================================================");
       
       for(int r=1; r<=5; r++) {
    	   
    	   for(int c=1; c<=r; c++) {
    		   System.out.print(c+" ");
    	   }
    	   System.out.println();
       }
       System.out.println("YYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY");
       
       for(int i=5; i>=1; i--) {
    	   
    	   for(int j=1; j<=i; j++) {
    		   System.out.print(j);
    	   }
    	   System.out.println();
    	   
       }
       System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
       
       for(int i=1; i<=5; i++) {
    	   
    	   for(int j=1; j<=i; j++) {
    		   System.out.print("*"+" ");
    	   }
    	   System.out.println( );
       }
		
       for(int i=4; i>=1; i--) {
    	   for(int j=1; j<=i; j++) {
    		   System.out.print("*"+" ");
    	   }
    	   System.out.println();
       }
       System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
       
       
       for(int i=1; i<=7; i++) {
    	   for(int j=1; j<=i; i++) {
    		   System.out.println();
    	   }
    	   System.out.println();
       }
       
       
       
       
       
	}

}
