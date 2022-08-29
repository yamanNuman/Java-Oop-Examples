package lesson_07;

public class Professor {
    String no;
    String name;
    String dob;
    String rank;
    private Department department;
    Student[] advisee;
    Course[] coursesGiven;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
