package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class tnb {
    public final rre a;
    public final ig0 b = new ig0(9);

    public tnb(rre rreVar) {
        this.a = rreVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object b(tnb tnbVar, xmb xmbVar, nq4 nq4Var) {
        snb snbVar;
        if (nq4Var instanceof snb) {
            snbVar = (snb) nq4Var;
            int i = snbVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                snbVar.h = i - Integer.MIN_VALUE;
            } else {
                snbVar = new snb(tnbVar, nq4Var);
            }
        } else {
            snbVar = new snb(tnbVar, nq4Var);
        }
        Object objI = snbVar.f;
        int i2 = snbVar.h;
        if (i2 == 0) {
            ch3.d0(objI);
            long j = xmbVar.a().a;
            long j2 = xmbVar.a().b;
            snbVar.d = tnbVar;
            snbVar.e = xmbVar;
            snbVar.h = 1;
            objI = ch3.I(snbVar, tnbVar.a, true, false, new x14(11, j, j2));
            hu4 hu4Var = hu4.a;
            if (objI == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xmbVar = snbVar.e;
            tnbVar = snbVar.d;
            ch3.d0(objI);
        }
        xmb xmbVar2 = (xmb) objI;
        if (xmbVar2 == null || (xmbVar2.b() != xmbVar.b() && xmbVar2.b() <= xmbVar.b())) {
            ch3.G(tnbVar.a, false, true, new iaa(tnbVar, 19, xmbVar));
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public final Object a(List list, nq4 nq4Var) {
        return ch3.I(nq4Var, this.a, true, false, new yn6(1, nbh.x(") AND post_id = 0", nbh.C("SELECT * FROM notifications_read_marks WHERE chat_id IN ("), list), list));
    }
}
