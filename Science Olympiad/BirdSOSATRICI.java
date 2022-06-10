//https://drive.google.com/drive/u/0/folders/1pzRLMGffuRTGfeJ5Bapz4Tb302p9Gw2p

import java.util.*;

public class BirdSOSATRICI {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the BirdSO Satellite RICI SAVM (Super Advanced Vending Machine).");
        System.out.println("Note: For this test, every input prompt will end with a description of");
        System.out.println("possible inputs between angle brackets <>. You may assume all inputs will");
        System.out.println("be restricted to that data type. Additional constraints may follow in curly");
        System.out.println("braces {} and must be checked by the program.");

        System.out.println("=============");
        System.out.println("| Main Menu |");
        System.out.println("=============");
        System.out.println("[1] Getting Started");
        System.out.println("[2] Enter The Machine");
        System.out.println("[3] RESTRICTED ACCESS");
        System.out.println("[4] Exit");
        System.out.println("<1 Integer> {Range: 1-4}");

        int option = sc.nextInt();

        if (option == 1) {
            while (true) {

                gettingStarted();
            }
        }

        if (option == 2) {
            enterTheMachine();
        }

    }

    public static void gettingStarted() {
        System.out.println("===================");
        System.out.println("| Getting Started |");
        System.out.println("===================");
        System.out.println("[1] Print SAVM Logo");
        System.out.println("[2] Display Text Banner");
        System.out.println("[3] Draw A Square");
        System.out.println("[4] Draw A Rectangle");
        System.out.println("[5] Draw A Filled Circle");
        System.out.println("[6] Draw A Circle");
        System.out.println("[7] Generate Serial Numbers");
        System.out.println("[8] Validate A Serial Number");
        System.out.println("[9] Return To Main Menu");
        System.out.println("<1 Integer> {Range: 1-9}");

        int num = sc.nextInt();
        if (num == 1) {
            String s = "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMMWKxlclkXMMMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMMMNx,.....lOXMMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMWNd..;ll'.';kWMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMWXx'.;:;l;...dWMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMMK:...'''...'dWMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMMNo...........oWMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMMWd............lNMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMMW0:............:XMMMMMMMMMMMMMMMMM\n" +
                    "MMMMMNk;.............,OWMMMMMMMMMMMMMMMM\n" +
                    "MMMMKo'...............;xNMMMMMMMMMMMMMMM\n" +
                    "MMMNo'.................'oXMMMMMMMMWNNMMM\n" +
                    "MMMWO;..................'c0WMMMMNkc,c0MM\n" +
                    "MN0Oxc;,,,,,,,'...........;xNMWKc....dXW\n" +
                    "MXxxxo:;;:;,,,.............'oOd,......,d\n" +
                    "WWWWXd::c;'...........................,k\n" +
                    "NXXXx:..,;'.';;'.........';cl:.......,kW\n" +
                    "WNXkclddo:;:dOk:',:loodxk0XWWXOdl:,'.'oN\n" +
                    "MMMXKNMMN00NWMNK0KNWMMMMMMMMMMMMWNXK00XW\n" +
                    "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM";
            System.out.println(s);
        }

        else if (num == 2) {
            System.out.println("Beautify some text!");
            System.out.println("<1 String>");
            String userText = sc.nextLine();
            System.out.println("=========");
            System.out.println("| " + userText + " |");
            System.out.println("=========");
        } else if (num == 3) {
            System.out.println("Draw a square up to 20 wide.");
            System.out.println("<1 Integer> {Range: 0-20}");
            int side = sc.nextInt();
            for (int i = 0; i < side; i++) {
                if (i == 0 || i == side - 1) {
                    for (int j = 0; j < side; i++) {
                        System.out.print("#");
                    }
                } else {
                    for (int j = 0; j < side; j++) {
                        if (j == 0 || j == side - 1) {
                            System.out.print("#");
                        } else {
                            System.out.print(" ");
                        }
                    }
                }

                System.out.println();
            }

        }

        else if (num == 4) {
            System.out.println("Draw a rectangle up to 20x20.");
            System.out.println("<2 Integers> {Range: 0-20}");
            int width = sc.nextInt();
            int len = sc.nextInt();

            for (int i = 0; i < len; i++) {
                if (i == 0 || i == width - 1) {
                    for (int j = 0; j < width; i++) {
                        System.out.print("#");
                    }
                } else {
                    for (int j = 0; j < width; j++) {
                        if (j == 0 || j == width - 1) {
                            System.out.print("#");
                        } else {
                            System.out.print(" ");
                        }
                    }
                }

                System.out.println();
            }

        }

        else if (num == 5) {
            System.out.println("Your mother is a sussy BAKA");
        }

        else if (num == 6) {
            System.out.println("Your mother is a sussy BAKA");
        }

        else if (num == 7) {
            System.out.println("Generated 10 random serial numbers.");
            System.out.println();
            for (int n = 0; n < 10; n++) {

                String serial = "s";
                for (int i = 0; i < 3; i++) {
                    serial += "" + (int) (Math.random() * 10);
                }
                serial += "-";

                for (int i = 0; i < 3; i++) {
                    Random r = new Random();
                    char c = (char) (r.nextInt(26) + 'a');
                    String str = "" + c;
                    serial = serial + "" + str.toUpperCase();
                }
                serial += "-";
                for (int i = 0; i < 3; i++) {
                    serial += "" + (int) (Math.random() * 10);
                }
                System.out.println(serial);
            }
        }

        else if (num == 8) {
            System.out.println("Your mother is a sussy BAKA");
        }

        else if (num == 9) {
            System.out.println("=============");
            System.out.println("| Main Menu |");
            System.out.println("=============");
            System.out.println("[1] Getting Started");
            System.out.println("[2] Enter The Machine");
            System.out.println("[3] RESTRICTED ACCESS");
            System.out.println("[4] Exit");
            System.out.println("<1 Integer> {Range: 1-4}");
        }

    }

    public static void enterTheMachine() {
        int optionSAVM = sc.nextInt();
        System.out.println("========\n"
                + "| SAVM |\n"
                + "========\n"
                + "[Wallet: $5.00 | Items Purchased: 0]\n"
                + "[1] Withdraw From ATM\n"
                + "[2] View Vending Machine\n"
                + "[3] Item Info\n"
                + "[4] Buy An Item\n"
                + "[5] Splurge\n"
                + "[6] Return To Main Menu\n"
                + "<1 Integer> {Range: 1-6}\n");
        // user may withdraw money, probabilisticly.
        if (optionSAVM == 1) {
            System.out.println(
                    "Withdraw money in dollar increments (i.e. $1.00 and $5.00) where the chance of success decreases for\n"
                            + "larger amounts. For example, 50% chance to withdraw $2.00, but 5% chance to withdraw $20.00.\n"
                            + "(Note: The money withdrawn is stored inside the SAVM)\n"
                            + "<1 Integer> {1 or greater}");
            int optionwithdraw = sc.nextInt();
        }
        // user can view vending machine
        if (optionSAVM == 2) {
            System.out.println(" ____________________________________________ ");
            System.out.println("|############################################|");
            System.out.println("|#|                           |##############|");
            System.out.println("|#| #######    ###            |##|````````|##|");
            System.out.println("|#| #     #   #   #           |##| Exact  |##|");
            System.out.println("|#| #     #   #   #           |##| Change |##|");
            System.out.println("|#| #     #   #   #           |##| Only   |##|");
            System.out.println("|#| #######    ###            |##|________|##|");
            System.out.println("|#|===========================|##############|");
            System.out.println("|#|```````````````````````````|##############|");
            System.out.println("|#|          #######  ####### |##############|");
            System.out.println("|#| #######  #     #  #     # |#|`````````|##|");
            System.out.println("|#| #     #  #     #  #     # |#| _______ |##|");
            System.out.println("|#| #     #  #     #  #     # |#| |1|2|3| |##|");
            System.out.println("|#| #######  #######  ####### |#| |4|5|6| |##|");
            System.out.println("|#|===========================|#| |7|8|9| |##|");
            System.out.println("|#|```````````````````````````|#| ``````` |##|");
            System.out.println("|#|   ###     #####     ###   |#|[=======]|##|");
            System.out.println("|#|  #####    #   #    #   #  |#|  _   _  |##|");
            System.out.println("|#|  #####    #   #    #   #  |#| ||| ( ) |##|");
            System.out.println("|#|  #####    #   #    #   #  |#| |||  `  |##|");
            System.out.println("|#|   ###     #####     ###   |#|  ~      |##|");
            System.out.println("|#|===========================|#|_________|##|");
            System.out.println("|#|```````````````````````````|##############|");
            System.out.println("|############################################|");
            System.out.println("|#|||||||||||||||||||||||||||||####```````###|");
            System.out.println("|#||||||||||||PUSH|||||||||||||####\\|||||/###|");
            System.out.println("|############################################|");
            System.out.println("\\\\\\\\\\\\\\\\\\\\\\///////////////////////");
            System.out.println(" |________________________|S191-BYG-178|___|  ");
        }
        // user views more item info
        if (optionSAVM == 3) {
            System.out.println("Look at an item in the vending machine for more info.\n"
                    + "<1 Integer> {Range: 1-9}");

            // ask user desired information
            int optionitem = sc.nextInt();

            if (optionitem == 1) {
                System.out.println("======================\n"
                        + "| Lay's Potato Chips |\n"
                        + "======================\n"
                        + "Price: $1.50\n"
                        + "Serial Number: S108-DJW-554");
            }

        }
    }

}