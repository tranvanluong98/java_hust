import java.util.Scanner;
public class OrderCheck{
	public static void main(String[] args) {
		Scanner ip =  new Scanner(System.in);
		System.out.println("Ban hay nhap so thu nhat ");
		int a = ip.nextInt();
		System.out.println("Ban hay nhap so thu hai ");
		int b = ip.nextInt();
		System.out.println("Ban hay nhap so thu ba ");
		int c = ip.nextInt();
		 if((a< b&&b<c)||(a>b&&b>c)){
            System.out.println("True");
        }else 
            System.out.println("False");
	}
	System.out.println("He lo bay be");
}