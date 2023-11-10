package kr.or.kosa;

/*
우리 회사는 비행기를 주문 제작 판매 하는 회사입니다
우리 회사는 비행기를 생산하는 설계도를 만들려고 합니다

요구사항
1. 비행기를 생산하고 비행기의 이름과 번호를 부여해야 한다
2. 비행기가 생산되면 비행기의 이름과 번호가 맞게 부여되었는지 확인 하는 작업이 필요하다(출력) -> 기능
3. 공장장은 현재까지 만들어진 비행기의 총 누적대수를 확인 할 수 있다  -> 기능 

 AirPlane air101 = new AirPlane();
 air101.자원 = 대한항공
 air101.자원 = 707
  
 AirPlane air103 = new AirPlane();
 air101.자원 = 대한항공3
 air101.자원 = 703 
 확인 정보 출력
 비행기 총대수  출력  2
  
 비행기 이름, 번호 출력
  
 생성자 사용금지 >> 배운 다음에 사용  >> 생성자를 써야 코드가 이뻐져요 
 */

public class AirPlane {

	private int airnum;
	private String airname;
	//객체간 공유자원
	private static int airtotalcount; //비행기 누적 대수

	public void makeAirPlane(int airnum, String airname) {
		this.airnum = airnum;
		this.airname = airname;
		this.airtotalcount++; //비행기를 만들면 무조건 ++
		AirDisplay();
	}
	
	private void AirDisplay() {
		System.out.printf("번호 [%d], 이름 [%s]\n", this.airnum, this.airname);
	}
	
	public void airPlaneTotalCount() {
		System.out.println("총 비행기 제작 대수 : "+this.airtotalcount);
	}
	
}
