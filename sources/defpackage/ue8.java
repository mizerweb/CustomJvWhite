package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class ue8 implements yx6 {
    public final /* synthetic */ ye8 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ String d;

    public ue8(ye8 ye8Var, boolean z, boolean z2, String str) {
        this.a = ye8Var;
        this.b = z;
        this.c = z2;
        this.d = str;
    }

    @Override // defpackage.yx6
    public final Object emit(Object obj, lq4 lq4Var) {
        Object value;
        Object objA;
        jl jlVar = (jl) obj;
        ye8 ye8Var = this.a;
        mjg mjgVar = ye8Var.h;
        do {
            value = mjgVar.getValue();
            objA = (if8) value;
            gf8 gf8Var = objA instanceof gf8 ? (gf8) objA : null;
            if (gf8Var != null) {
                gf8 gf8Var2 = cqk.d(gf8Var.a, this.d) ? gf8Var : null;
                if (gf8Var2 != null) {
                    objA = gf8.a(gf8Var2, null, null, ye8Var.c(jlVar, this.b, this.c, ye8Var.d()), null, 0, 1015);
                }
            }
        } while (!mjgVar.h(value, objA));
        return sbi.a;
    }
}
