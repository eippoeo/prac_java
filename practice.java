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
