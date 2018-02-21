package com.github.dmtest;

import org.junit.Assert;
import org.junit.Test;

public class TestClass {

    /**
     * Простой тест
     */
    @Test
    public void simpleTest1() {
        Assert.assertTrue("Данное сообщение никогда не будет выведено", 3 + 2 == 5);
    }
}
