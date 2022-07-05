package orange.perimeter;
/*
class Circle{
	
	public static void main(String[] args){

		Circle_compo c = new Circle_compo(4.3);
		System.out.println("길이 출력 : " + c.perimeter());
	}

}
*/ //solo excution for testing

public class Circle
{
	double radius;
	final double PI;

	public Circle(double r){
		radius = r;
		 PI = 3.14;
	}

	public double perimeter(){
		return (2*radius)*PI ;
	}

	
}

