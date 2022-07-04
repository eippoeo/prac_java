/*
scope 확실히 하기
data size 확인 객체 사용 : e.g.) 정수 -- Integer.BYTES
Boolean.parseBoolean(); -- 문자열을 boolean값으로 형변환
결과가 나온 방법을 보지말고 만들어서 비교
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
//num은 0보다 크다.
//num은  짝수
class test_prompt{
	
	public static void main(String[] args){
		int num, b;
		num = 10;
		
		if (num >0)
		System.out.println("num 은 0보다 크다");
		else
		System.out.println("num 은 0과 같거나 작다");
		
		if ( num % 2 == 0)
			System.out.println("num 은 짝수");	
		else if( num % 2 == 1 )
			System.out.println("num 은 홀수");
		else
			System.out.println("num 은 0 이거나 음 수"); // conditional은 전체적 제어
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
		count50 = num == 50 ? 50 : -1; //ternary operator는 더 직접적으로 한 변수 제어 value만 선택
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
				System.out.println("c는 0");
				break; //break가 없으면 위치를 시작으로 아래 모두 출력// process 병렬 분기하기 좋은 switch case default, tree? parent, child?
			case 1 :
				System.out.println("c는 1");
				break;
			case 2 :
				System.out.println("c는 2");
				break;
			default :
				System.out.println("c 찾기");
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
*/
//recursive dsp function
//recursive function factor: terminated(return) condition, in(de)crement operator, detector of condition and finite connection
/*
class practice{

	
	public static void main(String[] args){
	
		call i = new call();
	
		System.out.println( " method 호출 전 : " + i.out_num() );
	
		out_num2(i); // method into object
	
		System.out.println( " method 호출 후 : " + i.out_num() );
		
	}


	public static void out_num2(call num){  //object parameter
		num.add(10);
	}
	
	

}

class call{      			//내부 처리class

	int num0 = 0;		 //data storage

	public void add(int i){
		
		num0 += i ; 	//  process
		
	}	
	
	public int out_num(){
	
		return num0; 	// out global value
	
	}
	
}
*/
//repeat
/*
class practice{
	
	public static void main(String[] args){
			
		call i = new call();
		
		System.out.println("메소드 호출" + i.outnum() );
		
		add(i);
		
		System.out.println("메소드 재호출" + i.outnum() );		
		
		
	}

	public static void add(call m){

		m.addnum(15);

	}

}
class call {
	
	int stack_num = 0 ;

	public void addnum(int a){
		stack_num += a;	
	}

	public int outnum(){
		return stack_num; // output
	}
	

}*/
//FruitSales
//3 class (Fruitseller, fruitbuyer, fruitsalesmarket)
// imagine of rest
/*
class practice{

	public static void main(String[] args){
		seller x0 = new seller();
		buyer y0 = new buyer();
		y0.buy( x0, 14000 ); // between seller and buyer, processing with money, starting point's requast of buyer
	
		x0.seller_state();
		y0.buyer_state();
	}
}

class seller{

	int account = 0;
	int apple_num = 100;
	final int apple_price = 2000;	//resource --> *** Do large letter when constant
	
	public int sell( int money ){		//exteral parameter corresponding
	
	int num = money/apple_price;
	
	account += money;
	apple_num -= num;
	return num;
	
	}
	
	public void seller_state( ){
		System.out.println("판매자 돈 : "+ account);
		System.out.println("판매자 사과 수 : " + apple_num);
	}	

}
class buyer{
	int account = 1000000;
	int apple_num = 0;
	
	public void buy( seller vendor,  int money){	 
		 apple_num+=vendor.sell(money); 	// my state adapting vendor process and external parameter , "message passing"
		account -= money;
	}
	
	public void buyer_state( ){
		System.out.println("구매자 돈 : "+account);
		System.out.println("구매자 사과 수 : "+apple_num);
	}	
		
	
}
*/
// after all, edit again
// class == frame(non occupied memory), instance == matrialization(occupied memory)
// instance method, variable (buy, buyer_state, seller, seller_state, rest of variable in buyer, seller)
//but difficult frome apling many case
//many instance

/*
class practice{
	public static void main(String[] args){
		int applex0 = 1000;
		int applex1 = 2000;
		int buyer_money = 5000;
		
		seller x0 = new seller();
		seller x1 = new seller();
		buyer y = new buyer();
		
		x0.init_seller(100000, applex0, 100);
		x1.init_seller(100000, applex1, 100);
		
		y.init_buyer(100000, 0);
	
		y.buy(x0, buyer_money);	
		y.buy(x1, buyer_money);
	
		x0.state( );
		x1.state( );
		y.state( );
	
	}
}


class seller{

	// needing resource for process
	int account; // chaging of mean
	int apple_price; // stored size, if instance call over 2 times, "final" cant be used, unsafety
	int  apple_num; // stored	
	
	public void init_seller(int now_account ,int now_price ,int now_num){
		account = now_account;
		apple_price = now_price;
		apple_num = now_num;
	}
	
	public int sell ( int extern_money ){
		int temp = extern_money/apple_price;
		account += temp*apple_price;
		apple_num -= temp;
		
		return temp;	
	}
	
	public void state(){

		System.out.println("판매자 잔고 : " + account);
		System.out.println("판매자 사과 : " + apple_num);		

	}

}

class buyer{

	int account; // 
	int apple_num;

	public void init_buyer(int now_account, int now_apple_num){
		account = now_account;
		apple_num = now_apple_num;
	}
	
	public void buy(seller selled_apple ,int money ){	 //buy  give seller money, get rest of money
		account -= money;
		apple_num += selled_apple.sell(money); 
	}

	public void state(){

		System.out.println("구매자 잔고 : " + account);
		System.out.println("구매자 사과 : " + apple_num);		

	}
}

*/
//constructor
/*
class practice{

	public static void main(String[] args){
		
	number x1 = new number(10);
	number x2 = new number(20);
	
	System.out.println( x1.out_num() );
	System.out.println( x2.out_num() );

	}
}

class number{
	
	int num0;	

	public number(int num){

		int num0 = num;
		System.out.println("call constructor");
	
	}

	public int out_num(){

		return num0;

	}

}
*/
/*
class practice {
	public static void main(String[] args){
	
		seller x0 = new seller(100000, 2000, 100);
		seller x1 = new seller(50000, 1500, 200);
		
		buyer y0 = new buyer(1000000 , 0);
		
		y0.buy(x0,1500);
		y0.buy(x1,1500);
		
		x0.state();
		x1.state();
		y0.state();
		
	}	
}

class seller{

	int account, apple_price, apple_num;
	

	public seller(int bullet, int weapon, int resource){
		account = bullet;
		apple_price = weapon;
		apple_num = resource; 
		System.out.print("buy my apple~");
	}
	
	public int sell( int money ){
		
		int temp_num = money/apple_price ;
		account += temp_num*apple_price;
		apple_num -= temp_num;
		
		return temp_num;
			
	}
	
	public void state(){

	System.out.println("판매자 남은 돈 : " + account);
	System.out.println("판매자 사과 가격 : " + apple_price);
	System.out.println("판매자 사과 수 : " + apple_num);

	}	
}


class buyer{

	int account, apple_num;

	public buyer(int bullet, int resource){
		account = bullet;
		apple_num = resource;
		System.out.println("where is sweat apple?");
	}

	public void buy(seller deal, int bullet){
		account -= bullet;
		apple_num += deal.sell(bullet);
	}

	public void state(){
		System.out.println("바이어 잔고 : " + account);
		System.out.println("바이어 사과 : " + apple_num);
	}

}
*/ must be optimized