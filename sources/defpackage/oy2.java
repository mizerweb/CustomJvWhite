package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class oy2 extends x23 {
    public static final /* synthetic */ zv8[] w;
    public h50 u;
    public final p3c v;

    static {
        z8b z8bVar = new z8b(oy2.class, "updateJob", "getUpdateJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        w = new zv8[]{z8bVar};
    }

    public oy2(Context context) {
        super(new u23(context));
        this.v = qyj.S();
    }

    @Override // defpackage.x23
    public final void H(x7a x7aVar, cf7 cf7Var, qf7 qf7Var) {
        t7a t7aVar = (t7a) x7aVar;
        B(t7aVar);
        super.H(t7aVar, cf7Var, qf7Var);
    }

    @Override // defpackage.s7g
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public final void B(t7a t7aVar) {
        u23 u23Var = (u23) this.a;
        u23Var.setId((int) t7aVar.a);
        u23Var.setTitle(t7aVar.e);
        sgg sggVarI0 = yab.i0(v7j.b(u23Var), null, 2, new dn0(t7aVar, this, u23Var, null, 20), 1);
        this.v.B(this, w[0], sggVarI0);
    }
}
