package com.test.visitor.pattern;

import com.test.visitor.pattern.Domains.Apple;
import com.test.visitor.pattern.Domains.Orange;
import com.test.visitor.pattern.Domains.WaterMelon;
import com.test.visitor.pattern.Domains.core.Fruits;

import java.util.Arrays;
import java.util.List;

/**
 * note that solutin i choosed based on visitor design pattern
 * that's very common solution for e-commerce panel.
 * also, i used some DDD basics (Domains, core demains, private constructor, no setters ...)
 */
public class Main {

    public static void main(String[] args) {
        //buy 4 apples with 0.2 price
        Apple apple = Apple.buyApple(0.2,4);
        // buy 3 oranges with 3
        Orange orange = Orange.buyOrange(0.5,3);
        // buy 5 watermelon with 0.8 as price
        WaterMelon waterMelon = WaterMelon.buyWaterMelon(0.8, 5);
        FruitsVisitorImpl fruitsVisitor = new FruitsVisitorImpl();
        List<Fruits> fruits = Arrays.asList(new Fruits[]{apple, orange, waterMelon});
        System.out.println("item | quantity | price");
        fruits.forEach(fruit -> fruit.accept(fruitsVisitor));
    }
}
