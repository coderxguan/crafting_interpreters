package com.craftinginterpreters.lox;

/**
 * 功能:
 * 作者:
 * 日期:2024/09/19 15:43
 */
public class RuntimeError extends RuntimeException {
    final Token token;

    RuntimeError(Token token, String message, boolean a, boolean b) {
        super(message);
        this.token = token;
    }
}
