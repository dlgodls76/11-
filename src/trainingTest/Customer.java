package trainingTest;

import java.util.*;

public class Customer {

	 String name;
	 double phoneNumber;
	 double PointScore;
    
	 
	public Customer(String name, double phoneNumber, double PointScore){
			this.name = name;
			this.phoneNumber = phoneNumber;
			this.PointScore = PointScore;
	
	}
    
	public String name(){
		return name;
	}
	
	public String toString(){
		return String.format("(�̸�:%s  ��ȭ��ȣ:%lf ����:%lf)", name, phoneNumber, PointScore);	
	}
	
		
	
	
}

