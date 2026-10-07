package defpackage;

import java.io.Closeable;

/* JADX INFO: loaded from: classes4.dex */
public final class yj implements Closeable {
    public final int a;
    public final au3 b;

    public yj(int i, au3 au3Var) {
        this.a = i;
        this.b = au3Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }
}
