package trainingTest;
import java.util.*;

public class ScoreManager {
	public static void main(String[] args){
		
	 Student std;
     ArrayList<Student> stdList = new ArrayList();

     int choice;
 
     Scanner scanner = new Scanner(System.in);

     while (choice != 4) {
         System.out.println("=======���� ���� ���α׷�=======");
         System.out.println("���� �Է�(1), ���� ��ȸ(2), ���� ����(3), ����(4) >>  ");
         System.out.println("===========================");
         System.out.print("�̿��Ͻ� �޴� ��ȣ�� �Է�>> ");
         choice = scanner.nextInt();

         if (choice == 1) {
        	 for(int i =0; i < 4; i++) {
             System.out.print("�̸��� �Է��ϼ���>> ");
             String name = scanner.next();
             stdList.add(std);
             
             System.out.print("�й��� �Է��ϼ���: ");
             String no = scanner.next();

             System.out.print("���̽� ���� �Է�: ");
             pScore = scanner.nextInt();

             System.out.print("R ���� �Է�: ");
             rScore = scanner.nextInt();

             System.out.print("��� ���� �Է�: ");
             sScore = scanner.nextInt();
        	 }
             avg = (pScore + rScore + sScore) / 3;

//             if (avg > 90)
//                 grade = "A";
//             else if (avg > 80)
//                 grade = "B";
//             else if (avg > 70)
//                 grade = "C";
//             else if (avg > 60)
//                 grade = "D";
//             else
//                 grade = "F";
//
//             std = new Student(name, no, pScore, rScore, sScore, avg);
//             std.setGrade(grade);
//
//             stdList.add(std);
//
//         } else if (choice == 2) {
//             System.out.println("===========��ü ��ȸ===========");
//             System.out.println("�̸� \t �й� \t ���̽� \t R \t ��� \t ��� \t ����");
//             for (int i = 0; i < stdList.size(); i++) {
//                 System.out.println(stdList.get(i).getName() + "\t " + stdList.get(i).getNo() + "\t "
//                         + stdList.get(i).getpScore() + "\t " + stdList.get(i).getrScore() + "\t "
//                         + stdList.get(i).getsScore() + "\t " + stdList.get(i).getAvg() + "\t " + stdList.get(i).getGrade());
//             }
//             System.out.println("============================");
//         }
     }

 }

}
