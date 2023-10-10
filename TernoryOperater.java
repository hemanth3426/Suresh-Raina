package Operaters;

public class TernoryOperater {
	public static void main(String[] args) {
		int a = 10;
        int b = 20;
        int c = 15;
        int d = 25;
        int e = 30;

//        int max=(a>b && a>c)?a:
//        	    (b>a && b>c)?b:c;
        
        int max=(a>b && a>c && a>d && a>e)?a:
        	    (b>a && b>c && b>d && b>e)?b:
        	    (c>a && c>b && c>d && c>e)?c:
    		    (d>a && d>b && d>c && d>e)?d:e;
        
        int min=(a<b && a<c && a<d && a<e)?a:
        	    (b<a && b<c && b<d && b<e)?b:
        	    (c<a && c<b && c<d && c<e)?c:
        	    (d<a && d<b && d<c && d<e)?d:e;
        	      
     
    		
                

      System.out.println("The maximun number is:"+max);
      System.out.println("The minimum number is:"+min);
	}

}
