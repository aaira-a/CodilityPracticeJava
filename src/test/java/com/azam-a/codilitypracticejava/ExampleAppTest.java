package com.azam_a.codilitypracticejava;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ExampleAppTest {

    @Test
    void add1to2() {
        int actual = new ExampleApp().add(1, 2);
        assertEquals(3, actual);
    }
}
