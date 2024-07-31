import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание 9");
//Задача 1
        System.out.println("Задача 1");
        int[] costs = new int[5];
        costs[0] = 100;
        costs[1] = 125;
        costs[2] = 714;
        costs[3] = 452;
        costs[4] = 624;
        int allcosts = 0;
        int i;
        for (i = 0; i < costs.length; i++) {
            allcosts += costs[i];
        }
        System.out.println("Сумма трат за месяц составила " + allcosts + " рублей");

//Задача 2
        System.out.println("Задача 2");
        int maxCosts = -1;
        for (i = 0; i < costs.length; i++) {
            if (costs[i] > maxCosts) {
                maxCosts = costs[i];
            }
        }
        System.out.println("Максимальная трата за месяц " + maxCosts + " рублей");
        int minCosts = Arrays.stream(costs).min().getAsInt();
        ;
        System.out.println("Минимальная трата за месяц " + minCosts + " рублей");
//Задача 3
        System.out.println("Задача 3");
        double all = 0;
        double mean = 0;
        for (i = 0; i < costs.length; i++) {
            all += costs[i];
            ;
        }
        mean = all / i;
        System.out.println("Средняя трата за неделю " + mean + " рублей");

//Задача 4
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println(" ");
        //Другая версия
        int n = reverseFullName.length;
        char temp;
        for (i=0;i< n/2; i++){
            temp=reverseFullName[n-i-1];
            reverseFullName[n-i-1]=reverseFullName[i];
            reverseFullName[i]=temp;
        }
        for (i = 0; i < reverseFullName.length; i++) {
            System.out.print(reverseFullName[i]);
    }
}}