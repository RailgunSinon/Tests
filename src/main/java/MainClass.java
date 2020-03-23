import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        int floors = 0;
        int climb = 0;
        int descent = 0;
        int elevator = 0;
        int result = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of floors:");
        floors =  input.nextInt();
        System.out.println("Enter the speed of the rise:");
        climb = input.nextInt();
        System.out.println("Enter the speed of descent:");
        descent = input.nextInt();
        System.out.println("Enter the speed of elevator:");
        elevator = input.nextInt();

        ElevatorCalcImpl elevatorCalc = new ElevatorCalcImpl();

        result = elevatorCalc.timeCalculation(floors,climb,descent,elevator);

        System.out.println(result);

    }
}
