package Operaters;
// >>(right shift),<<(left shift)
public class ShiftOperater {
	public static void main(String[] args) {
		int a=10;
		int b=a>>1;
		//1010=10 => we have to right 1 shift => 0101=5.
		
		int c=a>>2;
		
		int d=a<<1;
		System.out.println(d);
	}
}
