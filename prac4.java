/*
class prac4{

	public static void main(String[] args){
		
		Friend myName0 = new Friend("klasicniov");
		Friend myName1 = new Friend("movlobski");
		
		System.out.println(myName0);
		System.out.println(myName1);
		
		System.out.print("�̸���");
		System.out.print("��µǾ����ϴ�.");
		System.out.println("");
		
	}
}

class Friend{

	String myName;

	public Friend(String name){
		myName = name;
	}
	public String toString(){
		return "�̸���"+myName+"�Դϴ�.";
	}
	
}
*/
/*
class prac4{
	public static void main(String[] args){
		int age = 20;
		double tall = 174.7;
		String name = "ȫ�ڹ�";

		System.out.printf("�� �̸��� %s�Դϴ�.\n", name);
		System.out.printf("�� Ű�� %e�Դϴ�.\n", tall);
		System.out.printf("�� ���̴� %d�Դϴ�.\n", age);
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
			System.out.print("���� �Է� : ");
			String str= br.readLine();
			int num = Integer.parseInt(str);
			System.out.println("�Էµ� ���� : " + num);
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
		System.out.print("�ȳ��ϼ���?" + name + "�Դϴ�\n");
		
		System.out.print("����� ���İ�Ƽ�� �����Ѵٴµ�, �����Դϱ�?\n");
		boolean tof = input.nextBoolean();
		System.out.print( tof);
		if (tof)
			System.out.println("�� ���� �����մϴ�");
		else
			System.out.println("�� ���� �����մϴ�.");
		System.out.println("��Ű� ������ Ű�� ��� �˴ϱ�?");
		
		double hu = input.nextDouble();
		double hby = input.nextDouble();
		
		double term = hu - hby;
		if ( term < 0)
			System.out.printf("����� %.2f ��ŭ �۱���?", term);
		else if ( term == 0)
			System.out.printf("Ű�� �Ȱ��ƿ�? �ű��ϳ׿�");
		else
			System.out.printf("����� %.2f ��ŭ ũ����?", term);
	}
}
