package defpackage;

import java.io.Closeable;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class b15 implements Closeable {
    public Provider a;
    public yv4 b;
    public Provider c;
    public wc6 d;
    public Provider e;
    public Provider f;
    public Provider g;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((uxe) this.f.get()).close();
    }
}
