package trainingTest;

public class Student {

    private String name;  //이름
    private String no;  //학번
    private int attendance;  // 출석
    private int assignment;  //과제
    private int MidExam; //중간고사
    private int FinalExam;  //기말고사
    private int total; //총점
    private int avg; //평균
    private String grade; //학점

    public Student(String name, String no, int attendance, int assignment, int MidExam, int FinalExam, int avg,int total) {
        this.name = name;
        this.no = no;
        this.attendance = attendance;
        this.assignment = assignment;
        this.MidExam = MidExam;
        this.FinalExam = FinalExam;
        this.total = total;
        this.avg = avg;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    
    public int getpattendance() {
        return attendance;
    }

    public void setattendance(int attendance) {
        this.attendance = attendance;
    }

    
    public int getassignment() {
        return assignment;
    }

    public void setassignment(int assignment) {
        this.assignment = assignment;
    }

    public int getMidExam() {
        return MidExam;
    }

    public void setMidExam(int MidExam) {
        this.MidExam = MidExam;
    }
    
    public int getFinalExam() {
        return FinalExam;
    }

    public void setFinalExam(int FinalExam) {
        this.FinalExam = FinalExam;
    }
    
    public int gettotal() {
        return total;
    }

    public void settotal(int total) {
        this.total = total;
    }

    public int getAvg() {
        return avg;
    }

    public void setAvg(int avg) {
        this.avg = avg;
    }

}
