package com.craftinginterpreters.lox;

public class Return extends RuntimeError{
    final Object value;

    Return(Object value) {
        super(null, null, false, false);
        this.value = value;
    }
}
