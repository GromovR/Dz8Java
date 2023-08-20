package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    public void TestSum() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.sum(sales);

        long expected = 180;

        Assertions.assertEquals(actual, expected);
    }


    @Test

    public void Testaverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.average(sales);

        long expected = 180 / 12;

        Assertions.assertEquals(actual, expected);
    }

    @Test

    public void Testmax() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.maxmount(sales);

        long expected = 8;

        Assertions.assertEquals(actual, expected);
    }

    @Test

    public void Testmin() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.minmount(sales);

        long expected = 9;

        Assertions.assertEquals(actual, expected);

    }

    @Test

    public void Testmincountmounth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.mountlow(sales);

        long expected = 5;

        Assertions.assertEquals(actual, expected);
    }

    @Test

    public void Testmaxcountmounth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.mountlow(sales);

        long expected = 5;

        Assertions.assertEquals(actual, expected);
    }
}

