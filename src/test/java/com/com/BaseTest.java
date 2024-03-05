package com.com;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

abstract public class BaseTest {  // основа для всех тестовых классов в будущем
    @BeforeEach   // метод до начала теста
    public void init() {
        setUp();
    }

    public void setUp() {  // ТУТ просто настройки браузера

        Configuration.browserSize = "2560x1440";
//        Configuration.headless = true; //это виртуальный экран, не будем видеть его

    }

    @AfterEach // метод после начала теста
    public void tearDown() {
        Selenide.closeWebDriver();
    }


}
