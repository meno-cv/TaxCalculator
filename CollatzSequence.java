import java.util.Scanner;
class CollatzSequence{
    public static int collatz(int number){
		

        int steps = 0;

        System.out.print(number);

        while (number > 1) {

            if (number % 2 == 0) {
                number = number / 2;
            } else {
                number = number * 3 + 1;
            }

            System.out.print(" -> " + number);
            steps++;
        }

        return steps;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input a positive number: ");
        int number = input.nextInt();

        int steps = collatz(number);

        System.out.println("\nSteps taken: " + steps);

        input.close();
    }
}
