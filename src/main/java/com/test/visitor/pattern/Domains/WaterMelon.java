package com.test.visitor.pattern.Domains;

import com.test.visitor.pattern.Domains.core.FruitBase;
import com.test.visitor.pattern.FruitsVisitor;

public class WaterMelon extends FruitBase {


    public void accept(FruitsVisitor fruitsVisitor) {
        fruitsVisitor.visit(this);
    }

    private WaterMelon() {
    }

    private WaterMelon(Double price, int quantity) {
       super(price, quantity);
    }

    public static WaterMelon buyWaterMelon(Double price, int quantity){
        return new WaterMelon(price, quantity);
    }
}
