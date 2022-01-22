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
        for (int c = 0; c < 12; c++) {
            if (c % 2 == 0)
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

                for (int r = 1; r <= 10; r++) {
                    for (int t = 1; t <= 10; t++) {
                        int result = r * t;
                        System.out.printf("%4d", result);
                    }
                    System.out.println();
                }


        }


    }
}
