package org.ezrawilliams.simplecomponentexample.component;

import org.springframework.stereotype.Component;

@Component
public class MathComponent {
    public int add(int x, int y) {
        return x + y;
    }
}

