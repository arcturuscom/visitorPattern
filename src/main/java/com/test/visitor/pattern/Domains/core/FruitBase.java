package com.test.visitor.pattern.Domains.core;

import com.test.visitor.pattern.FruitsVisitor;

import java.util.Objects;

/**
 * core domain FruitBase, abstract class handling the base & common logic
 * of fruits
 */
public abstract class FruitBase implements Fruits {
    protected Double price;
    protected int quantity = 1;

    protected FruitBase(Double price, int quantity) {
        Objects.requireNonNull(price);
        Objects.requireNonNull(quantity);
        checkPriceNotNegatif(price);
        checkQuantityNotNegatif(quantity);
        this.price = price;
        this.quantity = quantity;
        this.price = price;
        this.quantity = quantity;
    }

    protected FruitBase() {
    }

    @Override
    public abstract void accept(FruitsVisitor fruitsVisitor);

    public void checkPriceNotNegatif(Double price) {
        if(price<0) throw new RuntimeException("price shouldn't be negatif");
    }

    public void checkQuantityNotNegatif(int quantity) {
        if(quantity<0) throw new RuntimeException("quantity shouldn't be negatif");
    }

    public Double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
