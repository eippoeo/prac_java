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