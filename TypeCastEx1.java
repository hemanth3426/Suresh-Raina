package TypeCast;
//lower to higher datatype conversion(implicit)
//highest to lower (explicit)
public class TypeCastEx1 {
	public static void main(String[] args) {
		byte b=123;
		int c=b;//implicit
		System.out.println(c);
		
        double p=27.34;
        float q=(float)p;
        System.out.println(q);
		
		int num=1038465843;
		double d=num;
		System.out.println(d);
		
		double d1=248.454;
		int i=(int)d1;//explicit
		System.out.println(i);
	
		float e=877888798;
		int f=(int)e;
		System.out.println(f);
		
	}

}
