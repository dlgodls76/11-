package test;

import java.util.*;

public class test6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		HashMap<String, Integer> h = new HashMap<String, Integer>();

		System.out.println("** ����Ʈ ���� ���α׷��Դϴ� **");

		while (true) {
			System.out.print("�̸��� ��ȭ��ȭ�� ������ ���� �Է� >> ");
			String name = sc.next();
			if(name.equals("exit")) {
				System.out.println("�����մϴ�.");
				break;
			}
			int point = sc.nextInt();
			
			
			if(h.containsKey(name)) {
				h.put(name, h.get(name) + point);
			}
			else {
				h.put(name, point);
			}
			Set<String> keys = h.keySet();
			Iterator<String> it = keys.iterator();
			while(it.hasNext()) {
				String key = it.next();
				int value = h.get(key);
				System.out.print("(" + key + ", " + value + ") ");
			}
			System.out.println();
		}
	}
}