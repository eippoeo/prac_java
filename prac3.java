/*
import orange.cal.prac2;
class prac3{
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
class prac3{
	
	int num = 0;
	public prac3 (int n){ num = n;}
	
	public static void main(String[] args){
	
		prac3 n = new prac3(10);
		p3rac m = new p3rac(20);
	
		System.out.println("ins1.aaa="+n.num);
		System.out.println("ins2.bbb="+m.num);
	}
}

class p3rac{

	int num = 0;
	public p3rac (int n){ num = n;}
	

	public static void main (String[] args){
		prac3 n = new prac3(8);
		p3rac m = new p3rac(15);
		
		System.out.println("ins1.aaa="+n.num);
		System.out.println("ins2.bbb="+m.num);
		
	}	
}