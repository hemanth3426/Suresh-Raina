package Examples;

public class Enum {
		  enum Level {
			    LOW,
			    MEDIUM,
			    HIGH
			  }
		  enum week{
			  sun,
			  mon,
			  tue,
			  wed,
			  thu,
			  fri,
			  sat;
		  }
		  
		  enum month{
			  jan,feb,mar,apr,may,jun,jul,aug,sep,oct,nov,dec;
		  }
		  
		 

		public static void main(String[] args) {
			// TODO Auto-generated method stub
				 Level myVar = Level.LOW; 
				 System.out.println("The level is: " +myVar);
			     
			     Level MyVar1=Level.MEDIUM;
			     System.out.println("Your Level is:"+MyVar1);
				 
				 week day=week.sat;
				 System.out.println("Today is:"+day);
				 
				 month year=month.sep;
				 System.out.println("The month is:"+year);
		}



}
