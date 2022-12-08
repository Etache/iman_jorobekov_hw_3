import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] numArray = {33.0, -16.0, 37.0, -16.0, -35.0, 21.0, 38.0, 21.0, 2.0, -27.0, 5.0, 11.0, -6.0, -24.0, -7.0};
        boolean firstPosNum = false;
        double sum = 0;
        int counter = 0;

        for (double positiveNumbers : numArray) {
            if (firstPosNum && positiveNumbers < 0) {
                continue;
            } else if (positiveNumbers > 0) {
                sum = sum + positiveNumbers;
                counter++;
            } else {
                firstPosNum = true;
                sum = 0;
                counter = 0;
            }

        }
        System.out.println(Arrays.toString(numArray));

        double average = sum / counter;
        String averageRedused = String.format("%.3f", average);    // сократил до тысячных

        System.out.println("\n" + "Сумма положительных чисел - " + sum);
        System.out.println("Кол-во - " + counter);
        System.out.println("Среднее арифметическое положительных чисел - " + averageRedused);



//        //Сортировка  --  не доделал
//        for (int sort : numArray) {
//            for (int i = 0; i < numArray.length; i++) {
//                numArray[i] = i;
//            }
//        }
    }
}
