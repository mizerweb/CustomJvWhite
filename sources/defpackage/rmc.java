package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class rmc implements y99 {
    public final long a = t99.g.getAndIncrement();
    public final a35 b;
    public final int c;
    public final lkg d;
    public final qmc e;
    public volatile Object f;

    public rmc(u25 u25Var, a35 a35Var, int i, qmc qmcVar) {
        this.d = new lkg(u25Var);
        this.b = a35Var;
        this.c = i;
        this.e = qmcVar;
    }

    @Override // defpackage.y99
    public final void load() {
        this.d.b = 0L;
        x25 x25Var = new x25(this.d, this.b);
        try {
            x25Var.l();
            Uri uri = this.d.a.getUri();
            uri.getClass();
            this.f = this.e.n(uri, x25Var);
        } finally {
            vqi.h(x25Var);
        }
    }

    @Override // defpackage.y99
    public final void z() {
    }
}
