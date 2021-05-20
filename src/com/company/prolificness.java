package com.company;

public class prolificness {
    public static void main(String[] args) {
        double landArea = 100;
        double harvest = 20;
        double percentLandArea = 5;
        double percentHarvest = 2;
        int year = 1;

        double sumLandArea6Years = 0;
        while (year < 8) {
            landArea = landArea + landArea * percentLandArea / 100;
            year++;
            System.out.println(year + " landArea - " + landArea);

            if (year == 6) {
                sumLandArea6Years = landArea;//площадь участка за 6 лет
//                System.out.println(i + " sumLandArea6Years - " + sumLandArea6Years);
            }
        }

        double sumHarvest6Years=0;
        int harvestFirstYears = 3;
        int harvestFinishYears = 7;
        int step = harvestFirstYears;

        while (step <= harvestFinishYears) {
            harvest = harvest + harvest * percentHarvest / 100;
            step++;

            System.out.println(step + " harvest - " + harvest);

            if (step == 6) {
                sumHarvest6Years = harvest;//средняя урожайность участка за 6 лет
//                System.out.println(c + " sumHarvest6Years - " + sumHarvest6Years);
            }
        }

        int result6Years;
        result6Years= (int) (sumLandArea6Years*sumHarvest6Years);//урожай участка за 6 лет
        System.out.println(" result6Years - " + result6Years);
    }
}
