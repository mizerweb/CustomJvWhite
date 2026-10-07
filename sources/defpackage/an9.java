package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class an9 {
    public final ny8 a;
    public final ny8 b;
    public final String c = an9.class.getName();

    public an9(ny8 ny8Var, ny8 ny8Var2) {
        this.a = ny8Var;
        this.b = ny8Var2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, nq4 nq4Var) {
        zm9 zm9Var;
        if (nq4Var instanceof zm9) {
            zm9Var = (zm9) nq4Var;
            int i = zm9Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                zm9Var.g = i - Integer.MIN_VALUE;
            } else {
                zm9Var = new zm9(this, nq4Var);
            }
        } else {
            zm9Var = new zm9(this, nq4Var);
        }
        Object obj = zm9Var.e;
        hu4 hu4Var = hu4.a;
        int i2 = zm9Var.g;
        if (i2 == 0) {
            ch3.d0(obj);
            String str = this.c;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.e;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, zo5.j(j, "execute #"), null);
                }
            }
            no4 no4Var = (no4) this.a.getValue();
            x27 x27Var = new x27(21);
            zm9Var.d = j;
            zm9Var.g = 1;
            if (no4Var.b(j, x27Var, zm9Var) == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = zm9Var.d;
            ch3.d0(obj);
        }
        np4.w((ij4) this.b.getValue(), j);
        ((ij4) this.b.getValue()).a(j);
        return sbi.a;
    }

    public final void b(long j) {
        String str = this.c;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.e;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.j(j, "execute #"), null);
            }
        }
        ((no4) this.a.getValue()).a.b(j, new eo4(0, new x27(20)));
        np4.w((ij4) this.b.getValue(), j);
        ((ij4) this.b.getValue()).a(j);
    }
}
