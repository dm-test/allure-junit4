package com.github.dmtest.tests;

import com.github.dmtest.steps.Steps;
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

    @Test
    public void simpleTest4() throws IOException {
        String darkSouls = "Dark souls 3";
        Steps.checkStringEquals(darkSouls, darkSouls);
    }
}
