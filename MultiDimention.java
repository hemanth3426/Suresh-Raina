package Arrays;

public class MultiDimention {
	public static void main(String[] args) {
//		int x[][]=new int[6][3];
//		System.out.println(x.length);
//		System.out.println(x[0].length);//here 6 row 3 column;
//		[1 2 3] 0
//		[4 5 6] 1
//		[7 8 9] 2
//		[10 11 12] 3
//		[13 14 15] 4  
//		[16 17 18] 5
		
//		                         0                    1
//		                    0         1           0          1
//		                0  1  2    0  1  2      0  1    0   1   2  
		int x[][][]= {{{10,20,30},{40,50,60}},{{70,80},{90,100,110}}};
		System.out.println(x[0] [1] [1]);
		System.out.println(x[1] [1] [1]);
		System.out.println(x[0] [1] [2]);
		
//		int x[][]= {{10,20,30},{40,50,60}};
//		System.out.println(x[0][2]);
	}
}
