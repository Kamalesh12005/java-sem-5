import java.util.*;

class Switch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the grade:");
        String grade = s.nextLine();
        switch (grade){
            case "A":
                System.out.println("A-Excellent");
                break;
                 case "B":
                System.out.println("B-Good");
                break;
                 case "C":
                System.out.println("C-Average");
                break;
                 case "D":
                System.out.println("D-Poor");
                break;
                 case "E":
                System.out.println("E-Fail");
                break;
        default:
        System.out.println("Insufficient mark");
    }
    }
}