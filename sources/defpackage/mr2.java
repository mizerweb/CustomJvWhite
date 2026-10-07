package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class mr2 implements ig7 {
    public final vt4 a;
    public final int b;
    public final int c;

    public mr2(vt4 vt4Var, int i, int i2) {
        this.a = vt4Var;
        this.b = i;
        this.c = i2;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0014  */
    @Override // defpackage.ig7
    public final xx6 b(vt4 vt4Var, int i, int i2) {
        vt4 vt4Var2 = this.a;
        vt4 vt4VarU0 = vt4Var.u0(vt4Var2);
        int i3 = this.c;
        int i4 = this.b;
        if (i2 == 1) {
            if (i4 != -3) {
                if (i == -3) {
                    i = i4;
                } else if (i4 != -2) {
                    if (i == -2) {
                        i = i4;
                    } else {
                        i += i4;
                        if (i < 0) {
                            i = Integer.MAX_VALUE;
                        }
                    }
                }
            }
            i2 = i3;
        }
        return (cqk.d(vt4VarU0, vt4Var2) && i == i4 && i2 == i3) ? this : g(vt4VarU0, i, i2);
    }

    @Override // defpackage.xx6
    public Object collect(yx6 yx6Var, lq4 lq4Var) {
        Object objK = cqk.k(new gz(yx6Var, this, (lq4) null, 2), lq4Var);
        return objK == hu4.a ? objK : sbi.a;
    }

    public String e() {
        return null;
    }

    public abstract Object f(njd njdVar, lq4 lq4Var);

    public abstract mr2 g(vt4 vt4Var, int i, int i2);

    public xx6 i() {
        return null;
    }

    public hr2 j(gu4 gu4Var) {
        int i = this.b;
        if (i == -3) {
            i = -2;
        }
        qf7 qobVar = new qob(this, (lq4) null, 11);
        njd njdVar = new njd(n1g.M(gu4Var, this.a), yab.b(i, this.c, null, 4));
        njdVar.m0(3, njdVar, qobVar);
        return njdVar;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strE = e();
        if (strE != null) {
            arrayList.add(strE);
        }
        k66 k66Var = k66.a;
        vt4 vt4Var = this.a;
        if (vt4Var != k66Var) {
            arrayList.add("context=" + vt4Var);
        }
        int i = this.b;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        int i2 = this.c;
        if (i2 != 1) {
            arrayList.add("onBufferOverflow=".concat(qt4.G(i2)));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return x05.i(sb, ww3.z1(arrayList, ", ", null, null, null, 62), ']');
    }
}
