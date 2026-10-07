package ru.ok.android.api.session;

import defpackage.nbh;
import defpackage.qv1;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import ru.ok.android.api.core.ApiInvocationException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ok/android/api/session/ApiSessionChangedException;", "Lru/ok/android/api/core/ApiInvocationException;", "odnoklassniki-android-api_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ApiSessionChangedException extends ApiInvocationException {
    public final String a;
    public final String b;

    public ApiSessionChangedException(String str, String str2, String str3) {
        super(107, str);
        this.a = str2;
        this.b = str3;
    }

    @Override // ru.ok.android.api.core.ApiInvocationException, java.lang.Throwable
    public final String toString() {
        String str = String.format(Locale.US, "0x%08x", Arrays.copyOf(new Object[]{Integer.valueOf(this.b.hashCode())}, 1));
        int errorCode = getErrorCode();
        String errorMessage = getErrorMessage();
        String errorField = getErrorField();
        String errorData = getErrorData();
        String errorCustomJson = getErrorCustomJson();
        String errorCustomKey = getErrorCustomKey();
        StringBuilder sbQ = qv1.q("ApiSessionChangedException{sessionKey=", this.a, "sessionSecret='", str, "', errorCode=");
        sbQ.append(errorCode);
        sbQ.append(", errorMessage='");
        sbQ.append(errorMessage);
        sbQ.append("', errorField='");
        nbh.G(sbQ, errorField, "', errorData='", errorData, "', errorCustomData=");
        return nbh.y(sbQ, errorCustomJson, ", errorCustomKey='", errorCustomKey, "'}");
    }
}
