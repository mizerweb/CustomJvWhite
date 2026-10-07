package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class t40 {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;

    public t40(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9, ny8 ny8Var10) {
        this.a = ny8Var2;
        this.b = ny8Var;
        this.c = ny8Var3;
        this.d = ny8Var4;
        this.e = ny8Var6;
        this.f = ny8Var5;
        this.g = ny8Var7;
        this.h = ny8Var8;
        this.i = ny8Var9;
        this.j = ny8Var10;
    }

    public static Object b(t40 t40Var, sfa sfaVar, boolean z, Long l, int i, nq4 nq4Var, int i2) {
        boolean z2 = (i2 & 2) != 0 ? false : z;
        if ((i2 & 4) != 0) {
            l = null;
        }
        return yab.K0(((n0c) ((xhh) t40Var.d.getValue())).b(), new s40(t40Var, sfaVar, (i2 & 8) != 0 ? 0 : i, l, z2, null), nq4Var);
    }

    public final Context a() {
        return (Context) this.f.getValue();
    }
}
