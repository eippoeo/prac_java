//이름
//전화번호
//생년월일
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