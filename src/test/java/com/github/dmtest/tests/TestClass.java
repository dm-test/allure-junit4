package com.github.dmtest.tests;

import com.github.dmtest.steps.Steps;
import io.qameta.allure.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class TestClass {

//    @Test
    public void simpleTest1() {
        Assert.assertTrue("Данное сообщение никогда не будет выведено", 3 + 2 == 5);
    }

//    @Test
    public void simpleTest2() {
        Steps.checkSumStep(3, 2, 5);
        Steps.checkSumStep(5, 4, 9);
    }

//    @Test
    public void simpleTest3() {
        Steps.checkSubtractionStep(10, 8, 2);
    }

//    @Test
    public void simpleTest4() throws IOException {
        String darkSouls = "Dark souls 3";
        Steps.checkStringEqualsStep(darkSouls, darkSouls);
    }

//    @Test
    public void simpleTest5() throws IOException {
        Steps.readJsonStep();
        Assert.assertTrue(true);
    }

//    @Test
    public void simpleTest6() {
        Steps.addLinkSber();
        Assert.assertTrue(true);
    }


    /**
     * dhshfdksjfkzjzkfjzkzzfzfzcz.
     * FIXME: Джавадок как дескрипшн не выводится
     */
//    @Test
    @Description(useJavaDoc = true)
    public void simpleTest7() {
        Assert.assertTrue(1 == 1);
    }

//    @Test
    @Description(value = "Тест проверяет эквивалентность единицы единице")
    public void simpleTest7_1() {
        Assert.assertTrue(1 == 1);
    }

    @Epic(value = "Математика")
    @Feature(value = "Простые математические операции")
    @Story(value = "Сложение")
//    @Test
    public void sumTest() {
        Steps.checkSummationStep(5, 4, 9);
    }

    @Epic(value = "Математика")
    @Feature(value = "Простые математические операции")
    @Story(value = "Вычитание")
//    @Test
    public void subTest() {
        Steps.checkSubtractionStep(8, 2, 6);
    }

    @Epics(value = {@Epic(value = "Математика"), @Epic(value = "Геометрия")})
    @Features(value = {@Feature(value = "Тригонометрия"), @Feature(value = "Простые математические операции")})
    @Stories(value = {@Story(value = "Синус"), @Story(value = "Синусоида")})
//    @Test
    public void checkSinTest() {
        Steps.checkSinStep(0, 0);
    }

    //FIXME: Не помечается бомбочкой
    @Flaky
//    @Test
    public void simpleTest14() {
        Assert.assertTrue(1 == 2);
    }

    @Test
    @Issue(value = "FGY-4627")
    public void simpleTest15() {
        Assert.assertTrue(1 == 1);
    }

    @Test
    @TmsLink(value = "TL-678")
    public void simpleTest18() {
        Assert.assertTrue(1 == 1);
    }

//    @Test
    @Link(name = "Ссылка", url = "http://sberbank.ru")
    public void simpleTest16() {
        Assert.assertTrue(1 == 1);
    }

//    @Test
    @Links(value = {@Link(name = "Ссылка1", url = "http://sberbank.ru"),
            @Link(name = "Ссылка2", url = "http://yandex.ru")})
    public void simpleTest17() {
        Assert.assertTrue(1 == 1);
    }

    //Демонстрация работы категорий. Product defects
//    @Test
    public void sumTestFailed() {
        //какие-то проверки, в результате которых тест может упасть
        Steps.checkSumStep(5, 6, 4);
    }

    //Демонстрация работы категорий. Test defects. traceRegex
//    @Test
    public void testFailedNullPointerException() {
        //какие-то проверки, которые могут вызывать NullPointerException
        throw new NullPointerException();
    }

    //Демонстрация работы категорий. Test defects. messageRegex
//    @Test
    public void testFailedException() throws Exception {
        //какие-то проверки, которые могут вызывать Exception
        throw new Exception("что-то пошло не так");
    }


}
