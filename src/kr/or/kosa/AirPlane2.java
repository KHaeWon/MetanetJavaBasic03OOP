package kr.or.kosa;

public class AirPlane2 {
	private int airnum; //캡슐화
	private String airname;
	private static int airtotalcount; //모든 객체가 공유하는 자원
	
	/*
	//public AirPlane(){} 사용하지 않아요
	public AirPlane(int num , String name) {  //생성자를 안배워서 생성자 처럼 만들기
		airnum = num;  //this 안배워서 변수면 안이뻐요 
		airname = name;
		airtotalcount++;  //airtotalcount 누적대수
	}
	*/
	//this 
	public AirPlane2(int airnum , String airname) {  //생성자를 안배워서 생성자 처럼 만들기
		this.airnum = airnum;  //this 안배워서 변수면 안이뻐요 
		this.airname = airname;
		airtotalcount++;  //airtotalcount 누적대수
	}
	public void airDisplay() {  //클래스 내부에서 사용되는 함수 처럼 (private 함수)
		System.out.printf("번호[%d] , 이름[%s] \n",airnum, airname);
	}
	
	public void airPlaneTotalCount() {
		System.out.printf("총 비행기 제작 대수 : [%d] \n",airtotalcount );
	}
}