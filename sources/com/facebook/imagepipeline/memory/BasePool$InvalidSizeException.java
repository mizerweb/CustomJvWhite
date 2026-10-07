package com.facebook.imagepipeline.memory;

/* JADX INFO: loaded from: classes2.dex */
public class BasePool$InvalidSizeException extends RuntimeException {
    public BasePool$InvalidSizeException(Integer num) {
        super("Invalid size: " + num.toString());
    }
}
