package trainingTest;

public class Student {

    private String name;  //�̸�
    private String no;  //�й�
    private int attendance;  // �⼮
    private int assignment;  //����
    private int MidExam; //�߰����
    private int FinalExam;  //�⸻���
    private int total; //����
    private int avg; //���
    private String grade; //����

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
