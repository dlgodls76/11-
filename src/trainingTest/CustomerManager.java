package trainingTest;
import java.util.*;

public class CustomerManager {
	
	Scanner scanner = new Scanner(System.in);

	HashMap<String, Customer> cus = new HashMap<String, Customer>();
	
    //키는 이름
	public void Run(){
		int key = 0;
		while((key = selectMenu())!=3){
			switch(key){
			case 1: addcustomer(); break;
			case 2: searchcustomer(); break;
		

			default: System.out.println("잘못 선택하였습니다."); 
			break;
			}
		}
		System.out.println("종료합니다.");
	}
	
	int selectMenu(){
		
		System.out.println("고객 정보 입력(1), 고객 정보 조회(2), 종료(3) >> ");
		int key = scanner.nextInt();
		scanner.nextLine();
		return key;
	}
	
	void addcustomer(){
		
		String name;
		
		System.out.println("이름:");
		
		name = scanner.nextLine();	
		
		if(cus.containsKey(name)){
			
			System.out.println("이미 존재하는 이름입니다.");
			
			return;
		}
		
		double phoneNumber;
		double PointScore;
		
		System.out.println("전화번호:");
		phoneNumber = scanner.nextDouble();
		
		System.out.println("포인트 점수:");
		PointScore = scanner.nextDouble();
		
		scanner.nextLine();
		
		Customer cu = new Customer(name, phoneNumber, PointScore); 
		
		cus.put(name,cu);
		
		System.out.println(cus.toString() + " 생성하였습니다.");	
		
	}		
	
	void searchcustomer(){
		
		String name;		
		System.out.print("검색할 이름:");
		
		name = scanner.nextLine();
		
		if(cus.containsKey(name)){
			Customer cu = cus.get(name);
			System.out.println("검색 결과>>"+cu.toString());						
		}
		else{
			System.out.println("존재하지 않습니다.");			
		}
	}	
	
	public static void main(String[] args){
				
				System.out.println("** 포인트 관리 프로그램입니다 **");
				CustomerManager cm = new CustomerManager();
				cm.Run();
			}
}
		
