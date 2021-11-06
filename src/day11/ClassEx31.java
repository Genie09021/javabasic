package day11;
// 인스턴스 초기화 블럭
class Product {
	static int count = 0;	// 객체가 몇개 생성되었는지 개수 저장할  
	String seriaNo;			// 객체 고유 번호 
	
	{
		++count; System.out.println("count 증가");
		seriaNo = "P000" + count;
		
	}
}



public class ClassEx31 {
	public static void main(String[] args) {

		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		System.out.println(Product.count);
		System.out.println("p1 : "+p1.seriaNo);
		System.out.println("p2 : "+p2.seriaNo);
		System.out.println("p3 : "+p3.seriaNo);
		
		
		
	}

}
