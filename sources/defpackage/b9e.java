package defpackage;

import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public final class b9e implements Closeable {
    public final y41 a;
    public final x41 b;
    public final /* synthetic */ yf2 c;

    public b9e(y41 y41Var, x41 x41Var, yf2 yf2Var) {
        this.c = yf2Var;
        this.a = y41Var;
        this.b = x41Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.a(true, true, null);
    }
}
