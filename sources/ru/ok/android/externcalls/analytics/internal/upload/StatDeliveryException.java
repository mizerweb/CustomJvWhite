package ru.ok.android.externcalls.analytics.internal.upload;

import defpackage.c0a;
import defpackage.j95;
import defpackage.qv1;
import kotlin.Metadata;
import ru.ok.android.api.core.ApiInvocationException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/upload/StatDeliveryException;", "", "apiMethod", "", "cause", "Lru/ok/android/api/core/ApiInvocationException;", "<init>", "(Ljava/lang/String;Lru/ok/android/api/core/ApiInvocationException;)V", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "(Ljava/lang/Throwable;)V", "Companion", "calls-sdk-analytics"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class StatDeliveryException extends Throwable {
    private static final Companion Companion = new Companion(null);

    public StatDeliveryException(String str, ApiInvocationException apiInvocationException) {
        super(Companion.getApiInvocationErrorMessage(str, apiInvocationException), apiInvocationException);
    }

    public static final String getApiInvocationErrorMessage(String str, ApiInvocationException apiInvocationException) {
        return Companion.getApiInvocationErrorMessage(str, apiInvocationException);
    }

    public static final String getErrorMessage(String str, Throwable th) {
        return Companion.getErrorMessage(str, th);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\nH\u0007¨\u0006\u000b"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/upload/StatDeliveryException$Companion;", "", "<init>", "()V", "getApiInvocationErrorMessage", "", "apiMethod", "error", "Lru/ok/android/api/core/ApiInvocationException;", "getErrorMessage", "", "calls-sdk-analytics"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j95 j95Var) {
            this();
        }

        public final String getApiInvocationErrorMessage(String apiMethod, ApiInvocationException error) {
            int errorCode = error.getErrorCode();
            String errorMessage = error.getErrorMessage();
            StringBuilder sbR = c0a.r(errorCode, "Error executing API method ", apiMethod, ": code=", ", message=");
            sbR.append(errorMessage);
            return sbR.toString();
        }

        public final String getErrorMessage(String apiMethod, Throwable error) {
            return qv1.l("Error executing API method ", apiMethod, ": ", error.getMessage());
        }

        private Companion() {
        }
    }

    public StatDeliveryException(String str, Throwable th) {
        super(Companion.getErrorMessage(str, th), th);
    }

    public StatDeliveryException(Throwable th) {
        super(th);
    }
}
