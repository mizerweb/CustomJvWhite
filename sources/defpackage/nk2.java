package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class nk2 implements Closeable {
    public final Object a = new Object();
    public final ArrayList b = new ArrayList();
    public final ScheduledExecutorService c = wz0.d.b;
    public boolean d;
    public boolean e;

    public final void A() {
        if (this.e) {
            ore.k("Object already closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.a) {
            try {
                if (this.e) {
                    return;
                }
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    ((lk2) it.next()).close();
                }
                this.b.clear();
                this.e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final kk2 l() {
        kk2 kk2Var;
        synchronized (this.a) {
            A();
            kk2Var = new kk2(this);
        }
        return kk2Var;
    }

    public final String toString() {
        Locale locale = Locale.US;
        return nk2.class.getName() + "@" + Integer.toHexString(hashCode()) + "[cancellationRequested=" + Boolean.toString(y()) + "]";
    }

    public final boolean y() {
        boolean z;
        synchronized (this.a) {
            A();
            z = this.d;
        }
        return z;
    }
}
