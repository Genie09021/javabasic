package day12;
// 상속을 이용하여 다음 클래스들을 간결한 구조로 재작성 하세요.
class Pen {
	private int amount;
	public int getAmount () {return amount;}
	public void setAmount (int amount) {this.amount = amount;}
}
class SharpPencil extends Pen{ // amount, getAmount (), setAmount()
	private int width;
}

class BallPen extends Pen { // amount, getAmount (), setAmount()
	private String color;
	public String getColor () {return color;}
	public void setColor (String color) {this.color = color;}
}

class FountainPen extends BallPen { 
	// (p)amount, getAmount (), setAmount()
	// (p)color, setColor(), getColor(),
	public void  refill (int n) {setAmount(n);} // amount(private)에 다이렉트로 접근 못함
}




public class InheritEx02 {

	public static void main(String[] args) {

		System.out.println(Math.PI);
		
	}

}
