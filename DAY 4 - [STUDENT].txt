package constructor;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private int roll;
    private ArrayList<String> subjectNames = new ArrayList<>();
    private ArrayList<Integer> marks = new ArrayList<>();

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void addSubject(String subject, int mark) {
        subjectNames.add(subject);
        marks.add(mark);
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }

    public int getTotal() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    public double getAverage() {
        if (marks.isEmpty()) return 0;
        return getTotal() / (double) marks.size();
    }

    public void showMarks() {
        for (int i = 0; i < subjectNames.size(); i++) {
            System.out.println(subjectNames.get(i) + ": " + marks.get(i));
        }
    }
}

 class StudentWithSubjectNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        System.out.print("Enter student name: ");
        s.setName(sc.nextLine());

        System.out.print("Enter roll number: ");
        s.setRoll(sc.nextInt());

        System.out.print("Enter number of subjects: ");
        int subjectCount = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < subjectCount; i++) {
            System.out.print("Enter subject name " + (i + 1) + ": ");
            String subject = sc.nextLine();

            System.out.print("Enter marks for " + subject + ": ");
            int mark = sc.nextInt();
            sc.nextLine(); 

            s.addSubject(subject, mark);
        }
        System.out.println("\n--- Student Report ---");
        System.out.println("Name       : " + s.getName());
        System.out.println("Roll Number: " + s.getRoll());
        System.out.println("\nSubject-wise Marks:");
        s.showMarks();
        System.out.println("\nTotal Marks: " + s.getTotal());
        System.out.printf("Average    : %.2f\n", s.getAverage());

        sc.close();
    }
}