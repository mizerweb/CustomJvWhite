package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ssg {
    public final ny8 a;

    public ssg(ny8 ny8Var) {
        this.a = ny8Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long[] jArr, nq4 nq4Var) {
        qsg qsgVar;
        if (nq4Var instanceof qsg) {
            qsgVar = (qsg) nq4Var;
            int i = qsgVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                qsgVar.f = i - Integer.MIN_VALUE;
            } else {
                qsgVar = new qsg(this, nq4Var);
            }
        } else {
            qsgVar = new qsg(this, nq4Var);
        }
        Object objD = qsgVar.d;
        int i2 = qsgVar.f;
        if (i2 == 0) {
            ch3.d0(objD);
            pvb pvbVarC = c();
            h3b h3bVar = new h3b(jArr);
            qsgVar.f = 1;
            objD = pvbVarC.D(h3bVar, qsgVar);
            hu4 hu4Var = hu4.a;
            if (objD == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objD);
        }
        if (objD instanceof yqg) {
            return (yqg) objD;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(long j, int i, nq4 nq4Var) {
        rsg rsgVar;
        if (nq4Var instanceof rsg) {
            rsgVar = (rsg) nq4Var;
            int i2 = rsgVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rsgVar.f = i2 - Integer.MIN_VALUE;
            } else {
                rsgVar = new rsg(this, nq4Var);
            }
        } else {
            rsgVar = new rsg(this, nq4Var);
        }
        Object objD = rsgVar.d;
        int i3 = rsgVar.f;
        if (i3 == 0) {
            ch3.d0(objD);
            pvb pvbVarC = c();
            h3b h3bVar = new h3b(j, i);
            rsgVar.f = 1;
            objD = pvbVarC.D(h3bVar, rsgVar);
            hu4 hu4Var = hu4.a;
            if (objD == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i3 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objD);
        }
        if (objD instanceof frg) {
            return (frg) objD;
        }
        return null;
    }

    public final pvb c() {
        return (pvb) this.a.getValue();
    }
}
