package kr.or.kosa;

public class Person2 {

	private String name;//null
	private int age;//0
	//다른 패키지에서 접근이 안 되므로 getter, setter 만들자
	
	//생성자, 간접할당, 디폴트 생성자가 없으므로 사용자에게 무조건 입력 받음
	public Person2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//만약 getter만 만든다면 생성자를 통해서 초기화를 하겠다는 의도. 
	//각각을 읽을 수 있게 하겠다.
	//getter가 사실 필요 없음.. toString()이 있으면.
	//getter가 있어야 한다면? 각각 읽고 싶다는 요구사항이 있을 때.
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Person2 [name=" + name + ", age=" + age + "]";
	}
	
	
}
