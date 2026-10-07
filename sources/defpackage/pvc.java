package defpackage;

import android.content.res.Resources;

/* JADX INFO: loaded from: classes2.dex */
public final class pvc {
    public static final /* synthetic */ zv8[] f;
    public final Resources a;
    public final ovc b;
    public final gu4 c;
    public final ny8 d;
    public final p3c e = qyj.S();

    static {
        z8b z8bVar = new z8b(pvc.class, "loadJob", "getLoadJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        f = new zv8[]{z8bVar};
    }

    public pvc(Resources resources, ovc ovcVar, v09 v09Var, ny8 ny8Var) {
        this.a = resources;
        this.b = ovcVar;
        this.c = v09Var;
        this.d = ny8Var;
    }

    public final void a(c36 c36Var, y26 y26Var, boolean z) {
        sgg sggVarH0 = yab.h0(this.c, ((n0c) ((xhh) this.d.getValue())).c(), 2, new ihc(this, c36Var, y26Var, z, (lq4) null));
        this.e.B(this, f[0], sggVarH0);
    }
}
