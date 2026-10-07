package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cm7 {
    public final xhh a;
    public final String b = cm7.class.getName();
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;

    public cm7(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, xhh xhhVar) {
        this.a = xhhVar;
        this.c = ny8Var;
        this.d = ny8Var2;
        this.e = ny8Var3;
        this.f = ny8Var4;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(cm7 cm7Var, long j, long[] jArr, nq4 nq4Var) {
        bm7 bm7Var;
        if (nq4Var instanceof bm7) {
            bm7Var = (bm7) nq4Var;
            int i = bm7Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                bm7Var.f = i - Integer.MIN_VALUE;
            } else {
                bm7Var = new bm7(cm7Var, nq4Var);
            }
        } else {
            bm7Var = new bm7(cm7Var, nq4Var);
        }
        Object objG = bm7Var.d;
        int i2 = bm7Var.f;
        if (i2 == 0) {
            ch3.d0(objG);
            sih sihVar = (sih) cm7Var.c.getValue();
            h3b h3bVar = new h3b(j, jArr);
            bm7Var.f = 1;
            objG = sihVar.a.g(h3bVar, bm7Var);
            hu4 hu4Var = hu4.a;
            if (objG == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objG);
        }
        return ((q3b) objG).d;
    }
}
