package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class jh9 {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final AtomicBoolean e = new AtomicBoolean(false);

    public jh9(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.d = ny8Var4;
    }

    public final sgg a() {
        gm0.n(jh9.class.getName(), "execute " + Thread.currentThread());
        lq4 lq4Var = null;
        if (this.e.getAndSet(true)) {
            gm0.Y(jh9.class.getName(), "logout in process");
            return null;
        }
        ghb ghbVar = ew5.b;
        sgg sggVarI0 = yab.i0(cqk.D(cqk.D((ite) this.a.getValue(), ((w95) this.b.getValue()).a), zhb.b), null, 0, new h01(this, qe7.P(System.nanoTime(), lw5.NANOSECONDS), lq4Var, 4), 3);
        sggVarI0.Y(new nv4(29, this));
        return sggVarI0;
    }
}
