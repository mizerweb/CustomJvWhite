package com.google.mlkit.common;

import defpackage.yab;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
public class MlKitException extends Exception {
    public static final int A = 204;
    public static final int B = 205;
    public static final int C = 206;
    public static final int D = 207;
    public static final int E = 300;
    public static final int F = 301;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    public static final int g = 6;
    public static final int h = 7;
    public static final int i = 8;
    public static final int j = 9;
    public static final int k = 10;
    public static final int l = 11;
    public static final int m = 12;
    public static final int n = 13;
    public static final int o = 14;
    public static final int p = 15;
    public static final int q = 16;
    public static final int r = 17;
    public static final int s = 18;
    public static final int t = 100;
    public static final int u = 101;
    public static final int v = 102;
    public static final int w = 200;
    public static final int x = 201;
    public static final int y = 202;
    public static final int z = 203;
    private final int a;

    @Retention(RetentionPolicy.CLASS)
    public @interface a {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MlKitException(String str, int i2) {
        super(str);
        yab.q(str, "Provided message must not be empty.");
        this.a = i2;
    }

    public int a() {
        return this.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MlKitException(String str, int i2, Throwable th) {
        super(str, th);
        yab.q(str, "Provided message must not be empty.");
        this.a = i2;
    }
}
