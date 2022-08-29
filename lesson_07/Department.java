package lesson_07;

public class Department {
    private String name;
    private Professor head;
    Course[] courses;
    Student[] students;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Professor getHead() {
        return head;
    }

    public void setHead(Professor head) {
        this.head = head;
    }
}
