package classpart;

public class OrderTest {

	public static void main(String[] args) {

		Order order = new Order();
		order.orderId = 201907210001L;
		order.customerId = "abc123";
		order.orderDate = "2019년 7월 21일";
		order.customerName = "홍길순";
		order.productNum = "PD0345-12";
		order.address = "서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문번호:"+order.orderId);
		System.out.println("주문자 아이디:"+order.customerId);
		System.out.println("주문 날짜:"+order.orderDate);
		System.out.println("주문자 이름:"+order.customerName);
		System.out.println("주문 상품 번호:"+order.productNum);
		System.out.println("배송 주소:"+order.address);
		
	}

}
