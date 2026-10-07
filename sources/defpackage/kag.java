package defpackage;

import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: loaded from: classes.dex */
public interface kag extends Closeable, Flushable {
    void X(long j, l31 l31Var);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    xsh m();
}
