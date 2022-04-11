package StudentGrades1;

public class StudentGrades {

    public static void main(String[] args) {

        StudentInfo student1 = new StudentInfo("Mathew", "Cash", "M", 3, 6, 5);
        StudentInfo student2 = new StudentInfo("Cornelia", "Apple", "W", 5, 6, 5);
        StudentInfo student3 = new StudentInfo("Johny", "Cash", "M", 2, 2, 2);

        System.out.println("Average grade for the student: " +  student1.name + " is: " + ((student1.mathGrade + student1.informaticsGrade + student1.physicsGrade) / 2));
        System.out.println("Average grade for the student: " +  student2.name + " is: " + ((student2.mathGrade + student2.informaticsGrade + student2.physicsGrade) / 2));
        System.out.println("Average grade for the student: " +  student3.name + " is: " + ((student3.mathGrade + student3.informaticsGrade + student3.physicsGrade) / 2));

    }

}
