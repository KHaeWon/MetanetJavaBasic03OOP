class Zocar{
	String color;
	String gearType;
	int door;

//	반복되는 부분이 많은데 너무 비효율적이다. 이걸 해결하는 방법? this()
	Zocar(){ //기본 설정
//		this.color = "red";
//		this.gearType = "auto";
//		this.door = 2;
		
		this("red","auto",2); //생성자를 호출하는 this 할당 코드 감소
		System.out.println("default");
	}
	Zocar(String color , String gearType , int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		System.out.println("overloading");
	}
	void zocarPrint() {
		System.out.println(this.color + " , " + this.gearType + " , " + this.door);
	}
}
class Zcar2{
	String color;
	String gearType;
	int door;
	
	Zcar2(){ //기본 설정
		this("red",2);
		System.out.println("default ....");
		//기본옵션(red,2,auto)
	}
	Zcar2(String color ,int door){ //기본설정 색상,문의 개수 변경
		this(color,"auto",door);
		System.out.println("overloading parameter 2개 call");
		//옵션 color , door 변경 (default auto)
	}
	
	Zcar2(String color , String gearType , int door){ //모든 옵션은 변경가능 합니다
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		System.out.println("overloading parameter 3개 call");
		//옵션 : color , door , gearType
	}
	
	
	void socarPrint() {
		System.out.println(this.color + " , " + this.gearType + " , " + this.door);
	}
}
public class Ex11_this {

	public static void main(String[] args) {
		Zocar car = new Zocar();

	}

}

