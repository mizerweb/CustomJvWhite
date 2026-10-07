package ru.ok.android.api.json;

import defpackage.a05;

/* JADX INFO: loaded from: classes3.dex */
public final class JsonTypeMismatchException extends JsonParseException {
    public JsonTypeMismatchException(int i, int i2) {
        super("Expected " + a05.i(i) + " was " + a05.i(i2));
    }
}
