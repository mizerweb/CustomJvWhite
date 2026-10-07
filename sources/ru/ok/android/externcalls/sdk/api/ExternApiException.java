package ru.ok.android.externcalls.sdk.api;

import defpackage.qt4;
import ru.ok.android.api.core.ApiInvocationException;

/* JADX INFO: loaded from: classes3.dex */
public class ExternApiException extends RuntimeException {
    private final int errorCode;
    private final String extErrorCode;

    public ExternApiException(ApiInvocationException apiInvocationException, int i, String str) {
        super(apiInvocationException.getErrorMessage(), apiInvocationException);
        this.errorCode = i;
        this.extErrorCode = str;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getExtendedError() {
        return this.extErrorCode;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return qt4.p(new StringBuilder("ExternApiException{errorCode="), this.errorCode, '}');
    }
}
