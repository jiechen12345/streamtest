package com.example.stream_demo;

import com.example.data.entity.Apple;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class StreamDemoApplicationTests {
    private static final Logger LOGGER = LoggerFactory.getLogger(StreamDemoApplicationTests.class);
    private static List<Apple> appleStore = new ArrayList<>();

    static {
        appleStore.add(new Apple("red", new BigDecimal(500), new BigDecimal(15), "台北"));
        appleStore.add(new Apple("green", new BigDecimal(500), new BigDecimal(11), "台中"));
        appleStore.add(new Apple("yellow", new BigDecimal(400), new BigDecimal(8), "高雄"));
        appleStore.add(new Apple("red", new BigDecimal(600), new BigDecimal(10), "桃園"));
    }

    @Test
    public void getAllApple() {
        List a = appleStore.stream().map(apple -> apple).collect(Collectors.toList());
        LOGGER.info(a.toString());
        Assert.assertEquals(
                4,
                a.size()
        );
    }

    @Test
    public void getAppleOriginByColor() {
        List a = appleStore.stream().filter(apple -> apple.getColor().equals("red")).map(apple -> apple.getOrigin()).collect(Collectors.toList());
        LOGGER.info(a.toString());
    }

    @Test
    public void getAppleOriginStringByColor() {
       String a = appleStore.stream().filter(apple -> apple.getColor().equals("red")).map(apple -> apple.getOrigin())
               .collect(Collectors.joining("," , "(" ,")"));
        LOGGER.info(a.toString());
    }

}
