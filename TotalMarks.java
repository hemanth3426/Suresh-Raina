package Operaters;

public class TotalMarks {
	public static void main(String[] args) {
		int TotalMarks=600;
		
		int maths=85;
		int IOT=80;
		int NoSql=85;
		int English=90;
		int Hindi=97;
		int Management=70;
		double Total=maths+IOT+NoSql+English+Hindi+Management;
		double percentage=Total*100/TotalMarks;
		System.out.println(Total);
		System.out.println("Percentage:"+percentage+"%");
		
	}
}
