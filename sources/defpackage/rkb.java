package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rkb {
    public final ny8 a;
    public final ny8 b;

    public rkb(ny8 ny8Var, ny8 ny8Var2) {
        this.a = ny8Var;
        this.b = ny8Var2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(pkb pkbVar, nq4 nq4Var) {
        qkb qkbVar;
        if (nq4Var instanceof qkb) {
            qkbVar = (qkb) nq4Var;
            int i = qkbVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                qkbVar.g = i - Integer.MIN_VALUE;
            } else {
                qkbVar = new qkb(this, nq4Var);
            }
        } else {
            qkbVar = new qkb(this, nq4Var);
        }
        Object obj = qkbVar.e;
        hu4 hu4Var = hu4.a;
        int i2 = qkbVar.g;
        if (i2 == 0) {
            ch3.d0(obj);
            String name = rkb.class.getName();
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, "onNotifProfile: response = " + pkbVar.c, null);
                }
            }
            utd utdVar = (utd) this.a.getValue();
            ujd ujdVar = pkbVar.c;
            qkbVar.d = pkbVar;
            qkbVar.g = 1;
            if (utdVar.d(ujdVar, null, qkbVar) == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            pkbVar = qkbVar.d;
            ch3.d0(obj);
        }
        ((bl8) this.b.getValue()).a(c0a.s(pkbVar.c.a.a));
        return sbi.a;
    }
}
