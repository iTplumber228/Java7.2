package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxAmongOneElementInMassive() { // Находит максиммум среди одного элемента в массиве
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {1};
        long expected = 1;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    @Test
    void findMaxAmongDifferentNumbers() { // Находит максимальное положительное число среди положительных и отрицательных чисел
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {1, -4, 5, -12, 9, -3};
        long expected = 9;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

}