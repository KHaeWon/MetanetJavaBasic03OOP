package kr.or.kosa;

//메인함수가 없는 참조 클래스
//독자적 실행이 불가능하므로 도와주는 클래스
public class Person {
	
	//초기값을 쓰지 않는 이유는
	//사람마다 이름 나이 다 다르니까 클래스 설계 시 기본값을 입력하진 않음.
	//즉, 생성되는 객체마다 다른 값을 가질 수 있으니까.
	//생성자를 통해서 만든다.
	
	//사람은 이름을 가지고 있다
	public String name;		//null
	//사람은 나이를 가지고 있다
	public int age;			//0
	//사람은 힘을 가지고 있다
	public boolean power;	//false
	
	//=>따라서 디폴트 값을 가지고 있음
	
	//메소드
	public void personPrint() {
		System.out.printf("이름은 %s 나이는 %d 파워는 %s입니다\n", name, age, power);
	//printf : 출력 형식 정의
	//오버로딩 -> 하나의 이름으로 여러 기능 가능(상속과 무관)
	//오버라이딩 -> 재정의(상속관계에서 부모 자원을 자식이 재정의 하는 것)
				
	}
	
}
