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
/*
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
*/
/*
import java.util.Scanner;
class prac4{
	public static void main(String[] args){
		int[] b = {1,2,3};
		int sum = 0;
		for(int j = 0 ; j <3 ;++j)
			sum+=b[j];
		System.out.println(sum);
	}
}
*/
/*
import java.util.Scanner;
class prac4{
	public static void main(String[] args){
		String[] s = {"java","flex","ruby"};
		for( int a = 0 ; a < s.length ; ++a)
			System.out.println(s[a]);
	}
}
*/
/*
class prac4{
	public static void main(String[] args){
		int[] i = {1,2,3,4,5,6};
		int[] ref;
		ref = prac4.array(i, 7);
		if(i == ref)
			System.out.println("���Ϲ迭����");
		else
			System.out.println("�ٸ��迭����");
		
		for(int j = 0 ; j < ref.length; ++j){
			System.out.print(ref[j]+"\t");
		}
			
		
		
	}
	public static int[] array(int[] i, int num){
		int sum = 0;
		for( int j = 0 ; j < i.length ; ++j){
			i[j] += num;
		}
		
		return i;
	}

	
}
*/
//q
/*
class prac4{

	public static void main(String[] args){
		
		int[] array = {59,12,35,222,4,3,123};
		int min = prac4.minValue(array);
		int max = prac4.maxValue(array);
		
		System.out.println(min);
		System.out.println(max);
		
				
	}

	public static int minValue(int[] arr){
		
		int min1 = arr[0];
		for( int j = 0; j < arr.length ; ++j){
			if ( arr[j] < min1 )
				min1 = arr[j];
			else
				min1 = min1;
		}
		return min1;	
	}
	public static int maxValue(int[] arr){
		int max1 = arr[0];
		for( int j = 0; j < arr.length ; ++j){
			if (arr[j] > max1)
				max1 = arr[j];
				
			else
				max1 = max1;
		}
		
		return max1;	
	}

}
*/
/*
class prac4{
	public static void main(String[] args){
		int[][] array = new int[3][4];
		for (int i = 0 ; i < array.length ; ++i){
		for ( int j = 0; j < array[i].length ; ++j){
			array[i][j] = i+j;
			System.out.print("\t"+array[i][j]);
			if ( j == array.length)
				System.out.println("");
		}
		}
		
	}
}
*/
/*
class prac4{
	public static void main(String[] args){
	
		int[][] array = new int[][]
		{	{1,2},
			{1,2,3},
			{1,2,3,4}
		};
		
		for (int a = 0 ; a < array.length ; ++a){
		for ( int b = 0; b < array[a].length; ++b){
			System.out.print(array[a][b]);
			if ( b == array[a].length - 1)
				System.out.println("");	
		}
		}
	
	
	}
}
*/
/*
class prac4{
	public static void main(String[] args){
		int[] ary = {1,2,3};
		int sum = 0;
		for ( int e : ary)
			sum += e;
		System.out.println(sum);

		for ( int e : ary){
			++e;
			System.out.print(e);
		}

		System.out.println("");

		for ( int e : ary){
			System.out.print(e);
		}


	}
}
*/
/*
import java.util.Scanner;

class prac4{

		public static void main(String[] args){
		
			int row, columm;
			row=5;
			columm = 5;
			int[][] ary = new int[row][columm];
			for ( int a = 0; a < row ; ++a){
				for ( int b = 0 ; b < columm ; ++b){
					if ( a < b)
						ary[a][b] = a;
					else if( a == b )
						ary[a][b] = 1;
					else
						ary[a][b] = b;
				}
			}

			for ( int[] r : ary){
				for ( int c : r){
					System.out.print(c);
				}
				System.out.println("");
			}
			
		}

}
*/
/*
class prac4{
	public static void main(String[] args)
	{
		Number[] arr = new Number[]{
			new Number(2),
			new Number(4),
			new Number(8),
		};
		
		for( Number e : arr)
			e.num++;
		for(Number e : arr)
			System.out.print(e.getNum()+" ");
		System.out.println("");
		for(Number e : arr)
		{
			e = new Number(5);
			e.num+=2;
			System.out.print(e.getNum()+" ");
		}
		System.out.println(" ");
		for(Number e : arr)
			System.out.print(e.getNum()+" ");
	}
}

class Number{
	public int num;
	public Number(int num){ this.num = num; }
	public int getNum() { return num; }
}
*/
/*
class prac4{
	public static void main(String[] args){
		for(String e : args)
			System.out.println(e);
	}
}
*/