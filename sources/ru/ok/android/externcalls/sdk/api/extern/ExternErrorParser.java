package ru.ok.android.externcalls.sdk.api.extern;

import defpackage.j95;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.api.core.ApiInvocationException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0002\u000b\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u001a\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¨\u0006\r"}, d2 = {"Lru/ok/android/externcalls/sdk/api/extern/ExternErrorParser;", "", "<init>", "()V", "parse", "Lru/ok/android/externcalls/sdk/api/extern/ExternErrorParser$ErrorDescription;", "exception", "Lru/ok/android/api/core/ApiInvocationException;", "parseError", "", "key", "ErrorDescription", "Companion", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ExternErrorParser {
    private static final String CODE_KEY = "code";
    private static final Companion Companion = new Companion(null);
    private static final String EXTENDED_CODE_KEY = "extended_code";

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ok/android/externcalls/sdk/api/extern/ExternErrorParser$ErrorDescription;", "", "errorCode", "", "<init>", "(Ljava/lang/String;)V", "getErrorCode", "()Ljava/lang/String;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ErrorDescription {
        private final String errorCode;

        public ErrorDescription(String str) {
            this.errorCode = str;
        }

        public final String getErrorCode() {
            return this.errorCode;
        }
    }

    private final String parseError(ApiInvocationException exception, String key) {
        try {
            String errorCustomJson = exception.getErrorCustomJson();
            if (errorCustomJson == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(errorCustomJson);
            if (jSONObject.has(key)) {
                return jSONObject.optString(key);
            }
            return null;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final ErrorDescription parse(ApiInvocationException exception) {
        String error = parseError(exception, CODE_KEY);
        if (error == null) {
            error = parseError(exception, EXTENDED_CODE_KEY);
        }
        return new ErrorDescription(error);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ok/android/externcalls/sdk/api/extern/ExternErrorParser$Companion;", "", "<init>", "()V", "EXTENDED_CODE_KEY", "", "CODE_KEY", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j95 j95Var) {
            this();
        }

        private Companion() {
        }
    }
}
