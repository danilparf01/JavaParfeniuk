import java.util.Scanner;
public class Main {


    public static void main (String[] args){
        System.out.println("Задача №1");
        System.out.println("Введите число 1, 2 или 3: ");
        Scanner inputFigure = new Scanner(System.in);
        int enteredValue = inputFigure.nextInt();
        if (enteredValue==1) {
            System.out.println("Вы ввели: "+enteredValue);
        }
        else if (enteredValue==2) {
            System.out.println("Вы ввели: "+enteredValue);
        }
        else if (enteredValue==3) {
            System.out.println("Вы ввели: "+enteredValue);
        }
        else System.out.println("Введено не то число");


        System.out.println("Задача №2");
        for (int i=5;i>0;i--) {
            System.out.print(i + " ");
        }
        System.out.println();


        System.out.println("Задача №3");
        int multipliedValue = 3;
        int maxMultiplier = 10;
        for (int i=1; i<maxMultiplier+1;i++) {
            System.out.println(multipliedValue + "*" + i + "=" + multipliedValue * i);
        }


        System.out.println("Задача №4");
        int firstNumber = 0;
        int lastNumber = 100;
        for (int i=0; i<lastNumber+1; i++) {
            firstNumber += i;
        }
        System.out.println("Cреднее значение суммы чисел = "+(float)firstNumber/lastNumber);


        System.out.println("Задача №5");
        int[] array = {5,2,4,8,88,22,10};
        int maxArrayNumber = array[0];
        for(int i = 0; i < array.length; i++) {
            if(array[i] >= maxArrayNumber) {
                maxArrayNumber= array[i];
            }
        }
        System.out.println("Максимальное число в массиве: " +maxArrayNumber);

    }
}