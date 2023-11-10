/*
설계도를 만들 때 static 의도?
static member field : 객체간 공유자원
static method : public static void run()...

1. 객체 생성 없이 사용하려고
2. 편하고 빠르게 사용하려고
3. [정답] 많이 사용하니까! ex) sysout
=> static을 붙이면 new를 붙이지 않아도 되니까.
4. 설계도를 만들 때 이 자원은 많이 사용할 것 같을 때(특히 기능)
5. 자원을 많이 사용할 것이니 편하게 해줘야지! new를 사용x -> static을 사용해서 설계
but static을 남발하지 말자. static은 class area에 올라가는데 garbage collector가 청소해주지 않음. 메모리 많이 잡아먹음.
 */

class StaticClass{
	
	int iv;
	
	static int cv;
	
	static void print() {
		//static 함수는 static 자원만 사용할 수 있다.	
		//static이 만들어질 때 iv는 없으므로
		//iv=10; //일반자원 접근 불가
	}
	
	void printIv() {
		//일반함수
		//일반자원 + static 자원 모두 사용
		cv = 100;
		iv = 200;
	}
}

public class Ex07_Static_Method {

	public static void main(String[] args) {
		
		
	}
	
}
