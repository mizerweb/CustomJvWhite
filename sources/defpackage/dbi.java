package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dbi {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;

    public dbi(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, nq4 nq4Var) {
        cbi cbiVar;
        if (nq4Var instanceof cbi) {
            cbiVar = (cbi) nq4Var;
            int i = cbiVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                cbiVar.g = i - Integer.MIN_VALUE;
            } else {
                cbiVar = new cbi(this, nq4Var);
            }
        } else {
            cbiVar = new cbi(this, nq4Var);
        }
        Object obj = cbiVar.e;
        hu4 hu4Var = hu4.a;
        int i2 = cbiVar.g;
        if (i2 == 0) {
            ch3.d0(obj);
            String name = dbi.class.getName();
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.e;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, zo5.j(j, "undo block #"), null);
                }
            }
            no4 no4Var = (no4) this.c.getValue();
            cbiVar.d = j;
            cbiVar.g = 1;
            if (no4Var.d(j, null, cbiVar) == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = cbiVar.d;
            ch3.d0(obj);
        }
        ((whh) this.a.getValue()).f(c0a.s(j));
        ((ij4) this.b.getValue()).a(j);
        return sbi.a;
    }
}
