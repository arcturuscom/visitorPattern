package com.test.visitor.pattern.Domains.core;

import com.test.visitor.pattern.FruitsVisitor;

public interface Fruits {
    void accept(FruitsVisitor fruitsVisitor);
}
