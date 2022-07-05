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