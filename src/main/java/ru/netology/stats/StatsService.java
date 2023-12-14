package ru.netology.stats;

public class StatsService {
    long sum(long[] sales) {
        long totalSales = 0;
        for (long sale : sales) {
            totalSales += sale;
        }
        return totalSales;
    }

    long average(long[] sales) {
        long totalSales = 0;
        for (long sale : sales) {
            totalSales += sale;
        }
        long averageSale = totalSales / 12;

        return averageSale;
    }

    int monthMaxSale(long[] sales) {
        int monthMaxSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMaxSale]) {
                monthMaxSale = i;
            }

        }
        return monthMaxSale + 1;
    }

    int monthMinSale(long[] sales) {
        int monthMinSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMinSale]) {
                monthMinSale = i;
            }

        }
        return monthMinSale + 1;
    }

    int monthBelowAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }
        return counter;
    }

    int monthHigherAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;
            }
        }
        return counter;

    }
}
