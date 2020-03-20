import java.util.Scanner;

public class MenuDesign {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Menu\n" +
                "1. Draw the triangle\n" +
                "2. Draw the square\n" +
                "3. Draw the rectangle\n" +
                "0. Exit\n" +
                "Enter your choice:");

        int choice = input.nextInt();

        if (choice == 1) {
            System.out.print("Nhập vào độ dài của đáy hình tam giác : ");
            int triangle = input.nextInt();
            for (int i = 0; i < triangle; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        if (choice == 2) {
            System.out.print("Nhập vào độ dài 1 cạnh của hình vuông : ");
            int square = input.nextInt();
            for (int i = 0; i < square; i++) {
                for (int j = 0; j < square; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        if (choice == 3){
            System.out.print("Nhập vào độ dài chiều dài HCN : ");
            int recHeight = input.nextInt();
            System.out.print("Nhập vào độ dài chiều dài HCN : ");
            int recWidth = input.nextInt();

            for (int i = 0; i < recHeight; i++) {
                for (int j = 0; j < recWidth; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        if (choice == 0){
            System.out.print("Bye");
        }
    }
}
