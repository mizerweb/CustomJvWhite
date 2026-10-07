package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class tgf {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;

    public tgf(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.d = ny8Var4;
        this.e = ny8Var5;
        this.f = ny8Var6;
    }

    public static final hlf a(tgf tgfVar, hlf hlfVar, Long l) {
        return l != null ? hlfVar.b(new ng5(l.longValue(), true)) : hlfVar;
    }

    public final Object b(long j, CharSequence charSequence, List list, boolean z, Long l, q87 q87Var, g4b g4bVar, Long l2, nq4 nq4Var) {
        Object objK0 = yab.K0(((n0c) ((xhh) this.a.getValue())).a(), new sgf(list, z, charSequence, this, j, l, g4bVar, l2, q87Var, null), nq4Var);
        return objK0 == hu4.a ? objK0 : sbi.a;
    }
}
