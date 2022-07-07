//8//class package
/* 
class prac2{
	
	public static void main(String[] args){
	
		AAA aaa= new AAA();
		aaa.printName();

		BBB bbb=new BBB();
		bbb.printName();

	}
}

class AAA
{

	public void printName(){
	 	System.out.println("AAA");
	}

}

class BBB
{
	public void printName(){
		System.out.println("BBB");
	}
}

*/
//package utillity e.g.)circle area, circle perimeter
/*
import orange.perimeter.*;


class prac2{

	public static void main(String[] args){
		//area.Circle a = new area.Circle(1.0);
		Circle p = new Circle(1.0);	 		//use class in package
		phi z = new phi();				// be careful ambiguous
		System.out.println(z.phie());
		//System.out.println(a.area());
		System.out.println(p.perimeter());
	}
		// pacakage can use class which get 'public' class
		// inside package, class file must be compiled
}
*/
// informaintion hiding


/*

public class prac2 {
	public static void main(String[] args){
	

		int wanna_apple = 2;	
		
		sell_info i = new sell_info();

		seller s = new seller(1000000, 100);
		buyer b = new buyer(1000000, wanna_apple);
		
		//s.access_money( wanna_apple*apple_price ); 	// dangerous changing directly data
		//b.access_money( wanna_apple*apple_price );

		//s.access_apple_s( wanna_apple );
		//b.access_apple_b( wanna_apple ); 		// use access method

		b.buy(s,4500); 				//only process because of 'private' data hiding
		
		s.state();
		b.state();

	}	
}

class sell_info{
	
	protected int price = 2000;
	
}

class seller extends sell_info  {

	int money, apple_s;
		
	
	public seller (int m, int a){
		money = m;
		apple_s = a;
	}

	public int sell (int deal_mon){
		int num = deal_mon/price; // check the selling apple
		money += deal_mon*num;  // get money as much as selling
		apple_s -= num;
		return num ; 		// give buyer apple right apple
	}

	public void state(){
		System.out.println("ÆÇ¸ÅÀÚ µ· : " + money);
		System.out.println("ÆÇ¸ÅÀÚ »ç°ú : " + apple_s);
	} 


}


class buyer{

	private int money, apple_b; // hiding data
		
//
	
	public void access_money(int m){		//access method
		money += m;
	}

	public void access_apple_b(int a){		//access method
		apple_b += a;
	}
//
	public buyer(int m, int a){
		money = m;
		apple_b = a;
	}

	public void buy(seller s, int m){
		money -= m;
		apple_b += s.sell(m);
	}

	public void state(){
		System.out.println(" ÄÁ½´¸Ó ÀÜ°í : " + money);
		System.out.println(" ÄÁ½´¸Ó »ç°ú : " + apple_b);
	}

}
*/

package orange.cal;

public class prac2{

	private adder add;
	private substractor sub;

	public prac2(){
		add = new adder();
		sub = new substractor();		
	}

	public int add(int num1, int num2){
		return add.add(num1, num2);
	}
	public int sub(int num1, int num2){
		return sub.sub(num1, num2);
	}
	
	public void showoptime(){
		System.out.println("µ¡¼À È½¼ö : " + add.cnt_out());
		System.out.println("»¬¼À È½¼ö : " + sub.cnt_out());
	}
	
}

class adder{

	private int add_cnt; 
	
	adder(){ add_cnt = 0; }
	int cnt_out(){ return add_cnt; }
	int add(int a , int b){
		++add_cnt;
		return a + b;
	}

}

class substractor{

	private int sub_cnt;
	
	substractor(){ sub_cnt = 0; }
	int cnt_out(){ return sub_cnt; }
	int sub( int a, int b ){
		++ sub_cnt;
		return a - b;
	}

}