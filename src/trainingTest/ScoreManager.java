package trainingTest;
import java.util.*;

public class ScoreManager {
	public static void main(String[] args){
		
	 Student std;
     ArrayList<Student> stdList = new ArrayList();

     int choice;
 
     Scanner scanner = new Scanner(System.in);

     while (choice != 4) {
         System.out.println("=======학점 관리 프로그램=======");
         System.out.println("성적 입력(1), 성적 조회(2), 성적 삭제(3), 종료(4) >>  ");
         System.out.println("===========================");
         System.out.print("이용하실 메뉴 번호를 입력>> ");
         choice = scanner.nextInt();

         if (choice == 1) {
        	 for(int i =0; i < 4; i++) {
             System.out.print("이름을 입력하세요>> ");
             String name = scanner.next();
             stdList.add(std);
             
             System.out.print("학번을 입력하세요: ");
             String no = scanner.next();

             System.out.print("파이썬 점수 입력: ");
             pScore = scanner.nextInt();

             System.out.print("R 점수 입력: ");
             rScore = scanner.nextInt();

             System.out.print("통계 점수 입력: ");
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
//             System.out.println("===========전체 조회===========");
//             System.out.println("이름 \t 학번 \t 파이썬 \t R \t 통계 \t 평균 \t 학점");
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
