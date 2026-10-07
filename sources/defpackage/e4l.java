package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes2.dex */
public interface e4l<V> extends Future<V> {
    void a(Runnable runnable, Executor executor);
}
