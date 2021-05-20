package com.company;

public class skier {
    public static void main(String[] args) {
        double firstDay = 10000;
        double numberOfDay = 10;
        double sum;
        double result=0;

        double percent = 10;
        int i = 1;

        while (i < numberOfDay) {
            firstDay = firstDay + firstDay * percent / 100;
            i++;

            System.out.println("day - " + i + " number of km - " + firstDay);

            if (i == 7) {
                sum = firstDay;
                result=sum*i;//путь за 7 дней
//                System.out.print("sum - " + (sum*i));
            }
        }
        System.out.print("result - " + result + " km ");
    }
}