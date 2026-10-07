package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahf {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;

    public ahf(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.d = ny8Var4;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(azg azgVar, long j, CharSequence charSequence, nq4 nq4Var) {
        zgf zgfVar;
        if (nq4Var instanceof zgf) {
            zgfVar = (zgf) nq4Var;
            int i = zgfVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                zgfVar.i = i - Integer.MIN_VALUE;
            } else {
                zgfVar = new zgf(this, nq4Var);
            }
        } else {
            zgfVar = new zgf(this, nq4Var);
        }
        Object objK0 = zgfVar.g;
        hu4 hu4Var = hu4.a;
        int i2 = zgfVar.i;
        lq4 lq4Var = null;
        if (i2 == 0) {
            ch3.d0(objK0);
            if ((azgVar instanceof xyg) || (azgVar instanceof yyg)) {
                String name = ahf.class.getName();
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.f;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, name, "Cannot send story reply to channel/chat", null);
                    }
                }
                return null;
            }
            if (!(azgVar instanceof zyg)) {
                ore.o();
                return null;
            }
            xt4 xt4VarB = ((n0c) ((xhh) this.d.getValue())).b();
            gce gceVar = new gce(this, azgVar, lq4Var, 15);
            zgfVar.d = (zyg) azgVar;
            zgfVar.e = charSequence;
            zgfVar.f = j;
            zgfVar.i = 1;
            objK0 = yab.K0(xt4VarB, gceVar, zgfVar);
            if (objK0 == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = zgfVar.f;
            charSequence = zgfVar.e;
            azgVar = zgfVar.d;
            ch3.d0(objK0);
        }
        azg azgVar2 = azgVar;
        long j2 = j;
        long j3 = ((rt2) objK0).a;
        ((wzj) this.a.getValue()).c(new plf(new olf(j3, charSequence.toString(), j2, azgVar2, ((xl7) this.c.getValue()).b(charSequence, j3))));
        return new Long(j3);
    }
}
