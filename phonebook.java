//�̸�
//��ȭ��ȣ
//�������
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
		
		System.out.println(" �̸� : " + name);
		System.out.println(" ��ȭ��ȣ : " + phonenum);
		if ( birth != null)
			System.out.println(" ���� : " + birth);
		System.out.println("");
		
	}
}