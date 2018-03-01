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
     * //FIXME: Джавадок как дескрипшн не выводится
     */
//    @Test
    @Description(useJavaDoc = true)
    public void simpleTest7() {
        Assert.assertTrue(1 == 1);
    }

    @Epic(value = "Новый эпик1")
//    @Test
    public void simpleTest8() {
        Assert.assertTrue(1 == 1);
    }

    @Epic(value = "Новый эпик2")
//    @Test
    public void simpleTest9() {
        Assert.assertTrue(1 == 1);
    }

    @Epics(value = {@Epic(value = "Новый эпик1"), @Epic(value = "Новый эпик2")})
//    @Test
    public void simpleTest10() {
        Assert.assertTrue(1 == 1);
    }

    @Feature(value = "Новая фича1")
//    @Test
    public void simpleTest11() {
        Assert.assertTrue(1 == 1);
    }

    @Feature(value = "Новая фича2")
//    @Test
    public void simpleTest12() {
        Assert.assertTrue(1 == 1);
    }

    @Features(value = {@Feature(value = "Новая фича1"), @Feature(value = "Новая фича2")})
//    @Test
    public void simpleTest13() {
        Assert.assertTrue(1 == 1);
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
}
