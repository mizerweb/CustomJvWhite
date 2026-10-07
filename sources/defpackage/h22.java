package defpackage;

import java.util.function.LongSupplier;

/* JADX INFO: loaded from: classes2.dex */
public final class h22 {
    public final LongSupplier a = new lu1(1);
    public final ny8 b;
    public final mjg c;
    public final r8e d;
    public sgg e;
    public boolean f;
    public boolean g;

    public h22(ny8 ny8Var) {
        this.b = ny8Var;
        mjg mjgVarA = p90.a(0L);
        this.c = mjgVarA;
        this.d = new r8e(mjgVarA);
    }

    public final boolean a() {
        sgg sggVar;
        return this.f || this.g || ((sggVar = this.e) != null && sggVar.isActive());
    }

    public final void b(long j) {
        sgg sggVar = this.e;
        lq4 lq4Var = null;
        if (sggVar != null) {
            sggVar.b(null);
        }
        this.e = yab.i0((wmi) this.b.getValue(), null, 0, new i20(j, this, lq4Var, 4), 3);
    }
}
