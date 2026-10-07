package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class iva {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;

    public iva(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.d = ny8Var4;
        this.e = ny8Var5;
    }

    public static /* synthetic */ Object b(iva ivaVar, long j, CharSequence charSequence, g4b g4bVar, Long l, q87 q87Var, ng5 ng5Var, nq4 nq4Var, int i) {
        if ((i & 16) != 0) {
            q87Var = null;
        }
        if ((i & 64) != 0) {
            ng5Var = null;
        }
        return ivaVar.a(j, charSequence, g4bVar, l, q87Var, ng5Var, nq4Var);
    }

    public final Object a(long j, CharSequence charSequence, g4b g4bVar, Long l, q87 q87Var, ng5 ng5Var, nq4 nq4Var) {
        Object objK0 = yab.K0(((n0c) ((xhh) this.a.getValue())).b(), new qt6(this, j, charSequence, l, g4bVar, ng5Var, q87Var, null, 1), nq4Var);
        return objK0 == hu4.a ? objK0 : sbi.a;
    }
}
