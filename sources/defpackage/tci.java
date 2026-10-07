package defpackage;

import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class tci {
    public final xn3 a;
    public final et3 b;
    public final jz c;

    public tci(xn3 xn3Var, et3 et3Var, gq0 gq0Var, xhh xhhVar) {
        this.a = xn3Var;
        this.b = et3Var;
        dq4 dq4VarA = cqk.a(((n0c) xhhVar).a().R0(1, "bottom-bar-counters"));
        j3 j3VarD = gq0Var.d();
        ghb ghbVar = ew5.b;
        lq4 lq4Var = null;
        this.c = new jz(e9i.G0(new fz6(e9i.k0(tre.G0(j3VarD, qe7.O(1, lw5.SECONDS)), new t7f(this, lq4Var, 7)), new gz(this, lq4Var, 18)), dq4VarA, new nig(0L), null), 13);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(tci tciVar, nq4 nq4Var) {
        sci sciVar;
        if (nq4Var instanceof sci) {
            sciVar = (sci) nq4Var;
            int i = sciVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                sciVar.f = i - Integer.MIN_VALUE;
            } else {
                sciVar = new sci(tciVar, nq4Var);
            }
        } else {
            sciVar = new sci(tciVar, nq4Var);
        }
        Object objJ = sciVar.d;
        int i2 = sciVar.f;
        if (i2 == 0) {
            ch3.d0(objJ);
            xn3 xn3Var = tciVar.a;
            sciVar.f = 1;
            objJ = xn3Var.j().J(null);
            Object obj = hu4.a;
            if (objJ == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objJ);
        }
        Iterable<rt2> iterable = (Iterable) objJ;
        int i3 = 0;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            for (rt2 rt2Var : iterable) {
                if (rt2Var.b.m > 0 && !rt2Var.s0(tciVar.b) && (i3 = i3 + 1) < 0) {
                    xw3.U0();
                    throw null;
                }
            }
        }
        return new ou4(i3);
    }
}
