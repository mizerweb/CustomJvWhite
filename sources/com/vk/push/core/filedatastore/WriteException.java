package com.vk.push.core.filedatastore;

import defpackage.j95;
import java.io.IOException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/vk/push/core/filedatastore/WriteException;", "Ljava/io/IOException;", "", "cause", "", "message", "<init>", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "a", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "b", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class WriteException extends IOException {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final Throwable cause;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String message;

    public /* synthetic */ WriteException(Throwable th, String str, int i, j95 j95Var) {
        this(th, (i & 2) != 0 ? "Write failed" : str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public WriteException(Throwable th, String str) {
        super(str, th);
        this.cause = th;
        this.message = str;
    }
}
