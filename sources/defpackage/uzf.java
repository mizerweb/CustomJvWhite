package defpackage;

import android.media.Image;

/* JADX INFO: loaded from: classes4.dex */
public final class uzf implements pjc {
    public final pjc a;
    public final xtj b;
    public final b40 c = gvk.a(false);

    public uzf(pjc pjcVar, xtj xtjVar) {
        this.a = pjcVar;
        this.b = xtjVar;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0009  */
    public final uzf R0() {
        int i;
        int i2;
        uzf uzfVar;
        if (this.c.b()) {
            uzfVar = null;
        } else {
            xtj xtjVar = this.b;
            g40 g40Var = (g40) xtjVar.c;
            do {
                i = g40Var.a;
                i2 = i == 0 ? 0 : i + 1;
            } while (!g40.b.compareAndSet(g40Var, i, i2));
            if ((i2 != 0 ? (pjc) xtjVar.b : null) != null) {
                uzfVar = new uzf(this.a, this.b);
            } else {
                uzfVar = null;
            }
        }
        if (uzfVar != null) {
            return uzfVar;
        }
        ore.k("Required value was null.");
        return null;
    }

    @Override // defpackage.ndi
    public final Object W(sr3 sr3Var) {
        if (this.c.b()) {
            return null;
        }
        if (sr3Var.equals(zfe.a(uzf.class)) || sr3Var.equals(zfe.a(pjc.class)) || sr3Var.equals(zfe.a(a88.class))) {
            return this;
        }
        if (!sr3Var.equals(zfe.a(Image.class))) {
            return this.a.W(sr3Var);
        }
        throw new UnsupportedOperationException("Cannot unwrap " + this + " as android.media.Image. Use setFinalizerinstead and close all outstanding references.");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.c.a()) {
            xtj xtjVar = this.b;
            g40 g40Var = (g40) xtjVar.c;
            g40Var.getClass();
            if (g40.b.decrementAndGet(g40Var) == 0) {
                i40 i40Var = (i40) xtjVar.d;
                i40Var.getClass();
                ((du3) i40.b.getAndSet(i40Var, null)).a((pjc) xtjVar.b);
            }
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}
