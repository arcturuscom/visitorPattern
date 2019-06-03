package com.test.visitor.pattern;

import com.test.visitor.pattern.Domains.Apple;
import com.test.visitor.pattern.Domains.Orange;
import com.test.visitor.pattern.Domains.WaterMelon;

/**
 * a fruits visitor impl class.
 */
public class FruitsVisitorImpl implements FruitsVisitor {

    public void visit(WaterMelon waterMelon) {
        Double total = (Math.floorMod(waterMelon.getQuantity(), 3) + Math.floorDiv(waterMelon.getQuantity(), 3)*2)* waterMelon.getPrice();
        System.out.println("WaterMelom | "+waterMelon.getQuantity()+" | "+total);
    }

    public void visit(Apple apple) {
        System.out.println("Apple | "+apple.getQuantity()+" | "+(Math.floorMod(apple.getQuantity(),2)+Math.floorDiv(apple.getQuantity(),2))*apple.getPrice());
    }

    public void visit(Orange orange) {
        System.out.println("orange | "+ orange.getQuantity()+ " | "+orange.getQuantity()*orange.getPrice());
    }

}
