package com.test.visitor.pattern.Domains;

import com.test.visitor.pattern.Domains.core.FruitBase;
import com.test.visitor.pattern.FruitsVisitor;

/**
 * domain object.
 * its a value object
 */
public class Apple extends FruitBase {

    /**
     * method called to scan fruits, every scanned fruit will call visitor
     * to apply a discount
     * @param fruitsVisitor
     */
    public void accept(FruitsVisitor fruitsVisitor) {
        fruitsVisitor.visit(this);
    }

    private Apple() {
        super();
    }

    private Apple(Double price, int quantity) {
        super(price, quantity);
    }

    public static Apple buyApple(Double price, int quantity) {
        return new Apple(price, quantity);
    }

}
