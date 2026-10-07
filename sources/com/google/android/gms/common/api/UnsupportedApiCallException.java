package com.google.android.gms.common.api;

import defpackage.do6;

/* JADX INFO: loaded from: classes3.dex */
public final class UnsupportedApiCallException extends UnsupportedOperationException {
    public final do6 a;

    public UnsupportedApiCallException(do6 do6Var) {
        this.a = do6Var;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.a));
    }
}
