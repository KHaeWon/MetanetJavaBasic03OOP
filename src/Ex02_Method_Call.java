import kr.or.kosa.Tv;

/*
 기능 (행위) 만드는 방법
method 만드는 방법(문법)

method : 행위 또는 기능의 최소단위 구현 : [하나의 함수]는 [하나의 기능]만 구현
ex)  먹는기능 , 자는 기능 

ex) 롯데월드 : 게임방 : 동전 (농구) , 동전 뽑기 (포켓몬)

** 모든 함수는 호출에 의해서만 동작한다 **
누군가 이름을 부르지 않으면 동작하지 않는다 

JAVA)
1. void , parameter(0) : public void print(String str) { 실행구문 }
	
	ex)
	함수
	void print(int i, int j, int k){}
	호출
	print(1,2,3);(O)
	print(1);(x)
	print(1,2);(x)
	print(1,2,"3");(x)
	
2. void , parameter(x) : public void print() { 실행구문 }  공짜
3. return type , parameter(0) : public int print(int data) { return 100; }
3. return type , parameter(x) : public int print() { return 100; }

void  > 돌려주는 것이 없어요 > return type 없어요
return type >> 8가지 기본 + 1(String) , Array , class , interface(=>다형성) , Collection
이 중에서 8가지 + String + class 학습



class Car{}

void print(Car c){} //Car 타입을 가지는 객체의 주소값을 넣어라
(1)번
print(new Car()){};(o) //new가 주소를 만드는 것이니까! return되는 것이 주소값임

(2)번
Car c = new Car();
print(c);(o)
=>c라는 변수를 다른 곳에 쓸 수 있음, (1)번은 불가능하다는 차이점이 있음.

함수 이름을 길게 하자. 뭐에 대한 함수인지 알아볼 수 있게
ex)
사원 테이블에서 사원의 모든 정보를 가지고 오는 함수
void getEmpAllList()

ex)
사원 번호로 사원 리스트를 가지고 오는 함수
void getEmpListByEmpno()


 */


class Fclass{
	private int subSum(int i) {//의도 : 클래스 내에서만 쓰겠다. 공통 함수거나 다른 것들을 도와주는 함수
		return i+100;
	}
	
	//문제
	/*
	 함수를 생성하는데
	 정수타입의 parameter 2개를 받아서 둘 중에 큰 값을 리턴하는 함수 만들기
	 ex) max(10,5) return 10 반환
	 100, 90, 60
	 */
	
	//100점
	public int max(int a, int b){
		return (a>b)?a:b;	
	}
	
	//내가 푼 건 60점 ㅜㅜ
//	private int max(int num1, int num2) {
//		
//		int max=num1;
//		if(max<num2) {
//			max = num2;
//		}
//		return max;
//	}
	
	
}


public class Ex02_Method_Call {

	public static void main(String[] args) {

		Tv tv = new Tv();
		tv.brand = "삼성";
		tv.channelPlus();
		tv.channelPlus();
		tv.channelPlus();
		tv.printTv();
		tv.channelMinus();
		tv.printTv();
		
	}

}
