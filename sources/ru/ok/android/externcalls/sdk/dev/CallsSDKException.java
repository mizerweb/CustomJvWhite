package ru.ok.android.externcalls.sdk.dev;

import defpackage.j95;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ok/android/externcalls/sdk/dev/CallsSDKException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "message", "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CallsSDKException extends RuntimeException {
    public /* synthetic */ CallsSDKException(String str, Throwable th, int i, j95 j95Var) {
        this(str, (i & 2) != 0 ? null : th);
    }

    public CallsSDKException(String str, Throwable th) {
        super(str, th);
    }
}
