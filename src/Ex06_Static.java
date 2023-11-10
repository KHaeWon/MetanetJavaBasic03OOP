//일반 초기화 블럭과 static 초기화 블럭

class Test2{
	
	static int cv =10;
	static int cv2; //default : 0
	int iv = 9;
	
	//초기화 블럭
	// {   } 일반 자원(instance variable)을 초기화하는 블럭
	//static {    } static 자원을 초기화 할 수 있는 블럭
	
	static {//static 변수의 초기화
		//static 자원이 메모리에 올라간 직후 자동으로 호출됨
		System.out.println("static 초기화 블럭");
		cv = 1111;
		cv2 = cv + 2222; //★이처럼 조작된 표현이 가능하다. 예를 들면 제어문
		
	} 
	
	{
		//일반 초기화 블럭 => 인스턴스 변수 초기화 목적
		//애는 잘 쓰지 않음. 왜? 생성자가 있어서
		//iv가 메모리에 올라간 직후 실행
		System.out.println("초기화 블럭 실행");
		if(iv<10) {
			iv=10000;
		}
	}
}

public class Ex06_Static {

	public static void main(String[] args) {

		Test2 t = new Test2();
		
		System.out.println(t.iv);//10000
		
	}

}
