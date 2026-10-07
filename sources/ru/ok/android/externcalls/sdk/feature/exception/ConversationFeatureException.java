package ru.ok.android.externcalls.sdk.feature.exception;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0003\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0003\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ok/android/externcalls/sdk/feature/exception/ConversationFeatureException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "<init>", "()V", "message", "", "(Ljava/lang/String;)V", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "(Ljava/lang/Throwable;)V", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ConversationFeatureException extends RuntimeException {
    public ConversationFeatureException() {
    }

    public ConversationFeatureException(String str) {
        super(str);
    }

    public ConversationFeatureException(String str, Throwable th) {
        super(str, th);
    }

    public ConversationFeatureException(Throwable th) {
        super(th);
    }
}
