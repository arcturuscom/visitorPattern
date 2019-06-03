package com.test.visitor.pattern;

import com.test.visitor.pattern.Domains.Apple;
import com.test.visitor.pattern.Domains.Orange;
import com.test.visitor.pattern.Domains.WaterMelon;

public interface FruitsVisitor {
    void visit(WaterMelon waterMelon);
    void visit(Apple apple);
    void visit(Orange orange);
}
