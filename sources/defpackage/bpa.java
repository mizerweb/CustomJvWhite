package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class bpa implements voa {
    public final dq4 a;
    public final t51 b;
    public final long c;
    public final mg5 d;
    public final long e;
    public final pzf f = e9i.b(0, 0, 7);
    public final ifh g;

    public bpa(dq4 dq4Var, t51 t51Var, long j, mg5 mg5Var, long j2) {
        this.a = dq4Var;
        this.b = t51Var;
        this.c = j;
        this.d = mg5Var;
        this.e = j2;
        t51Var.d(this);
        this.g = new ifh(new ww8(28, this));
    }

    @Override // defpackage.voa
    public final void a() {
        this.b.f(this);
    }

    @Override // defpackage.voa
    public final xx6 b() {
        return (xx6) this.g.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX WARN: Code duplicated, block: B:15:0x0030  */
    /* JADX WARN: Code duplicated, block: B:16:0x0038  */
    @l7h
    public final void onEvent(j3b j3bVar) {
        Object lgaVar;
        List list = j3bVar.e;
        if (j3bVar.b == this.c && j3bVar.f == this.d) {
            long j = j3bVar.c;
            lq4 lq4Var = null;
            if (j >= 0) {
                long j2 = j3bVar.d;
                if (j < j2) {
                    lgaVar = new mga(j, j2);
                } else if (list.isEmpty()) {
                    lgaVar = null;
                } else {
                    lgaVar = new lga(list);
                }
            } else if (list.isEmpty()) {
                lgaVar = new lga(list);
            } else {
                lgaVar = null;
            }
            if (lgaVar != null) {
                yab.i0(this.a, null, 0, new af8(this, lgaVar, lq4Var, 19), 3);
            }
        }
    }

    @l7h
    public final void onEvent(lfi lfiVar) {
        if (lfiVar.b != this.c) {
            return;
        }
        yab.i0(this.a, null, 0, new af8(this, new rga(ww3.X1(lfiVar.c)), (lq4) null, 19), 3);
    }

    @l7h
    public final void onEvent(sz5 sz5Var) {
        if (sz5Var.c != this.c) {
            return;
        }
        yab.i0(this.a, null, 0, new af8(this, pga.a, (lq4) null, 19), 3);
    }

    @l7h
    public final void onEvent(lc8 lc8Var) {
        if (lc8Var.b == this.c && lc8Var.e == this.d) {
            long j = this.e;
            yab.i0(this.a, null, 0, new af8(this, new iga(Collections.singleton(Long.valueOf(lc8Var.c)), j != 0 && lc8Var.g == j, true), (lq4) null, 19), 3);
        }
    }

    @l7h
    public final void onEvent(ajc ajcVar) {
        if (ajcVar.b == this.c && ajcVar.g == this.d) {
            yab.i0(this.a, null, 0, new af8(this, new iga(Collections.singleton(Long.valueOf(ajcVar.d)), true, false), (lq4) null, 19), 3);
        }
    }

    @l7h
    public final void onEvent(kfi kfiVar) {
        if (kfiVar.b != this.c) {
            return;
        }
        yab.i0(this.a, null, 0, new af8(this, new rga(Collections.singleton(Long.valueOf(kfiVar.c))), (lq4) null, 19), 3);
    }

    @l7h
    public final void onEvent(wo3 wo3Var) {
        if (wo3Var.b.contains(Long.valueOf(this.c)) && this.d == wo3Var.e) {
            yab.i0(this.a, null, 0, new af8(this, new jga(), (lq4) null, 19), 3);
        }
    }

    @l7h
    public final void onEvent(bg9 bg9Var) {
        yab.i0(this.a, null, 0, new af8(this, kga.a, (lq4) null, 19), 3);
    }
}
