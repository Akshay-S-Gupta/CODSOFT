//TASK -- 2
//Importing Scanner class.
import java.util.Scanner;

public class GradeCalculator {
    
    //Grading method.
    static String gradeAllocation(int percentage) {
        //Calculates and returns the overall grade. 
        if (percentage > 90)
            return "O";
        else if (percentage > 80)
            return "A+";
        else if (percentage > 70)
            return "A";
        else if (percentage > 60)
            return "B+";
        else if (percentage > 50)
            return "B";
        else if (percentage > 45)
            return "C+";
        else if (percentage > 40)
            return "C";
        else
            return "F";
    }
    
	public static void main(String arg[]) {
		Scanner in = new Scanner(System.in);
		int total = 0; 
		
		//Number of subjects.
		System.out.print("\nEnter No. of Subjects: ");
		int no_of_subjects = in.nextInt();
		
		//Array of marks.
		int marks[] = new int[no_of_subjects];
		
		System.out.println("Enter marks between 1 & 100\n");
		for (int i = 0; i < no_of_subjects ; i++) {
		    System.out.printf("Enter marks of Subject %d: ", (i+1));
		    marks[i] = in.nextInt();
		    
		    //Checking invalid entry of marks.
		    if (marks[i] < 0 || marks[i] > 100) {
                System.out.printf("Invalid Marks...");
                System.exit(0);                                         //Terminates JVM (or) Exits the execution.
		    }
            
		    //Totaling of marks.
		    total += marks[i];
		}
		
		//Average of marks.
		double average_percentage = total/no_of_subjects;
		
		//Grade method call.
		String grade = gradeAllocation((int)average_percentage);
		System.out.printf("\nTotal marks: %d\nAverage percentage: %.2f\nGrade: %s\n", total, average_percentage, grade);
	}
}
