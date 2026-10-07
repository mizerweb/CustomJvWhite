package defpackage;

import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class kk2 {
    public final nk2 a;

    public kk2(nk2 nk2Var) {
        this.a = nk2Var;
    }

    public final boolean a() {
        return this.a.y();
    }

    public final void b(og7 og7Var) {
        nk2 nk2Var = this.a;
        synchronized (nk2Var.a) {
            try {
                nk2Var.A();
                lk2 lk2Var = new lk2(nk2Var, og7Var);
                if (nk2Var.d) {
                    lk2Var.l();
                } else {
                    nk2Var.b.add(lk2Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        Locale locale = Locale.US;
        return kk2.class.getName() + "@" + Integer.toHexString(hashCode()) + "[cancellationRequested=" + Boolean.toString(this.a.y()) + "]";
    }
}
