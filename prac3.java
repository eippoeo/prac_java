/*                                                                                          
im port orange.cal.prac2;
c lass prac3{
 	public static void main(String[] args){
 		prac2 p = new prac2();
 		System.out.println("1+2= "+ p.add(1,2));
 		System.out.println("1-2= "+ p.sub(1,2));
 		System.out.println("5-1= "+ p.sub(5,1));
 		p.showoptime();
 	}
} 
 
*/

/*
class prac3
{
	public static void main(String[] args){
		in cnt1 = new in();
		in cnt2 = new in();
		in cnt3 = new in();
	}
}

class in
{
	static int instNum=0;
	int instn =0;
	public in(){
		++instNum;
		++instn;
		System.out.println("인스턴스 생성 : static"+instNum+"\t non_static"+instn); // static data sharing
	}	
}
*/
//static access
/*
class prac3{
	public static void main(String[] args){
	
		access v = new access();	//use 1
		
		++access.num;		//use 2
		++v.num;			//use 3
		System.out.println("num : " + access.num);
	
	}
	
}

class access{
	public static int num=0;
	
	public access(){
		++num;
	}
	
}
*/
/*
class prac3{
	public static void main(String[] args){		
						//not make instance
		InstCnt.inst -= 15;
		System.out.println("인스턴스 생성0 : " + InstCnt.inst);
		
	}
}

class InstCnt{
	static int inst = 100;
	public InstCnt(){
		inst++;
		System.out.println("product instance : "+inst);
	}
}
*/
/*
class prac3{
	public static void main(String[] args){
		circle c = new circle(2);
		c.perimeter();
		c. area();
	}
}

class circle
{
	static final double PI=3.141592;
	private double radius;
	
	public circle(int r){ radius = r; }

	public void perimeter(){
		double peri = 2*radius*PI;
		System.out.println("둘레 : "+ peri);
	}
	public void area(){
		double pari = PI*radius*radius;
		System.out.println("넓이 : " + radius);
	}
	

*/	
//static method
/*
class prac3{
	public static void main(String[] args){
		System.out.println("원의 둘레" + perimeter.circle_peri(2.4));
		System.out.println("직사각형 넓이" + area.rectangluar_area(2.4, 2.5));
	}
}

class simplecal{

	public final static double PI = 3.141592;

	public static double plu(double a, double b){ return a + b; }
	public static double min(double a, double b ){ return a - b; }
	public static double mul(double a, double b ){ return a*b; }

}

class area{

	
	public static double circle_area( double r ){
		double result = simplecal.mul(r,r);
		result = simplecal.mul(simplecal.PI , result);		
		return result;
	}
	public static double rectangluar_area( double a, double b){
		return simplecal.mul(a , b);
	}
}

class perimeter{
	public static double circle_peri(double r){
		double result = simplecal.plu(r,r);
		result = simplecal.mul(simplecal.PI , result);
		return result;
	}
	public static double rectangluar_peri(double a, double b){
		double weight_sum = simplecal.plu(a,a);
		double height_sum = simplecal.plu(b,b);
		return simplecal.plu(weight_sum, height_sum);
	}
}
*/
//by 'static', direct access method without instance's production
/*
class prac3{

	 //int num0 = 0;		//static error
	public static int num1 = 1;
	public static void main(String[] args){
		prac3.num_count();
		System.out.println(num0);
		System.out.println(num1);
	}

	public static void num_count(){
		++num0;
		++num1;
	}
}
*/
/*
class employee{

	public static void main(String[] args){
		employee m = new employee(0);
		prac3 p = new prac3(3000);

		p.pay(m,1000);
		m.emp_out();
		p.emr_out();
		
	}

	private static int My_money;
	
	public employee(int money){
		My_money = money;
	}

	public static void earn_money(int money){
		My_money += money;
	}

	public static void emp_out(){
		System.out.println(My_money);
	}
}
		// location of main is no problem
class prac3{
	

	
	private static int My_money;

	public prac3(int money){
		My_money = money;
	}
	
	public void pay(employee emp, int money){
		if ( money > My_money)
			return ;
		My_money -= money;
		emp.earn_money(money);
	}
	
	public static void emr_out(){
		System.out.println(My_money);
	}

}

class employee{

	public static void main(String[] args){
		employee m = new employee(0);
		prac3 p = new prac3(3000);

		p.pay(m,1000);
		m.emp_out();
		p.emr_out();
		
	}

	private static int My_money;
	
	public employee(int money){
		My_money = money;
	}

	public static void earn_money(int money){
		My_money += money;
	}

	public static void emp_out(){
		System.out.println(My_money);
	}
}
*/ // instance problem of static metho
 //dont change main method, and make same instance refer num1 and num2, (output : 50 50)
/*
class prac3{

	public static void main(String[] args){

		simplenumber num1= simplenumber.getsimplenumberinst();
		num1.addnum(20);
	
		simplenumber num2=simplenumber.getsimplenumberinst();
		num2.addnum(30);

		num1.shownum();
		num2.shownum();
			
	
	}	
}

class simplenumber{
	int num=0;
	private simplenumber(){}
	public void addnum(int n) { num += n; }
	public void shownum(){ System.out.println(num); }
	
	public static simplenumber getsimplenumberinst(){
		return new simplenumber();
	}
}
*/
class prac3{

	public static void main(String[] args){

		simplenumber num1= simplenumber.getsimplenumberinst();
		num1.addnum(20);
	
		simplenumber num2=simplenumber.getsimplenumberinst();
		num2.addnum(30);

		num1.shownum();
		num2.shownum();
			
	
	}	
}

class simplenumber{
	static int num=0;			//..... so easy...
	private simplenumber(){}
	public void addnum(int n) { num += n; }
	public void shownum(){ System.out.println(num); }
	
	public static simplenumber getsimplenumberinst(){
		return new simplenumber();
	}
}
