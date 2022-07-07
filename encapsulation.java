public class encapulation{
	public static void main(String[] args){
		cold_start c = new cold_start();
		c.eat_cap(new coldpatient());		// divide along to use module
	}
}

class cold_start {
	public void eat_cap(coldpatient c){c.cold();}		//encapsulation
}

class sinivelcap{
	void sinivel(){
		System.out.println("sinivel the end");
	}
}

class sneezecap{
	void sneeze(){
		System.out.println("sneeze the end");
	}
}

class snufflecap{
	void snuffle(){
		System.out.println("snuffle the end");
	}
}

class coldpatient{

		private snufflecap nuff ;
		private sneezecap neez ;
		private sinivelcap nivel ;

	public coldpatient(){
		 nuff = new snufflecap();
		 neez = new sneezecap();
		 nivel = new sinivelcap();
	}

	public void cold(){
		nuff.snuffle();
		neez.sneeze();
		nivel.sinivel();
	}

}