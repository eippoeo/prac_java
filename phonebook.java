//�̸�
//��ȭ��ȣ
//�������'
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
		
		System.out.println(" �̸� : " + name);
		System.out.println(" ��ȭ��ȣ : " + phonenum);
		if ( birth != null)
			System.out.println(" ���� : " + birth);
		System.out.println("");
		
	}
}
*/

import java.util.Scanner;

class phonebook{

	

	public static void main(String[] args){
		int sel = 1;
		
		while(sel == 1){
			phonebook.init(sel);
			if(sel == 1){
				info p0 = new info();				
				p0.exe();
			}
			else
				System.out.println("���α׷� ����");
			
		}
	}

	public static void init(int sel){	
		Scanner input = new Scanner(System.in);
		System.out.println(" �����ϼ���....");
		System.out.println(" 1. ������ �Է�");
		System.out.println(" 2. ���α׷� ����");
		System.out.print(" ���� : ");
		sel = input.nextInt();
	}

	
	
}
class info{
	private String name, call, birth;

	public void exe(){
				
				System.out.print("�̸� : ");
				name = input.next();
				System.out.print("��ȭ��ȣ : ");
				call = input.next();
				System.out.print("������� : ");
				String birthy = input.next();
				String birthm = input.next();
				String birthd = input.next();
				birth = birthy + birthm + birthd;		
	}

	public void info_out(){
		System.out.println("\n");
		System.out.println("�Էµ� ���� ���....");
		System.out.printf("name : %s \n",name);
		System.out.printf("phone : %s \n", call);
		System.out.printf("birth : %s \n", birth);
		System.out.println("");
	}
}
