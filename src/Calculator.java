import java.util.Scanner;

public class Calculator {
    public static void main (String[] args) {

        //Create objects of Numbers class
        Numbers number1 = new Numbers();
        Numbers number2 = new Numbers();
        Numbers number3 = new Numbers();

        //Ask user to enter numbers from 1 to 10 using method enterNumber
        number1.enterNumber();
        number2.enterNumber();
        number3.enterNumber();

//        number1.stackPush();
//        number2.stackPush();
//        number3.stackPush();

        //Create objects of Operator class
        Operator operator1 = new Operator();
        Operator operator2 = new Operator();

        //Ask user to enter operator "+", "-", "*", "/"
        operator1.enterOperator();
        operator2.enterOperator();

        //Create object answer of Answer class
            int answer = 0;
            int[] arrayNumber = new int[]{number1.number, number2.number, number3.number};
            switch(operator1.operator)
                {
                    case '+':
                        switch (operator2.operator) {
                            case '+':
                                answer = arrayNumber[0] + arrayNumber[1] + arrayNumber[2];
                                break;
                            case '-':
                                answer = arrayNumber[0] + arrayNumber[1] - arrayNumber[2];
                                break;
                            case '*':
                                answer = arrayNumber[0] + arrayNumber[1] * arrayNumber[2];
                                break;
                            case '/':
//                                answer = arrayNumber[0] + arrayNumber[1] / arrayNumber[2];
                                if ((arrayNumber[1] % arrayNumber[2]) == 0) {
                                answer = arrayNumber[0] + arrayNumber[1] / arrayNumber[2];
                            }
                                else {}
                                break;
                            default:
                                System.out.printf("Wrong operator");
                                break;
                        }
                        break;
                    case '-':
                        switch (operator2.operator) {
                            case '+':
                                answer = arrayNumber[0] - arrayNumber[1] + arrayNumber[2];
                                break;
                            case '-':
                                answer = arrayNumber[0] - arrayNumber[1] - arrayNumber[2];
                                break;
                            case '*':
                                answer = arrayNumber[0] - arrayNumber[1] * arrayNumber[2];
                                break;
                            case '/':
                                answer = arrayNumber[0] - arrayNumber[1] / arrayNumber[2];
                                break;
                            default:
                                System.out.printf("Wrong operator");
                                break;
                        }
                        break;
                    case '*':
                        switch (operator2.operator) {
                            case '+':
                                answer = arrayNumber[0] * arrayNumber[1] + arrayNumber[2];
                                break;
                            case '-':
                                answer = arrayNumber[0] * arrayNumber[1] - arrayNumber[2];
                                break;
                            case '*':
                                answer = arrayNumber[0] * arrayNumber[1] * arrayNumber[2];
                                break;
                            case '/':
                                answer = arrayNumber[0] * arrayNumber[1] / arrayNumber[2];
                                break;
                            default:
                                System.out.printf("Wrong operator");
                                break;
                        }
                        break;
                    case '/':
                        switch (operator2.operator) {
                            case '+':
                                answer = arrayNumber[0] / arrayNumber[1] + arrayNumber[2];
                                break;
                            case '-':
                                answer = arrayNumber[0] / arrayNumber[1] - arrayNumber[2];
                                break;
                            case '*':
                                answer = arrayNumber[0] / arrayNumber[1] * arrayNumber[2];
                                break;
                            case '/':
                                answer = arrayNumber[0] / arrayNumber[1] / arrayNumber[2];
                                break;
                            default:
                                System.out.printf("Wrong operator");
                                break;
                        }
                        break;
                }
        System.out.print("\nThe answer is given as follows:\n");
        System.out.printf(number1.number +" "+operator1.operator +" "+number2.number + " " +operator2.operator + " " + number3.number +" = "+ answer);
    }
}

//Number class with check that numbers in range from 1 to 10
class Numbers {
    int number;
    //Artificial method to allow easier to check code
    void displayInfo() {
        System.out.printf("number: " + number);
    }
    void enterNumber() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter number from 1 to 10: ");
        number = reader.nextInt();
        //Check for numbers that they are in range from 1 to 10
        if (Math.abs(number) > 10 || Math.abs(number) < 1) {
            System.out.printf("Wrong number, please enter numbers from 1 to 10: ");
            reader.close();
        }
    }
}
//    String stackPush() {
//        Stack stack = new Stack();
//        currentArray =" " + stack.push(number);
//        return currentArray;
//    }

//Operator class '+', '-', '*', '/'
class Operator {
    char operator;

    void enterOperator() {
        Scanner reader = new Scanner(System.in);
        System.out.print("\nEnter operator (+, -, *, /): ");
        operator = reader.next().charAt(0);
    }
}