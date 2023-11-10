package kr.or.kosa;

/*
노트북은 색상을 가지고 있다
노트북은 생산연도를 가지고 있다
노트북은 마우스를 가지고 있다=>마우스는 부품이라서 클래스로 빼기
	추가) 마우스를 필요에 따라서 사용할 수 있다.(써도 되고 안 써도 된다.)
	마우스는 좌표값을 가지고 있다 (나중에 휠 1개, 버튼 2개 추가)
 */

//마우스는 부품 정보 => 별도의 클래스

//class Mouse{
//	
//	int x;
//	int y;
//	
//	//setter
//	void setX(int x) {
//		this.x = x;
//	}
//	void setY(int y) {
//		this.y = y;
//	}
//	
//	void getReadMouseData() {
//		System.out.println("x : "+x+", y : "+y);
//	}
//
//}

//마우스와 노트북의 라이프 사이클이 같아야 함
public class NoteBook {

	private String color;
	private int year;
	//노트북은 마우스를 가지고 있다
	//private Mouse mouse=new Mouse(); //NoteBook과 Mouse의 life cycle이 같다 
	//private Mouse mouse;//부품
	
	public void setColor(String color) {
		this.color = color;
	}
	public void setYear(int year) {
		this.year = year;
	}
//	public void setMouse(Mouse mouse) {
//		this.mouse = mouse;
//	}
	
	//추가) 마우스를 필요에 따라서 사용할 수 있다.(써도 되고 안 써도 된다.)
	//마우스를 붙일 수 있음, 파라미터로 마우스 객체의 주소가 들어감
	public void handleMouse(Mouse mouse) { //의존관계(dependency)
		mouse.setX(100);
		mouse.setY(200);
		mouse.getReadMouseData();
	}//NoteBook이 Mouse를 갖고 있지 않아도 함수의 파라미터로 받아서 사용할 수 있다.
	
	/*
	 * 라이프 사이클이 다른 예
	 * NoteBook note = new NoteBook();
	 * Mouse m = new Mouse();
	 * note.handelMouse(m);
	 */
	
}
