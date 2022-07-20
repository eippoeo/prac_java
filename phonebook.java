//이름
//전화번호
//생년월일'
/* 1
class phonebook{

	public static void main(String[] args){
		phoneinfo usr0 = new phoneinfo("kimbob", "9992-4456", "0807");
		phoneinfo usr1 = new phoneinfo("missless", "9992-3335", "0607");
		
		usr0.info_out();
		usr1.info_out();
	}

}

class phoneinfo{

	private String name, birth, phonenum;
	
	
	public phoneinfo(String name, String phonenum, String birth){
		this.name = name;
		this.phonenum = phonenum;
		this.birth = birth;	
	}
	
	public void info_out(){
		
		System.out.println(" 이름 : " + name);
		System.out.println(" 전화번호 : " + phonenum);
		if ( birth != null)
			System.out.println(" 생일 : " + birth);
		System.out.println("");
		
	}


}
*/
/*
import java.util.Scanner;

class phonebook{
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args){
		
		while (true){
			phonebook.init();
			int sel = input.nextInt();
			
			if ( sel == 1)
				phonebook.screen();
			else{
				System.out.println("system terminated");
				break;
			}
		}
	}
	

	public static void init(){

		System.out.println("선택하세요...");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 프로그램 종료");	
		System.out.print("선택 : ");

	}
	
	public static void screen(){
		System.out.print("이름 : ");
		String name = input.next();
		System.out.print("전화번호 : ");
		String call = input.next();
		System.out.print("생년월일 : ");
		String birthy = input.next();
		String birthm = input.next();
		String birthd = input.next();
		String birth = birthy + birthm + birthd;
		System.out.println("");
		
		info i = new info(name, call, birth);
		System.out.println("입력된 정보 출력");
		i.info_out();
		System.out.println("");	
	}
	
	
}

class info{

	String name, call, birth;
	
	public info(String name, String call, String birth){
		this.name = name;
		this.call = call;
		this.birth = birth;
	}
	
	public void info_out(){
		System.out.println(" name : " + name);
		System.out.println(" call-num : " + call);
		System.out.println(" birth : " + birth);
	}
	
	
	
}
*/ in excution's perspective ( using method set) dividing class method, important in what is sharing resource and process set

