package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class qj9 extends a8j {
    public final boolean c;
    public final Context d;
    public final pma e;
    public final ny8 f;
    public final mjg g;
    public final r8e h;
    public final ic6 i;

    public qj9(ny8 ny8Var, boolean z, Context context, pma pmaVar) {
        this.c = z;
        this.d = context;
        this.e = pmaVar;
        this.f = ny8Var;
        mjg mjgVarA = p90.a(new rj9(1, r66.a));
        this.g = mjgVarA;
        this.h = new r8e(mjgVarA);
        this.i = new ic6(null);
    }

    public static void B(qj9 qj9Var, int i) {
        a8j.t(qj9Var, ((n0c) ((xhh) qj9Var.f.getValue())).a(), new af8(qj9Var, ((rj9) qj9Var.g.getValue()).a, i, (lq4) null), 2);
    }
}
