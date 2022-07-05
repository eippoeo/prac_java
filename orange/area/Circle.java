package orange.area;

/*
class Circle{
	
	public static void main(String[] args){
	
		Circle_compo c = new Circle_compo(4.3);
		System.out.println("³ÐÀÌ Ãâ·Â : " + c.area());
	}

}
*/ //solo excution for class testing


public class Circle{

	double rad;
	final double PI;
	
	public Circle(double r){
		rad = r;
		 PI = 3.14;
	}

	public double area(){
		return (rad*rad)*PI;
	}
}

