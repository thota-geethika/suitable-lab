import java.util.Scanner;

public class SuitableLab {
    public static void main(String[] args) {
        // Number of labs are 3.

        // Taking the capacities of labs as an input from user.
        int[] labsCapacities = new int[3];
        System.out.println("Enter the capacities of 3 labs one by one: ");

        Scanner scan = new Scanner(System.in);
        int capacity;
        for(int iterator=0;iterator<3;iterator++)
        {
            capacity = scan.nextInt();
            labsCapacities[iterator] = capacity;
        }

        // taking number of Students as an input from user.
        int numberOfStudents;
        System.out.println("Enter number of students in the class: ");
        numberOfStudents = scan.nextInt();

        // Finding out the initial suitable lab from the list of labs.
        int suitableLab = -1;
        for(int iterator = 0;iterator<labsCapacities.length;iterator++)
        {
            if(labsCapacities[iterator]>numberOfStudents)
            {
                suitableLab = iterator;
                break;
            }
        }

        // Finding out the best suitable labs by simple comparison.
        for(int iterator=suitableLab+1;iterator<labsCapacities.length;iterator++)
        {
            if(labsCapacities[iterator] > numberOfStudents && labsCapacities[iterator] < labsCapacities[suitableLab])
            {
                suitableLab = iterator;
            }
        }

        //Printing out the most suitable lab
        System.out.println("The most suitable lab is L"+(suitableLab+1));

    }
}