package com.test.visitor.pattern.Domains;

import com.test.visitor.pattern.Domains.core.FruitBase;
import com.test.visitor.pattern.FruitsVisitor;

public class Orange extends FruitBase {

    public void accept(FruitsVisitor fruitsVisitor) {
        fruitsVisitor.visit(this);
    }

    private Orange(Double price, int quantity) {
        super(price,quantity);
    }

    public static Orange buyOrange(Double price, int quantity) {
        return new Orange(price, quantity);
    }
}
