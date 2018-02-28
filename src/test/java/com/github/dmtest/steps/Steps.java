package com.github.dmtest.steps;

import com.github.dmtest.utils.CommonFunctions;
import io.qameta.allure.Step;
import org.junit.Assert;

import java.io.IOException;

public class Steps {

    @Step
    public static void checkSumStep(int num1, int num2, int expectedSum) {
        Assert.assertTrue("Сумма слагаемых не соответствует ожидаемому значению", num1 + num2 == expectedSum);
    }

    @Step(value = "Проверка разности числа {num1} и числа {num2}")
    public static void checkSubtractionStep(int num1, int num2, int expectedResult) {
        Assert.assertTrue("Результат вычитания не соответствует ожидаемому значению", num1 - num2 == expectedResult);
    }

    @Step(value = "Проверка эквивалентности строки {str1} строке {str2}")
    public static void checkStringEqualsStep(String str1, String str2) throws IOException {
        Assert.assertTrue("Строки не эквивалентны", str1.equals(str2));
        CommonFunctions.getBytes("picture.jpg");
        CommonFunctions.getBytes("text.txt");
    }

    @Step(value = "Зачитать джейсон")
    public static void readJsonStep() throws IOException {
        CommonFunctions.getBytesAnnotationWithArgs("json.json");
    }
}
