package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long selling = 0;
        for (long sale : sales) {
            selling += sale;

        }
        return selling;
    }

    public long average(long[] sales) {
        return sum(sales) / 12;
        //       long selling = 0;
        //      for (long sale : sales) {
        //          selling += sale;
        //       }
        //     long average = selling / 12;
        // return average;
    }

    public int maxmount(long[] sales) {
        int maxsale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxsale]) {
                maxsale = i;
            }
        }
        return maxsale + 1;

    }

    public int minmount(long[] sales) {
        int minsale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minsale]) {
                minsale = i;
            }
        }
        return minsale + 1;
    }

    public int mountlow(long[] sales) {


        int count = 0;

        long aversale = average(sales);

        for (long sale : sales) {

            if (sale < aversale) {
                count++;
            }
        }
        return count;
    }

    public int mounthight(long[] sales) {


        int count = 0;

        long aversale = average(sales);

        for (long sale : sales) {

            if (sale > aversale) {
                count++;
            }
        }
        return count;
    }
}











