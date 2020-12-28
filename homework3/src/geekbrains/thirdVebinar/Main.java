package geekbrains.thirdVebinar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int rand = (int) (Math.random()*10);
        guessTheNumber(rand);
    }

    private static void guessTheNumber(int number) {

        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        for (int i = 2; i<3 && i>=0; i--) {
            System.out.printf("Предположите число от 0 до 9 включительно: ");
            int inputNumber = scanner.nextInt(10);
            if (inputNumber == number){
                System.out.println("Вы угадали! Желаете сыграть ещё раз?\n 1 - Да. 2 - Нет.");
                int check = scanner1.nextInt();
                if (check ==1){
                    System.out.println("Что ж, сыграем ещё раз!");
                i = 3;}
                else{
                    System.out.println("Игра окончена.");
                    break;
                }}
            else if (inputNumber > number)
                System.out.printf("Введенное число больше загаданного, попробуйте ещё раз. Осталось попыток %d \n", i );
            else
                System.out.printf("Введенное число меньше загаданного, попробуйте ещё раз. Осталось попыток %d \n", i);
            if (i==0){
                System.out.println("У вас закончились попытки=(. Желаете сыграть ещё раз?\n 1 - Да. 2 - Нет.");
                int check = scanner1.nextInt();
                if (check == 1){
                    System.out.println("Что ж, сыграем ещё раз!");
                    i = 3;}
                else{
                    System.out.println("Игра окончена.");
                    break;}
            }
        }
    }


}

