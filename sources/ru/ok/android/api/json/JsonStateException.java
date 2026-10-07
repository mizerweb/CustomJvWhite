package ru.ok.android.api.json;

import defpackage.a05;

/* JADX INFO: loaded from: classes3.dex */
public final class JsonStateException extends IllegalStateException {
    public static JsonStateException a(int i) {
        return new JsonStateException("Expected " + a05.i(93) + " was " + a05.i(i));
    }

    public static JsonStateException b(int i) {
        return new JsonStateException("Expected " + a05.i(125) + " was " + a05.i(i));
    }

    public static JsonStateException c(int i) {
        return new JsonStateException("Expected " + a05.i(39) + " was " + a05.i(i));
    }

    public static JsonStateException d(int i) {
        return new JsonStateException("Expected value was ".concat(a05.i(i)));
    }
}
