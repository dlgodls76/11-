package trainingTest;
import java.util.*;

public class CustomerManager {
	
	Scanner scanner = new Scanner(System.in);

	HashMap<String, Customer> cus = new HashMap<String, Customer>();
	
    //Ű�� �̸�
	public void Run(){
		int key = 0;
		while((key = selectMenu())!=3){
			switch(key){
			case 1: addcustomer(); break;
			case 2: searchcustomer(); break;
		

			default: System.out.println("�߸� �����Ͽ����ϴ�."); 
			break;
			}
		}
		System.out.println("�����մϴ�.");
	}
	
	int selectMenu(){
		
		System.out.println("�� ���� �Է�(1), �� ���� ��ȸ(2), ����(3) >> ");
		int key = scanner.nextInt();
		scanner.nextLine();
		return key;
	}
	
	void addcustomer(){
		
		String name;
		
		System.out.println("�̸�:");
		
		name = scanner.nextLine();	
		
		if(cus.containsKey(name)){
			
			System.out.println("�̹� �����ϴ� �̸��Դϴ�.");
			
			return;
		}
		
		double phoneNumber;
		double PointScore;
		
		System.out.println("��ȭ��ȣ:");
		phoneNumber = scanner.nextDouble();
		
		System.out.println("����Ʈ ����:");
		PointScore = scanner.nextDouble();
		
		scanner.nextLine();
		
		Customer cu = new Customer(name, phoneNumber, PointScore); 
		
		cus.put(name,cu);
		
		System.out.println(cus.toString() + " �����Ͽ����ϴ�.");	
		
	}		
	
	void searchcustomer(){
		
		String name;		
		System.out.print("�˻��� �̸�:");
		
		name = scanner.nextLine();
		
		if(cus.containsKey(name)){
			Customer cu = cus.get(name);
			System.out.println("�˻� ���>>"+cu.toString());						
		}
		else{
			System.out.println("�������� �ʽ��ϴ�.");			
		}
	}	
	
	public static void main(String[] args){
				
				System.out.println("** ����Ʈ ���� ���α׷��Դϴ� **");
				CustomerManager cm = new CustomerManager();
				cm.Run();
			}
}
		
