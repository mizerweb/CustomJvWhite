package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mbi {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;

    public mbi(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, nq4 nq4Var) {
        lbi lbiVar;
        if (nq4Var instanceof lbi) {
            lbiVar = (lbi) nq4Var;
            int i = lbiVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                lbiVar.g = i - Integer.MIN_VALUE;
            } else {
                lbiVar = new lbi(this, nq4Var);
            }
        } else {
            lbiVar = new lbi(this, nq4Var);
        }
        Object obj = lbiVar.e;
        hu4 hu4Var = hu4.a;
        int i2 = lbiVar.g;
        if (i2 == 0) {
            ch3.d0(obj);
            String name = mbi.class.getName();
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.e;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, zo5.j(j, "undo unblock #"), null);
                }
            }
            no4 no4Var = (no4) this.c.getValue();
            ii4 ii4Var = ii4.a;
            lbiVar.d = j;
            lbiVar.g = 1;
            if (no4Var.d(j, ii4Var, lbiVar) == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = lbiVar.d;
            ch3.d0(obj);
        }
        ((whh) this.a.getValue()).f(c0a.s(j));
        ((ij4) this.b.getValue()).a(j);
        return sbi.a;
    }
}
