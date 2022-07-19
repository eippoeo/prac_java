/*
class prac4{

	public static void main(String[] args){
		
		Friend myName0 = new Friend("klasicniov");
		Friend myName1 = new Friend("movlobski");
		
		System.out.println(myName0);
		System.out.println(myName1);
		
		System.out.print("이름이");
		System.out.print("출력되었습니다.");
		System.out.println("");
		
	}
}

class Friend{

	String myName;

	public Friend(String name){
		myName = name;
	}
	public String toString(){
		return "이름은"+myName+"입니다.";
	}
	
}
*/
/*
class prac4{
	public static void main(String[] args){
		int age = 20;
		double tall = 174.7;
		String name = "홍자바";

		System.out.printf("제 이름은 %s입니다.\n", name);
		System.out.printf("제 키는 %e입니다.\n", tall);
		System.out.printf("제 나이는 %d입니다.\n", age);
		System.out.printf("%d %o %x \n", 77, 77, 77);
		System.out.printf("%g %g \n", 0.00014, 0.000014);
	
	}
}
*/
/*
import java.io.*;

class prac4{
	public static void main(String[] args){
		try{
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			System.out.print("정수 입력 : ");
			String str= br.readLine();
			int num = Integer.parseInt(str);
			System.out.println("입력된 정수 : " + num);
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}
*/
/*
import java.util.Scanner;

class prac4{
	
	public static void main(String[] args){
	
		String source = "1 5 7";
		Scanner sc = new Scanner(source);
			
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = num1 + num2 + num3;
		System.out.printf(" %d, %d, %d, %d", num1, num2, num3, num4);
		

	}
}
*/
/*
import java.util.Scanner;

class prac4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = num1 + num2 + num3;
		
		System.out.printf(
		" %d, %d, %d, %d",num1,num2,num3,num4);

	}
}
*/
import java.util.Scanner;

class prac4{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("what your name\t");
		String name = input.nextLine();
		System.out.print("안녕하세요?" + name + "입니다\n");
		
		System.out.print("당신은 스파게티를 좋아한다는데, 진실입니까?\n");
		boolean tof = input.nextBoolean();
		System.out.print( tof);
		if (tof)
			System.out.println("오 저도 좋아합니다");
		else
			System.out.println("오 저는 좋아합니다.");
		System.out.println("당신과 형제의 키는 어떻게 됩니까?");
		
		double hu = input.nextDouble();
		double hby = input.nextDouble();
		
		double term = hu - hby;
		if ( term < 0)
			System.out.printf("당신이 %.2f 만큼 작군요?", term);
		else if ( term == 0)
			System.out.printf("키가 똑같아요? 신기하네요");
		else
			System.out.printf("당신이 %.2f 만큼 크군요?", term);
	}
}
