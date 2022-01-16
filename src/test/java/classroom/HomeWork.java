package classroom;

public class HomeWork {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("Integer value is" + " " + x);


        //Discounts on the laundry

        int a = 80;

        if (a < 18) {
            System.out.println("Your age not correct. Try again");
        } else if (a >= 18 && a <= 21) {
            System.out.println("Hello. Today student from 18 to 21 can get 10% discount.");
        } else if (a >= 22 && a <= 64) {
            System.out.println("Hello. Today people from 22 to 65 can get 15% discount.");
        } else {
            System.out.println("Hello. Today people over 65 can get 20% discount. ");
        }


        String[] animals = {"Fox", "Rabbit", "Elephant", "Tiger", "Lion", "Turtle", "Goat", "Manky", "Deer", "Mouse"};

        for (int b = 0; b < 10; b++) {
            System.out.print(animals[b] + ",");
        }
        System.out.println();

        //Array example

        int[] array = new int[10];
        for (int c = 0; c < 12; c = c + 2) {
            System.out.print(c + ", ");
        }
        System.out.println();

        //Switch

        int currentTransport = 7;
        switch (currentTransport) {
            case 1:
                System.out.println("Your transport today is a taxi.");
                break;
            case 2:
                System.out.println("Your transport today is a horse.");
                break;
            case 3:
                System.out.println("Your transport today is a bus.");
                break;
            case 4:
                System.out.println("Your transport today is a plane.");
                break;
            case 5:
                System.out.println("Your transport today  bike.");
                break;
            case 6:
                System.out.println("Your transport today your car.");
                break;
            case 7:
                System.out.println("Today you walk.");
                System.out.println();

                //currentNumber

                for (int d = 1; d < 101; d++) {
                    System.out.print(d + ", ");
                }
                System.out.println();
                for (int y = 50; y > 0; y--) {
                    System.out.print(y + ", ");
                }

                System.out.println();

                //multiplication table

                // on 2
                for (int c = 2; c < 22; c = c + 2) {
                    System.out.print(c + " ");
                }
                System.out.println();

                // on 3
                for (int c = 3; c < 33; c = c + 3) {
                    System.out.print(c + " ");
                }
                System.out.println();

                // on 4
                for (int c = 4; c < 44; c = c + 4) {
                    System.out.print(c + " ");
                }
                System.out.println();

                // on 5
                for (int c = 5; c < 55; c = c + 5) {
                    System.out.print(c + " ");
                }
                System.out.println();

                //on 6
                for (int c = 6; c < 66; c = c + 6) {
                    System.out.print(c + " ");
                }
                System.out.println();

                // on 7
                for (int c = 7; c < 77; c = c + 7) {
                    System.out.print(c + " ");
                }
                System.out.println();

                // on 8
                for (int c = 8; c < 88; c = c + 8) {
                    System.out.print(c + " ");
                }
                System.out.println();

                // on 9
                for (int c = 9; c < 99; c = c + 9) {
                    System.out.print(c + " ");
                }
                System.out.println();

                // on 10
                for (int c = 10; c < 110; c = c + 10) {
                    System.out.print(c + " ");
                }


        }


    }
}
