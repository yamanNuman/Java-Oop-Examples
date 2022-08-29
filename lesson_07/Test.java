package lesson_07;

public class Test {
    public static void main(String[] args) {
        Department department1 = new Department();
        department1.setName("Software Engineering");
        Department department2 = new Department();
        department2.setName("Philosophy");
        Department department3 = new Department();
        department3.setName("Economic");

        Professor professor1 = new Professor();
        professor1.name = "Ahmet Arslan";
        Professor professor2 = new Professor();
        professor2.name = "Ali Veli";
        Professor professor3 = new Professor();
        professor3.name = "Ayşe Fatma";

        Course course1 = new Course();
        course1.name = "Int. to Software Engineering";
        Course course2 = new Course();
        course2.name = "Ethics";
        Course course3 = new Course();
        course3.name = "Ontology";

        Student student1 = new Student();
        student1.name = "Akin Kaldiroglu";
        Student student2 = new Student();
        student2.name = "Zeynep Gül";
        Student student3 = new Student();
        student3.name = "Metin Sağlam";
        Student student4 = new Student();
        student4.name = "Murat Atılgan";
        // Head of Software Engineering department is Ahmet Arslan and consequently his department is Software Engineering.
        department1.setHead(professor1);
        professor1.setDepartment(department1);
        department2.setHead(professor2);
        professor2.setDepartment(department2);
        department3.setHead(professor3);
        professor3.setDepartment(department3);

        // Department of Int. to Software Engineering course is Software Engineering and consequently the course
        // Int. to Software Engineering belongs to Software Engineering department.
        course1.department = department1;
        department1.courses = new Course[100];
        department1.courses[0] = course1;

        course2.department = department2;
        department2.courses = new Course[100];
        department2.courses[0] = course2;

        course3.department = department3;
        department3.courses = new Course[100];
        department3.courses[0] = course3;

        course1.teacher = professor1;
        course2.teacher = professor2;
        course3.teacher = professor3;

        professor1.coursesGiven = new Course[5];
        professor1.coursesGiven[0] = course1;

        professor2.coursesGiven = new Course[5];
        professor2.coursesGiven[0] = course2;

        professor3.coursesGiven = new Course[5];
        professor3.coursesGiven[0] = course3;

        professor1.advisee = new Student[10];
        professor1.advisee[0] = student1;

        professor2.advisee = new Student[10];
        professor2.advisee[0] = student2;
        professor2.advisee[1] = student3;

        professor3.advisee = new Student[10];
        professor3.advisee[0] = student4;

        student1.advisor = professor1;
        student2.advisor = professor2;
        student3.advisor = professor2;
        student4.advisor = professor3;

        student1.coursesTaken = new Course[7];
        student1.coursesTaken[0] = course1;

        student2.coursesTaken = new Course[7];
        student2.coursesTaken[0] = course2;

        student3.coursesTaken = new Course[7];
        student3.coursesTaken[0] = course2;

        student4.coursesTaken = new Course[7];
        student4.coursesTaken[0] = course3;

        course1.students = new Student[100];
        course1.students[0] = student1;

        course2.students = new Student[100];
        course2.students[0] = student2;
        course2.students[1] = student3;

        course3.students = new Student[100];
        course2.students[0] = student4;


        System.out.println("Name of student student1's first course is " + student1.coursesTaken[0].name);
        System.out.println("Name of student student1's first course's professor is " + student1.coursesTaken[0].teacher.name);
        System.out.println("Name of student student1's first course's professor's department is " + student1.coursesTaken[0].teacher.getDepartment().getName());
        System.out.println("***********************************************************************************************************************************");
        System.out.println("Name of student student2'nd first course is " + student2.coursesTaken[0].name);
        System.out.println("Name of student student2'nd first course's professor is " + student2.coursesTaken[0].teacher.name);
        System.out.println("Name of student student2'nd first course's professor's department is " + student2.coursesTaken[0].teacher.getDepartment().getName());
        System.out.println("***********************************************************************************************************************************");
        System.out.println("Name of student student3'rd first course is " + student3.coursesTaken[0].name);
        System.out.println("Name of student student3'rd first course's professor is " + student3.coursesTaken[0].teacher.name);
        System.out.println("Name of student student3'rd first course's professor's department is " + student3.coursesTaken[0].teacher.getDepartment().getName());
        System.out.println("***********************************************************************************************************************************");
        System.out.println("Name of student student4'th first course is " + student4.coursesTaken[0].name);
        System.out.println("Name of student student4'th first course's professor is " + student4.coursesTaken[0].teacher.name);
        System.out.println("Name of student student4'th first course's professor's department is " + student4.coursesTaken[0].teacher.getDepartment().getName());
    }
}
