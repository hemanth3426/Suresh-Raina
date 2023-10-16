package Examples;

public class Clone {
	public static void main(String[] args) {
		//single dimensional array
//		int[] a= {1,2,3,4,5};
//		int[] b=a.clone();//array values copied into different memory adress(deep copy)
//	    System.out.println(a==b);//different memory adress(deep copy)
	    
//		int i;
//		for(i=0;i<a.length;i++) {
//			System.out.println(b[i]);
//		}
		
		//multi dimensional array
		int[][] c= {{1,2,3},{4,5,6},{7,8,9}};
		int[][] d=c.clone();
		System.out.println(c[0]==d[0]);//same memory adress(shallow copy)
		System.out.println(c[1]==d[1]);
		System.out.println(c[2]==d[2]);
		
	}

}
