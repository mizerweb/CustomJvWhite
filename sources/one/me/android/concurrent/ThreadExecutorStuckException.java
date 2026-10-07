package one.me.android.concurrent;

import defpackage.mcj;
import defpackage.yd6;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001f\b\u0016\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/android/concurrent/ThreadExecutorStuckException;", "Lone/me/android/concurrent/ThreadExecutorException;", "Lmcj;", "task", "Lyd6;", "timeProvider", "<init>", "(Lmcj;Lyd6;)V", "", "tasks", "(Ljava/lang/Iterable;Lyd6;)V", "oneme"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ThreadExecutorStuckException extends ThreadExecutorException {
    public ThreadExecutorStuckException(mcj mcjVar, yd6 yd6Var) {
        super(mcjVar, yd6Var);
    }

    public ThreadExecutorStuckException(Iterable<mcj> iterable, yd6 yd6Var) {
        super(iterable, yd6Var);
    }
}
