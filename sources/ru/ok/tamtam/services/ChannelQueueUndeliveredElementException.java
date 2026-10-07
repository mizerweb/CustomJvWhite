package ru.ok.tamtam.services;

import defpackage.c0a;
import defpackage.j95;
import kotlin.Metadata;
import ru.ok.tamtam.exception.IssueKeyException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ok/tamtam/services/ChannelQueueUndeliveredElementException;", "Lru/ok/tamtam/exception/IssueKeyException;", "element", "", "cause", "", "<init>", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "tamtam-android-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ChannelQueueUndeliveredElementException extends IssueKeyException {
    public ChannelQueueUndeliveredElementException(Object obj, Throwable th) {
        super("ONEME-36811", c0a.n(obj, "undelivered element="), th);
    }

    public /* synthetic */ ChannelQueueUndeliveredElementException(Object obj, Throwable th, int i, j95 j95Var) {
        this(obj, (i & 2) != 0 ? null : th);
    }
}
