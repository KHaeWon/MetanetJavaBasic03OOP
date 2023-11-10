import kr.or.kosa.Person;

class Test{ //모든 접근자가 디폴트 => 같은 패키지 내에서만 씀
	int i;
	int j;
	void print() {
		System.out.println(i);
	}
}

public class Ex01_Ref_Type {

	public static void main(String[] args) {
		
		//값 타입 - 참조 타입(주소) : class 타입, Array, String, .... => 메모리의 주소를 가지고 있다.

		Test test = new Test();
		test.print();//0
		
		Person person; //stack 메모리에만 만들어짐, null값
		person = new Person(); //생성자, heap에 올라감, Person()가 생성자 함수, 순서는 멤버필드가 먼저 그 후 생성자가 메모리
		//생성자 함수 호출 후 메모리에 올림
		person.name = "김유신"; //직접할당, Person이 public이기 때문
		person.age = 100;
		person.power = true;
		person.personPrint();//이름은 김유신 나이는 100 파워는 true입니다
		
		System.out.println(person); //kr.or.kosa.Person@7a79be86
		System.out.println(person.toString()); //kr.or.kosa.Person@7a79be86
		//person으로 찍어도 컴파일러가 toString()을 써서 동일한 결과로 출력됨
		
		Person person2 = new Person();
		//stack -> person, person2
		//heap -> name, age, power 멤버필드, personPrint()
		//			person과 person2의 주소는 다르니까 다르게 나오겠지!
		System.out.println(person==person2); //false, 같은 주소가 아님

		Person person3 = person;
		//이것도 객체를 만든 것. 같은 타입이니까 person의 값을 받을 수 있다.
		//주소값 할당
		//두 지역변수가 참조하는 주소가 동일
		//동거한다고 생각하면 됨
		System.out.println(person == person3);//true
		
		//클래스 == 설계도 == 데이터 타입(사용자가 만든)
		
		
	}

}
