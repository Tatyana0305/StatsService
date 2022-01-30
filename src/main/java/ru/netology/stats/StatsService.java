package ru.netology.stats;

public class StatsService {


    public long sumSales(long[] sales) {
        long sumSales = 0;
        for (long sale : sales) {
            sumSales = sumSales + sale;
        }
        return sumSales;
    }

    public long averageSales(long[] sales) {
        long sumSales = 0;
        int month = 0;
        long averageSales = 0;
        for (long sale : sales) {
            sumSales = sumSales + sale;
            month = month + 1;
            averageSales = sumSales / month;
        }
        return averageSales;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int numberMonthsUnderAverage(long[] sales) {

        int month = 0;
        long averageSales = averageSales(sales);
        int countMonths = 0;
        for (long sale : sales) {
            month = month + 1;

            if (sale < averageSales) {
                countMonths++;
            }
        }
        return countMonths;
    }

    public int numberMonthsOverAverage(long[] sales) {
        int month = 0;
        long averageSales = averageSales(sales);
        int countMonths = 0;
        for (long sale : sales) {
            month = month + 1;

            if (sale > averageSales) {
                countMonths++;
            }
        }
        return countMonths;
    }

}




