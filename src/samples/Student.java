package samples;

public class Student implements Comparable<Student> {
    int studentId;
    String studentName;
    int className;

    public Student(int studentId, String studentName, int className) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.className = className;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getClassName() {
        return className;
    }

    public void setClassName(int className) {
        this.className = className;
    }


    @Override
    public int compareTo(Student s) {
        if (this.studentId < s.studentId) {
            return -1;
        } else if (this.studentId > s.studentId) {
            return 1;
        } else {
            return 0;
        }
    }

}
