package com.com;

import org.junit.jupiter.api.Test;

public class AppleTest extends BaseTest {   // наследуемся
    private static final String BASE_URL = "https://appleinsider.ru/";  // доступ только в классе, static - она всегда есть, неизменная константа, не можем изменить её
    private static final String SEARCH_STRING = "чем отличается iPhone 12 от 13";

    @Test // это основной тест, вместо main, тут основная логика
    public void checkHref(){
        MainPage mainPage = new MainPage(BASE_URL);
        mainPage.search(SEARCH_STRING);
        int a;
    }

}
