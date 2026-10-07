package ru.ok.android.api.core;

import defpackage.ip;
import defpackage.nbh;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0015J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\u0004R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000b\u001a\u0004\b\u000e\u0010\u0004R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\u0004R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0012\u0010\u0004R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0014\u0010\u0004R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ok/android/api/core/ApiInvocationException;", "Lru/ok/android/api/core/ApiException;", "", "toString", "()Ljava/lang/String;", "", "errorCode", "I", "getErrorCode", "()I", "errorMessage", "Ljava/lang/String;", "getErrorMessage", "errorField", "getErrorField", "errorData", "getErrorData", "errorCustomKey", "getErrorCustomKey", "errorCustomJson", "getErrorCustomJson", "Lip;", "errorPage", "Lip;", "getErrorPage", "()Lip;", "odnoklassniki-android-api_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class ApiInvocationException extends ApiException {
    private final int errorCode;
    private final String errorCustomJson;
    private final String errorCustomKey;
    private final String errorData;
    private final String errorField;
    private final String errorMessage;
    private final ip errorPage;

    public ApiInvocationException(int i, String str, String str2, String str3, String str4, String str5, ip ipVar) {
        super(i + " " + str);
        this.errorCode = i;
        this.errorMessage = str;
        this.errorField = str2;
        this.errorData = str3;
        this.errorCustomKey = str4;
        this.errorCustomJson = str5;
        this.errorPage = ipVar;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorCustomJson() {
        return this.errorCustomJson;
    }

    public final String getErrorCustomKey() {
        return this.errorCustomKey;
    }

    public final String getErrorData() {
        return this.errorData;
    }

    public final String getErrorField() {
        return this.errorField;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final ip getErrorPage() {
        return this.errorPage;
    }

    @Override // java.lang.Throwable
    public String toString() {
        int i = this.errorCode;
        String str = this.errorMessage;
        String str2 = this.errorField;
        String str3 = this.errorData;
        String str4 = this.errorCustomJson;
        String str5 = this.errorCustomKey;
        StringBuilder sbA = nbh.A(i, "ApiInvocationException{errorCode=", ", errorMessage='", str, "', errorField='");
        nbh.G(sbA, str2, "', errorData='", str3, "', errorCustomData=");
        return nbh.y(sbA, str4, ", errorCustomKey='", str5, "'}");
    }

    public ApiInvocationException(int i, String str) {
        this(i, str, null, null, null, null, null);
    }
}
