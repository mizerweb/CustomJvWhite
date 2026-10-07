package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class i0j {
    public final f0j a;

    public i0j(f0j f0jVar) {
        this.a = f0jVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, nq4 nq4Var) {
        h0j h0jVar;
        if (nq4Var instanceof h0j) {
            h0jVar = (h0j) nq4Var;
            int i = h0jVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                h0jVar.f = i - Integer.MIN_VALUE;
            } else {
                h0jVar = new h0j(this, nq4Var);
            }
        } else {
            h0jVar = new h0j(this, nq4Var);
        }
        Object objI = h0jVar.d;
        int i2 = h0jVar.f;
        if (i2 == 0) {
            ch3.d0(objI);
            h0jVar.f = 1;
            objI = ch3.I(h0jVar, this.a.a, true, false, new qo1(str, 18));
            hu4 hu4Var = hu4.a;
            if (objI == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objI);
        }
        g0j g0jVar = (g0j) objI;
        if (g0jVar == null) {
            return null;
        }
        return new e0j(g0jVar.b, g0jVar.a, g0jVar.c);
    }
}
