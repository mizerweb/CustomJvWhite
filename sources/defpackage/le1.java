package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class le1 implements yx6 {
    public int a;
    public final /* synthetic */ yx6 b;
    public final /* synthetic */ pe1 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Integer e;

    public le1(yx6 yx6Var, pe1 pe1Var, long j, Integer num) {
        this.c = pe1Var;
        this.d = j;
        this.e = num;
        this.b = yx6Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.yx6
    public final Object emit(Object obj, lq4 lq4Var) {
        ke1 ke1Var;
        if (lq4Var instanceof ke1) {
            ke1Var = (ke1) lq4Var;
            int i = ke1Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ke1Var.e = i - Integer.MIN_VALUE;
            } else {
                ke1Var = new ke1(this, lq4Var);
            }
        } else {
            ke1Var = new ke1(this, lq4Var);
        }
        Object obj2 = ke1Var.d;
        int i2 = ke1Var.e;
        if (i2 == 0) {
            ch3.d0(obj2);
            int i3 = this.a;
            this.a = i3 + 1;
            if (i3 < 0) {
                throw new ArithmeticException("Index overflow has happened");
            }
            if (i3 == 0) {
                rt2 rt2Var = (rt2) obj;
                int iB = rt2Var.b.b();
                Integer num = this.e;
                int iIntValue = num != null ? num.intValue() : rt2Var.b.b();
                pe1 pe1Var = this.c;
                Object objI = ((e5d) pe1Var.m.getValue()).H1.a(e5d.S6[136]).i();
                if (!((y63) objI).c) {
                    objI = null;
                }
                y63 y63Var = (y63) objI;
                if (y63Var != null && iIntValue >= y63Var.b) {
                    pe1Var.t.B(pe1Var, pe1.u[1], yab.i0(pe1Var.a, null, 0, new he1(pe1Var, this.d, iB, y63Var, null), 3));
                }
            }
            ke1Var.e = 1;
            Object objEmit = this.b.emit(obj, ke1Var);
            hu4 hu4Var = hu4.a;
            if (objEmit == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj2);
        }
        return sbi.a;
    }
}
