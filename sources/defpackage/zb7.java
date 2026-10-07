package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class zb7 implements AutoCloseable {
    public final Object a = new Object();
    public final zv b = new zv();
    public boolean c;

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.a) {
            if (this.c) {
                return;
            }
            this.c = true;
            Iterator<E> it = this.b.iterator();
            if (it.hasNext()) {
                throw qt4.h(it);
            }
            this.b.clear();
        }
    }

    public final void l() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return;
                }
                Iterator it = this.b.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
