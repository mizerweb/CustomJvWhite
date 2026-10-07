package defpackage;

import android.content.Context;
import ru.ok.tamtam.messages.b;

/* JADX INFO: loaded from: classes2.dex */
public final class l6d extends a8j {
    public final long c;
    public final long d;
    public final int e;
    public final et3 f;
    public final Context g;
    public final xn3 h;
    public final sua i;
    public final b j;
    public final p6d k;
    public final mjg l;
    public final r8e m;
    public final int n;
    public final mjg o;
    public final r8e p;
    public final ic6 q;
    public final ic6 r;

    public l6d(long j, long j2, long j3, int i, et3 et3Var, Context context, xn3 xn3Var, sua suaVar, b bVar, xhh xhhVar, fad fadVar) {
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = et3Var;
        this.g = context;
        this.h = xn3Var;
        this.i = suaVar;
        this.j = bVar;
        dq4 dq4Var = this.b;
        h5 h5Var = fadVar.a;
        p6d p6dVar = new p6d(dq4Var, j, j2, j3, i, (xhh) h5Var.c(23), (pvb) h5Var.c(146), h5Var.d(218));
        this.k = p6dVar;
        mjg mjgVarA = p90.a(r66.a);
        this.l = mjgVarA;
        this.m = new r8e(mjgVarA);
        this.n = gm0.K(40.0f * yl5.d().getDisplayMetrics().density);
        mjg mjgVarA2 = p90.a(new h6d(ynh.b, ""));
        this.o = mjgVarA2;
        this.p = new r8e(mjgVarA2);
        this.q = new ic6(null);
        this.r = new ic6(null);
        n0c n0cVar = (n0c) xhhVar;
        a8j.t(this, n0cVar.a(), new l0d(this, (lq4) null, 2), 2);
        int i2 = 3;
        tre.m0(e9i.T(new fz6(new q0d(p6dVar.l, this, 1), new g6d(this, null, 0), i2), n0cVar.a()), this.b);
        tre.m0(e9i.T(new fz6(new ra1(15, new xc3(p6dVar.n, 26)), new g6d(this, null, 1), i2), n0cVar.a()), this.b);
    }
}
