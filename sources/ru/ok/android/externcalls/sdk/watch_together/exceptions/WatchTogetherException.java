package ru.ok.android.externcalls.sdk.watch_together.exceptions;

import defpackage.j95;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.watch_together.WatchTogetherError;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\u0018\u00002\u00060\u0001j\u0002`\u0002B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ok/android/externcalls/sdk/watch_together/exceptions/WatchTogetherException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "reason", "Lru/ok/android/externcalls/sdk/watch_together/WatchTogetherError;", "message", "", "cause", "", "<init>", "(Lru/ok/android/externcalls/sdk/watch_together/WatchTogetherError;Ljava/lang/String;Ljava/lang/Throwable;)V", "getReason", "()Lru/ok/android/externcalls/sdk/watch_together/WatchTogetherError;", "getMessage", "()Ljava/lang/String;", "getCause", "()Ljava/lang/Throwable;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class WatchTogetherException extends RuntimeException {
    private final Throwable cause;
    private final String message;
    private final WatchTogetherError reason;

    public /* synthetic */ WatchTogetherException(WatchTogetherError watchTogetherError, String str, Throwable th, int i, j95 j95Var) {
        this(watchTogetherError, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : th);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public final WatchTogetherError getReason() {
        return this.reason;
    }

    public WatchTogetherException(WatchTogetherError watchTogetherError, String str) {
        this(watchTogetherError, str, null, 4, null);
    }

    public WatchTogetherException(WatchTogetherError watchTogetherError, String str, Throwable th) {
        super(str, th);
        this.reason = watchTogetherError;
        this.message = str;
        this.cause = th;
    }

    public WatchTogetherException(WatchTogetherError watchTogetherError) {
        this(watchTogetherError, null, null, 6, null);
    }
}
