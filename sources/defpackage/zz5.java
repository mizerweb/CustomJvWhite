package defpackage;

import android.graphics.RectF;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zz5 {
    public final gu4 a;
    public final mjg b;
    public final mjg c;
    public final pzf d;
    public final pzf e;
    public final AtomicLong f;
    public final AtomicLong g;
    public final xx6 h;
    public final ny8 i;
    public final ny8 j;
    public final mjg k;
    public final mjg l;
    public c06 m;
    public final AtomicLong n;
    public final AtomicLong o;

    public zz5(gu4 gu4Var, ny8 ny8Var, ny8 ny8Var2) {
        this.a = gu4Var;
        mjg mjgVarA = p90.a(null);
        this.b = mjgVarA;
        mjg mjgVarA2 = p90.a(r66.a);
        this.c = mjgVarA2;
        this.d = e9i.b(0, 0, 7);
        this.e = e9i.b(0, 0, 7);
        this.f = new AtomicLong();
        this.g = new AtomicLong();
        this.h = e9i.T(new r07(new jz(mjgVarA, 13), mjgVarA2, new ud9(3, (lq4) null, 17), 0), ((n0c) ((xhh) ny8Var.getValue())).a());
        this.i = ny8Var2;
        this.j = rx8.P(3, new s35(12));
        this.k = p90.a(null);
        mjg mjgVarA3 = p90.a(null);
        this.l = mjgVarA3;
        this.n = new AtomicLong();
        this.o = new AtomicLong();
        e9i.j0(e9i.T(new fz6(mjgVarA3, new ke3(this, (lq4) null, 25), 3), ((n0c) ((xhh) ny8Var.getValue())).a()), gu4Var);
    }

    public abstract void a(int i);

    public abstract void b();

    public final b06 c() {
        return (b06) this.j.getValue();
    }

    public abstract boolean d();

    public abstract long e();

    public final rz5 f() {
        return (rz5) this.i.getValue();
    }

    public abstract void g(int i);

    public abstract Object h(String str, RectF rectF, nq4 nq4Var);

    public boolean i(long j, boolean z) {
        return true;
    }

    public abstract sbi j();

    public abstract void k();

    public abstract void l();

    public abstract Object m(nq4 nq4Var);

    public abstract void n(int i, String str);
}
