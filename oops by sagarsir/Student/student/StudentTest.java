package student;
public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();
        
        student1.setRollNumber(1);
        student1.setName("Aamir");
        student1.setCourse("MCA");
        student1.setMarks1(70);
        student1.setMarks2(70);
        student1.setMarks3(80);
        
        student2.setRollNumber(2);
        student2.setName("Habib");
        student2.setCourse("M.tech");
        student2.setMarks1(90);
        student2.setMarks2(88);
        student2.setMarks3(80);
        
      student3 = new Student();
        student3.setRollNumber(3);
        student3.setName("Daksh");
        student3.setCourse("MCA");
        student3.setMarks1(76);
        student3.setMarks2(56);
        student3.setMarks3(86);
        
       student4.setRollNumber(4);
        student4.setName("Mohammad nabi hasan");
        student4.setCourse("MCA");
        student4.setMarks1(89);
        student4.setMarks2(75);
        student4.setMarks3(85);
        
     student5.setRollNumber(5);
        student5.setName("Asvin");
        student5.setCourse("M.tech");
        student5.setMarks1(70);
        student5.setMarks2(65);
        student5.setMarks3(80);
        
        System.out.println(student1);
        System.out.println(student1.calculateGrade());
        System.out.println(student2);
        System.out.println(student2.calculateGrade());
        System.out.println(student3);
        System.out.println(student3.calculateGrade());
        System.out.println(student4);
        System.out.println(student4.calculateGrade());
        System.out.println(student5);
        System.out.println(student5.calculateGrade());
    }
}