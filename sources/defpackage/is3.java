package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class is3 {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;

    public is3(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(nq4 nq4Var) throws Throwable {
        hs3 hs3Var;
        String str;
        long j;
        if (nq4Var instanceof hs3) {
            hs3Var = (hs3) nq4Var;
            int i = hs3Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                hs3Var.h = i - Integer.MIN_VALUE;
            } else {
                hs3Var = new hs3(this, nq4Var);
            }
        } else {
            hs3Var = new hs3(this, nq4Var);
        }
        Object obj = hs3Var.f;
        int i2 = hs3Var.h;
        ny8 ny8Var = this.b;
        ny8 ny8Var2 = this.a;
        sbi sbiVar = sbi.a;
        if (i2 == 0) {
            ch3.d0(obj);
            String strC = ((svb) ny8Var2.getValue()).c();
            long jT = ((s7f) ((et3) ny8Var.getValue())).t();
            if (strC == null || strC.length() == 0 || jT == -1) {
                gm0.Y(is3.class.getName(), "Early return in execute cuz of token.isNullOrEmpty() || userId == ClientPrefs.NO_USER");
                return sbiVar;
            }
            zg9 zg9Var = (zg9) this.c.getValue();
            hs3Var.d = strC;
            hs3Var.e = jT;
            hs3Var.h = 1;
            Object objA = zg9Var.a(hs3Var);
            hu4 hu4Var = hu4.a;
            if (objA == hu4Var) {
                return hu4Var;
            }
            str = strC;
            j = jT;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = hs3Var.e;
            str = hs3Var.d;
            ch3.d0(obj);
        }
        ((s7f) ((et3) ny8Var.getValue())).N(j);
        ((svb) ny8Var2.getValue()).e(str);
        return sbiVar;
    }
}
