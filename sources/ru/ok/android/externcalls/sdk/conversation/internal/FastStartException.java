package ru.ok.android.externcalls.sdk.conversation.internal;

import kotlin.Metadata;
import ru.ok.android.api.core.ApiInvocationException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ok/android/externcalls/sdk/conversation/internal/FastStartException;", "Lru/ok/android/api/core/ApiInvocationException;", "code", "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FastStartException extends ApiInvocationException {
    private final Throwable cause;

    /* JADX WARN: Illegal instructions before constructor call */
    public FastStartException(String str, Throwable th) {
        if (str == null) {
            str = null;
            String message = th != null ? th.getMessage() : null;
            if (message != null) {
                str = message;
            } else if (th != null) {
                str = th.getClass().getName();
            }
        }
        super(1, str);
        this.cause = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }
}
