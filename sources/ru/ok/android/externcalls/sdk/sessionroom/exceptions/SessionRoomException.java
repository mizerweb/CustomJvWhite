package ru.ok.android.externcalls.sdk.sessionroom.exceptions;

import defpackage.j95;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002B!\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ok/android/externcalls/sdk/sessionroom/exceptions/SessionRoomException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "message", "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getMessage", "()Ljava/lang/String;", "getCause", "()Ljava/lang/Throwable;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class SessionRoomException extends RuntimeException {
    private final Throwable cause;
    private final String message;

    public /* synthetic */ SessionRoomException(String str, Throwable th, int i, j95 j95Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public SessionRoomException(String str) {
        this(str, null, 2, 0 == true ? 1 : 0);
    }

    public SessionRoomException(String str, Throwable th) {
        super(str, th);
        this.message = str;
        this.cause = th;
    }

    public SessionRoomException() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
