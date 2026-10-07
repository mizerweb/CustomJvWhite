package com.facebook.common.util;

/* JADX INFO: loaded from: classes2.dex */
public class ExceptionWithNoStacktrace extends Exception {
    public ExceptionWithNoStacktrace(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
