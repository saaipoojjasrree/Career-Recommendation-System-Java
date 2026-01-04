import java.util.*;

public class CareerRecommendation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Programming Skill (1-10): ");
        int programming = sc.nextInt();

        System.out.print("Math Skill (1-10): ");
        int math = sc.nextInt();

        System.out.print("Communication Skill (1-10): ");
        int communication = sc.nextInt();

        if (programming >= 7 && math >= 7)
            System.out.println("Recommended Career: Data Scientist");
        else if (programming >= 7)
            System.out.println("Recommended Career: Software Engineer");
        else if (communication >= 7)
            System.out.println("Recommended Career: Business Analyst");
        else
            System.out.println("Recommended Career: General IT Role");

        sc.close();
    }
}
