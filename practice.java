/*
scope Ȯ���� �ϱ�
data size Ȯ�� ��ü ��� : e.g.) ���� -- Integer.BYTES
Boolean.parseBoolean(); -- ���ڿ��� boolean������ ����ȯ
����� ���� ����� �������� ���� ��
*/
/*
class test_prompt
{
	public static void main(String[] args)
	{
		int a;
		int b;
		a = 0;
		b = 1;
		System.out.println( ++b << 2 );
		System.out.println( b++ << 2 );
		System.out.println( ++b << 2 + a < ++b << 2 + b );
		System.out.println( ++b << 2 + a);
		System.out.println( ++b << 2 + b);
		System.out.println( a & b);
		
	}
}
*/
//1. 2's complement of 7
// check bit's sheet
// msb error value check
/*
class test_prompt
{
	public static void main(String[] args){

	int a = 7;
	int b = 15678;
	int c = 4; //3rd sheet
	int d = 16; // 5th sheet
	int e = 1;
	System.out.println(~a +1); //2'scomplement
	System.out.println(b & c); //too many variable, when express 2's 
	System.out.println(b & d); // too many variable when express 2's
	System.out.println((b << 28)>>>31); 
	System.out.println((b <<26)>>>31);
	System.out.println(c << 29);
	System.out.println(e << 1);
	System.out.println((e << 31) );
	System.out.println((e << 31) >> 31);
	
	}	 	
}
*/
/*
// conditional
//num�� 0���� ũ��.
//num��  ¦��
class test_prompt{
	
	public static void main(String[] args){
		int num, b;
		num = 10;
		
		if (num >0)
		System.out.println("num �� 0���� ũ��");
		else
		System.out.println("num �� 0�� ���ų� �۴�");
		
		if ( num % 2 == 0)
			System.out.println("num �� ¦��");	
		else if( num % 2 == 1 )
			System.out.println("num �� Ȧ��");
		else
			System.out.println("num �� 0 �̰ų� �� ��"); // conditional�� ��ü�� ����
	}
	
}
*/
//ternary operator
//100
//50
/*
class test_prompt{
	public static void main(String[] args){
		int num = 50;
		int count50 = 0, count100 = 0;
		count50 = num == 50 ? 50 : -1; //ternary operator�� �� ���������� �� ���� ���� value�� ����
		count100 = num == 100 ? 100 : -1; 
		System.out.println(count50); 
		System.out.println(count100);
	}
}
*/
//case
//
/*
class test_prompt{
	public static void main(String[] args){
		int c = 1;
		
		switch (c){
			case 0:
				System.out.println("c�� 0");
				break; //break�� ������ ��ġ�� �������� �Ʒ� ��� ���// process ���� �б��ϱ� ���� switch case default, tree? parent, child?
			case 1 :
				System.out.println("c�� 1");
				break;
			case 2 :
				System.out.println("c�� 2");
				break;
			default :
				System.out.println("c ã��");
				break;
		}
	}
}
*/
//for, while, do while : boot strap?
/*
class test_prompt{
	public static void main(String[] args){
		int a = 1;
		int b = 0;
		int sum = 0;
		while( a == 1){
		 
			System.out.println("while");
			for ( b =0 ; b<=10 ; ++b){ //branch?
				System.out.println(b);
				sum += b;	
				}
			System.out.println("sum : " + sum);
			
			a = -1;
			
		}
	}
}
*/
/*
class test_prompt {
	public static void main(String[] args){
		int a,b,sum;
		a = 0;
		b = 0;
		sum = 0;
		do{
			if (a == 0){
				System.out.println("process start");
				++a;
			}
			else{
					for (;b<=10;++b){
						System.out.println(b);
						sum += b;
					}
				System.out.println(sum);
				a = 0;
			}
		}while(a==1);
	}
}
*/
//continue & break
// 7 times number and 5 times number under 100
/*
class test_prompt{
	public static void main(String[] args){
	
	int num = 0;	
	
	do{
		++num;
		if (num ==100){
			System.out.println("terminated");
			break;
		}
		if( (num % 7 != 0) || (num % 5 != 0) ) //de morgan : exception
			continue;	
		else
			System.out.println(num);
	
		
		
	}while(num <= 100);
	}
}
*/
//for nesint for making array
/*class test_prompt{
	public static void main(String[] args){
		
		just_repeat0_sequential : for(int i = 0 ; i < 10 ; ++i){
			System.out.println(); //System.out.println() = auto tab, System.out.print() = continunous sentences
			just_repeat1_sequential : for ( int j = 0 ; j < 10 ; ++j){ // repeat
			System.out.print(j +" * " +i+" = "+ i*j+"|" ); // express array columm by raw different print, and location
			}
		} 
		
	}				
}
*/
//method
//factorial
/*
class practice{
	public static void main(String[] args){
		int num = 3;
		
		System.out.println(factorial(num));			
	}

	public static int factorial(int i){ // which operator?
		if ( i == 1)		//conditional check
			return 1; //last condition and exit function
		else
			return i*factorial(i-1); // in/output value operating relationship;
	}		
	 // Be good at making for repeat process
	 // recursive function condition's initial value, end point, repeat is computer's role
}	// recursive function mean detection condital of operator and repeat of operation into function 
// stackoverflow error : most of error 's recursive function

*/
/*
class practice{
	public static void main(String[] args){
			int a = -5, b = 5;
			System.out.println( repeat_range(a,b) );	// n = [-5,5] domain	
	}
	
	public static String repeat_range(int a, int b){
		int r = 0;
	
		if ( a >= b)
			return "error";
		else{
		
			for ( r = a ; r <= b ; ++r){
	
				if( r == 0)
					System.out.println(x_sig(r) + "\t zero point");
				else
					System.out.println( x_sig(r) );
			}	
			return "Terminated";
		}		
	} 

	public static int x_sig(int n){
		return 2*impulse(n+2) - impulse(n-4);
	}

	public static int impulse(int n){ 			//discrete time : n, because of type 'int'
		if (n==0)
			return 1;
		else
			return 0;
	}
}
*/ //dsp function
/*
class practice{
	public static void main(String[] args){
		
		int a = -5;
		int b = 5;
		System.out.println(recur_func(a,b));
	}

	public static String recur_func( int a, int b){
		
		int v = a;
		String mem = "";
		if ( v > b)
			return "terminated";
		else{
			if ( v == -2)
				mem =  "2";
			else if ( v ==  4)
				mem = "-1";
			else {
				if ( v == 0)
					mem = "0 zero point";
				else
					mem = "0";
			}
		}

		return mem + " \n" + recur_func(++v,b);
		
	}

}
*/recursive dsp function
//recursive function factor: terminated(return) condition, in(de)crement operator, detector of condition and finite connection