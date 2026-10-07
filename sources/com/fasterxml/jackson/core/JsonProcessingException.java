package com.fasterxml.jackson.core;

import defpackage.xt8;

/* JADX INFO: loaded from: classes2.dex */
public class JsonProcessingException extends JacksonException {
    public final xt8 a;

    public JsonProcessingException(String str, xt8 xt8Var, NumberFormatException numberFormatException) {
        super(str, numberFormatException);
        this.a = xt8Var;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        if (message == null) {
            message = "N/A";
        }
        xt8 xt8Var = this.a;
        if (xt8Var == null) {
            return message;
        }
        StringBuilder sb = new StringBuilder(100);
        sb.append(message);
        if (xt8Var != null) {
            sb.append("\n at ");
            sb.append(xt8Var.toString());
        }
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return getClass().getName() + ": " + getMessage();
    }
}
