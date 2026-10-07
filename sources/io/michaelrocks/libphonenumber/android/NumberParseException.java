package io.michaelrocks.libphonenumber.android;

import defpackage.r5a;

/* JADX INFO: loaded from: classes.dex */
public class NumberParseException extends Exception {
    public final int a;
    public final String b;

    public NumberParseException(int i, String str) {
        super(str);
        this.b = str;
        this.a = i;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "Error type: " + r5a.k(this.a) + ". " + this.b;
    }
}
