package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class q73 {
    public final jz a;
    public final pvb b;
    public final dq4 e;
    public o73 g;
    public long i;
    public long j;
    public int k;
    public String l;
    public String c = null;
    public int d = 0;
    public final ArrayList f = new ArrayList();
    public boolean h = true;

    public q73(jz jzVar, pvb pvbVar, lk9 lk9Var) {
        this.a = jzVar;
        this.b = pvbVar;
        this.e = cqk.a(lvb.x0(wk8.a(), lk9Var.S0()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(nq4 nq4Var) {
        p73 p73Var;
        if (nq4Var instanceof p73) {
            p73Var = (p73) nq4Var;
            int i = p73Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                p73Var.f = i - Integer.MIN_VALUE;
            } else {
                p73Var = new p73(this, nq4Var);
            }
        } else {
            p73Var = new p73(this, nq4Var);
        }
        Object objN = p73Var.d;
        int i2 = p73Var.f;
        if (i2 == 0) {
            ch3.d0(objN);
            p73Var.f = 1;
            objN = e9i.N(this.a, p73Var);
            hu4 hu4Var = hu4.a;
            if (objN == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objN);
        }
        return new Long(((rt2) objN).a);
    }

    public final void b() {
        this.i = 0L;
        this.k = 0;
        this.d = 0;
        this.f.clear();
        this.j = 0L;
        this.c = null;
        this.h = true;
    }
}
